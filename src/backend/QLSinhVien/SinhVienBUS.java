/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLSinhVien;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import frontend.StudentInfo;
import java.awt.Font;

/**
 *
 * @author ASUS
 */
public class SinhVienBUS {

    static SinhVienDAO svDAO = new SinhVienDAO();

    public SinhVienBUS() {
    }

    public static void showStudentList(JTable table) {

        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        tblSinhVien.setColumnCount(0); // xóa hết để cái bảng trống rồi mới thêm dữ liệu zo
        tblSinhVien.setColumnIdentifiers(new Object[]{ // đặt tên các cột
            "MSSV", "Họ Tên", "Ngành", "Niên Khóa"
        });

        table.getColumn("MSSV").setMinWidth(150);
        table.getColumn("MSSV").setMaxWidth(150);
        table.getColumn("Ngành").setMaxWidth(350);
        table.getColumn("Ngành").setMinWidth(350);
        table.getColumn("Niên Khóa").setMaxWidth(100);
        table.getColumn("Niên Khóa").setMinWidth(100);

        ArrayList<SinhVien> dssv = new ArrayList();
        dssv = svDAO.get();
        for (SinhVien i : dssv) {
            tblSinhVien.addRow(new Object[]{
                i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
            });
        }

        //--------------------Khúc này chỉnh các thuộc tính cho cái bảng -----------------------------------------------------
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(String.class, centerRenderer);
        table.getColumn("MSSV").setCellRenderer(centerRenderer);
        table.getColumn("Niên Khóa").setCellRenderer(centerRenderer);
        table.getColumn("Họ Tên").setCellRenderer(centerRenderer);
        table.getColumn("Ngành").setCellRenderer(centerRenderer);
        table.getTableHeader().setDefaultRenderer(centerRenderer);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(35);
        table.setRowMargin(10);
        table.setFont(new java.awt.Font("Segoe UI", 0, 16));
        table.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

    }

    public static SinhVien StudentinTable(JTable table, int position) { //hàm này trả về sinh viên ở dòng được chọn trong bảng
        ArrayList<SinhVien> dssv = new ArrayList();
        dssv = svDAO.get();
        SinhVien sv = new SinhVien();
        sv = dssv.get(position);
        return sv;
    }

    public static void showMoreInfoStudent(StudentInfo info, SinhVien sv) {
        if (!info.isVisible()) { // cái này kiểm tra xem có mở cửa sổ thông tin sinh viên chưa
            info.setVisible(true);
        }
        info.setTxtHoTenSinhVien(sv.getHoTen());
        info.setTxtMSSV(sv.getMaSV());
        info.setTxtCMNDSinhVien(sv.getCmnd());
        info.setTxtSoDienThoaiSinhVien(sv.getSoDienThoai());
        info.setTxtNgaySinhSinhVien(sv.getNgaySinh());
        info.setTxtGioiTinhSinhVien(sv.getGioiTinh());
        info.setTxtDiaChiSinhVien(sv.getDiaChi());
        info.setTxtDanTocSinhVien(sv.getDanToc());
        info.setTxtTonGiaoSinhVien(sv.getTonGiao());
        info.setTxtNienKhoaSinhVien(sv.getNienKhoa());
        info.setTxtNganhSinhVien(maNganhToTenNganh(sv.getMaNganh()));
        info.setTxtMaTKSinhVien(sv.getMaTK());

    }

    public static String maNganhToTenNganh(String maNganh) { // cái hàm này trả về tên ngành từ mã ngành
        if (maNganh.equals("DCT")) {
            return "Công Nghệ Thông Tin (DCT)";
        }
        if (maNganh.equals("DKP")) {
            return "Kĩ Thuật Phần Mềm (DKP)";
        }
        if (maNganh.equals("DAN")) {
            return "Ngôn Ngữ Anh (DAN)";
        }
        if (maNganh.equals("DSA")) {
            return "Sư Phạm Tiếng Anh (DSA)";
        }
        if (maNganh.equals("DQK")) {
            return "Quản Trị Kinh Doanh (DQK)";
        }
        if (maNganh.equals("DKQ")) {
            return "Kinh Doanh Quốc Tế (DKQ)";
        }
        if (maNganh.equals("DSI")) {
            return "Sư Phạm Sinh Học (DSI)";
        }
        if (maNganh.equals("DKH")) {
            return "Sư Phạm Khoa Học Tự Nhiên (DKH)";
        }
        if (maNganh.equals("DLI")) {
            return "Sư Phạm Vật Lý (DLI)";
        }
        if (maNganh.equals("DHO")) {
            return "Sư Phạm Hóa Học (DHO)";
        }
        if (maNganh.equals("DTN")) {
            return "Tài Chính Ngân Hàng (DTN)";
        }
        if (maNganh.equals("DKE")) {
            return "Kế Toán (DKE)";
        } else {
            return "";
        }
    }
 public int getTrangThai(int MaTK){
       return svDAO.getTrangThaiByMaTk(MaTK);
   }
    public static void main(String[] args) {
        svDAO.get().forEach(sv -> {
            System.out.println(sv.toString());
        });
        for (SinhVien sv : svDAO.get()) {

        }
//        svDAO.get();
    }
}
