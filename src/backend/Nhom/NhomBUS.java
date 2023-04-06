/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Nhom;

import backend.KetQua.KetQua;
import backend.KetQua.KetQuaDAO;
import backend.QLGiangVien.GiangVienBUS;
import backend.QLHocPhan.HocPhanBUS;
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
            //Get data GiangVien
            String fullnameGV = GiangVienBUS.getGVnameByGVid(nhom.getMaGV());
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
}
