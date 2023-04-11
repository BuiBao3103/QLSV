/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Nhom;

import backend.KetQua.KetQua;
import backend.KetQua.KetQuaBUS;
import backend.KetQua.KetQuaDAO;
import backend.Nganh.Nganh;
import backend.Nganh.NganhBUS;
import backend.QLGiangVien.GiangVienBUS;
import backend.QLHocPhan.HocPhan;
import backend.QLHocPhan.HocPhanBUS;
import backend.QLSinhVien.SinhVien;
import backend.QLSinhVien.SinhVienDAO;
import backend.QLTaiKhoan.TaiKhoanBUS;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class NhomBUS {

    private static NhomDAO nhomDAO = new NhomDAO();
    private static ArrayList<Nhom> dsNhom = nhomDAO.get();

    public static void showGroupSuggestions(JTable table) {
        ArrayList<KetQua> dskq = (new KetQuaDAO()).get(2, 2022);
        DefaultTableModel tblNhom = (DefaultTableModel) table.getModel();
        tblNhom.setRowCount(0);
        int i = 1;
        for (Nhom nhom : dsNhom) {
            //Check condition Khoa, Nganh
            if (!checkSvKhoaNganh(nhom.getMaHP())) {
                continue;
            }
            //Check condition hocphan previous
            if (!checkPreviousHocPhan(nhom.getMaHP())) {
                continue;
            }
            //Get data GiangVien
            String fullnameGV = GiangVienBUS.getGVnameByGVid(nhom.getMaGV()).getTenGV();
            String formattedName = GiangVienBUS.formatGVName(fullnameGV);//Trương Tấn Khoa -> T.T.Khoa
            //Get data HocPhan
            String nameHP = HocPhanBUS.getHPnameByHPid(nhom.getMaHP());
            String tcHP = HocPhanBUS.getHPtcByHPid(nhom.getMaHP());
            //handle remaining slot 
            int remainSlot = nhom.getSoLuongSV()
                    - countGroupRegistered(dskq, nhom.getMaHP(), nhom.getSoNhom());
            //Create row data
            Object[] rowData = {i++, nhom.getMaHP(), nameHP, nhom.getSoNhom(), tcHP,
                nhom.getSoLuongSV(), remainSlot, nhom.getThu().substring(4),
                nhom.getTietBD(), nhom.getSoTiet(), nhom.getPhong(), formattedName};
            tblNhom.addRow(rowData);
        }
    }

    public static int countGroupRegistered(ArrayList<KetQua> dskq, String maHP, int soNhom) {
        int cnt = 0;
        for (KetQua kq : dskq) {
            if (kq.getMaHP().equals(maHP) && kq.getSoNhom() == soNhom) {
                cnt++;
            }
        }
        return cnt;
    }

    private static boolean checkPreviousHocPhan(String maHP) {
        ArrayList<String> dsMonHocTruoc = HocPhanBUS.getMonHocTruoc(maHP);
        KetQuaBUS kqBUS = new KetQuaBUS();
        for (String hpt : dsMonHocTruoc) {
            if (kqBUS.isLearned(hpt)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSvKhoaNganh(String maHP) {
        HocPhan hp = HocPhanBUS.getHocPhanByID(maHP);
        SinhVien sv = (new SinhVienDAO()).getByMaSV(TaiKhoanBUS.curentLogin.getTenTaiKhoan()).get(0);
        switch (hp.getChuyenBiet()) {
            case 0 -> {//mon chung cua toan truong
                return true;
            }
            case 1 -> {//mon chung cua khoa
                Nganh nganhSV = NganhBUS.getNganhByID(sv.getMaNganh());
                if (hp.getMaKhoa().equals(nganhSV.getMaKhoa())) {
                    return true;
                }
                return false;
            }
            case 2 -> {//mon rieng cua nganh
                if (hp.getMaNganh().equals(sv.getMaNganh())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
