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
import backend.QLHocPhan.HocPhanDAO;
import backend.QLNienHoc.NienHoc;
import backend.QLNienHoc.NienHocDAO;
import backend.QLSinhVien.SinhVien;
import backend.QLSinhVien.SinhVienBUS;
import backend.QLSinhVien.SinhVienDAO;
import backend.QLTaiKhoan.TaiKhoanBUS;
import com.sun.java.accessibility.util.GUIInitializedListener;
import frontend.Schedule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class NhomBUS {

    static NhomDAO nhomDAO = new NhomDAO();
    static ArrayList<Nhom> dsNhom = nhomDAO.get();
    static SinhVienDAO svDAO = new SinhVienDAO();
    static HocPhanDAO hpDAO = new HocPhanDAO();

    private Date today = new Date();
    private SimpleDateFormat month = new SimpleDateFormat("MM");
    private SimpleDateFormat year = new SimpleDateFormat("yyyy");

    private static ArrayList<Nhom> dsNhomDaHoc = nhomDAO.getBySinhVien(); // lấy các học phần sv đang đăng nhập đã học

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

    public static boolean checkPreviousHocPhan(String maHP) {
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

    public static boolean checkSvKhoaNganh(String maHP) {
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

    public static void filterGroup(String monHoc, JTable table) {
        boolean found = false;
        ArrayList<KetQua> dskq = (new KetQuaDAO()).get(2, 2022);
        DefaultTableModel tblNhom = (DefaultTableModel) table.getModel();
        tblNhom.setRowCount(0);
        int i = 1;
        for (Nhom nhom : dsNhom) {
            String nameHP = HocPhanBUS.getHPnameByHPid(nhom.getMaHP());
            //filter by name or id HP
            if (!nhom.getMaHP().toLowerCase().contains(monHoc.toLowerCase())
                    && !nameHP.toLowerCase().contains(monHoc.toLowerCase())) {
                continue;
            }
            found = true;
            //Get data GiangVien
            String fullnameGV = GiangVienBUS.getGVnameByGVid(nhom.getMaGV()).getTenGV();
            String formattedName = GiangVienBUS.formatGVName(fullnameGV);//Trương Tấn Khoa -> T.T.Khoa
            //Get data HocPhan
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
        if (!found) {
            JOptionPane.showMessageDialog(null, "Không tim thấy môn học nào!", "Kết quả lọc", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // ------ các hàm thao tác với tkb -------------------
    public static void formatTable(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static void showTKB(Schedule schedule) {
        JTable table = schedule.getTblSchedule();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        formatTable(table);
        int hocKy;
        int nam;
        try {
            String hocKyDaChon = schedule.getCbChonHocKy().getSelectedItem().toString();
            hocKy = Integer.parseInt(hocKyDaChon.split(" ")[0]); // lấy học kì đã chọn trong combobox
            nam = Integer.parseInt(hocKyDaChon.split(" ")[1]); // lấy năm đã chọn trong combobox
        } catch (Exception e) {
            return;
        }
        for (Nhom nh : dsNhomDaHoc) {
            if (nh.getHocKy() == hocKy && nh.getNam() == nam) {
                HocPhan hp = hpDAO.getByMaHP(nh.getMaHP()); // cái này lấy ra học phần của nhóm đó để có tên hp, số tchi ...
                tableModel.addRow(new Object[]{
                    nh.getMaHP(), hp.getTenHP(), nh.getSoNhom(), hp.getTinChi(), nh.getThu(), nh.getTietBD(), nh.getSoTiet(), nh.getPhong()
                });
            }
        }
        table.setModel(tableModel);
    }

    public static ArrayList<SinhVien> getDSSVFromSelectedRow(Schedule schedule) { // hàm này lấy dssv từ học phần đang chọn
        int selectedRow = schedule.getTblSchedule().getSelectedRow();
        JTable tblSchedule = schedule.getTblSchedule();
        String maHpDuocChon = tblSchedule.getValueAt(selectedRow, 0).toString();
        int nhomDuocChon = Integer.parseInt(tblSchedule.getValueAt(selectedRow, 2).toString());

        ArrayList<String> dsMaSV = new KetQuaDAO().getDsMaSV(maHpDuocChon, nhomDuocChon);
        ArrayList<SinhVien> dssv = new ArrayList();
        for (String MaSV : dsMaSV) {
            SinhVien sv = svDAO.getByMaSV(MaSV).get(0);
            dssv.add(sv);
        }
        return dssv;
    }

    public static void showDSSV(Schedule schedule) {
        int selectedRow = schedule.getTblSchedule().getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Chọn môn muốn xem danh sách");
            return;
        }
        ArrayList<SinhVien> dssv = getDSSVFromSelectedRow(schedule); // lấy dssv đang học Hphan nhóm đang chọn

        JTable table = schedule.getTblDSSV();
        schedule.getScpDSSV().setVisible(true);
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        formatTable(table);

        int i = 1;
        for (SinhVien sv : dssv) {
            if (sv.getTrangThai() == 1) {
                tableModel.addRow(new Object[]{
                    i++, sv.getMaSV(), sv.getHoTen(), SinhVienBUS.maNganhToTenNganh(sv.getMaNganh()), sv.getMaLop()
                });
            }
        }
    }

    public static void addItemToCbChonHocKy(Schedule schedule) {
        String maSV = TaiKhoanBUS.curentLogin.getTenTaiKhoan();
        SinhVien sv = svDAO.getByMaSV(maSV).get(0);
        int namVaoHoc = Integer.parseInt(sv.getNienKhoa().split("-")[0]);
        NienHoc hientai = new NienHocDAO().getCurrentNienHoc();

        if (hientai.getHocKi() == 2) {
            schedule.getCbChonHocKy().addItem(2 + " " + hientai.getNam());
            schedule.getCbChonHocKy().addItem(1 + " " + hientai.getNam());
        } else {
            schedule.getCbChonHocKy().addItem(1 + " " + hientai.getNam());
        }
        int i = 1;
        while (namVaoHoc < hientai.getNam()) {
            schedule.getCbChonHocKy().addItem(1 + " " + namVaoHoc);
            schedule.getCbChonHocKy().addItem(2 + " " + namVaoHoc);
            namVaoHoc++;
        }
    }

    public static void main(String[] args) {
//        NhomBUS nBUS = new NhomBUS();
//        System.out.println(nBUS.hocKyHienTai());
    }
}
