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

/**
 *
 * @author ASUS
 */
public class SinhVienBUS {

    static SinhVienDAO svDAO=new SinhVienDAO();

    public SinhVienBUS() {
    }
    public static void showStudentList(JTable table){

        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        tblSinhVien.setColumnIdentifiers(new Object[]{  // đặt tên các cột
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
        for (SinhVien i: dssv){
            tblSinhVien.addRow(new Object[]{
                i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
            });
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(String.class, centerRenderer);
        table.getColumn("MSSV").setCellRenderer(centerRenderer);
        table.getColumn("Niên Khóa").setCellRenderer(centerRenderer);
        //table.setAutoCreateRowSorter(true); // tự động sắp xếp các dòng      
    }
    
    public static SinhVien StudentinTable(JTable table, int position){ //hàm này trả về sinh viên ở dòng được chọn
        ArrayList<SinhVien> dssv = new ArrayList();
        dssv = svDAO.get();
        SinhVien sv = new SinhVien();
        sv = dssv.get(position);
        return sv;
    }
    
    public static void showMoreInfoStudent(StudentInfo info,SinhVien sv){
        info.setTxtHoTenSinhVien(sv.getHoTen());
        info.setTxtMSSV(sv.getMaSV());
        info.setTxtCMNDSinhVien(sv.getCmnd());
        info.setTxtNgaySinhSinhVien(sv.getNgaySinh());
        info.setTxtGioiTinhSinhVien(sv.getGioiTinh());
        info.setTxtDiaChiSinhVien(sv.getDiaChi());
        info.setTxtDanTocSinhVien(sv.getDanToc());
        info.setTxtTonGiaoSinhVien(sv.getTonGiao());
        info.setTxtNienKhoaSinhVien(sv.getNienKhoa());
        info.setTxtNganhSinhVien(maNganhToTenNganh(sv.getMaNganh()));
        info.setVisible(true);
    }
    
    public static String maNganhToTenNganh(String maNganh){
        if (maNganh.equals("DCT"))
            return "Công Nghệ Thông Tin (DCT)";
        if (maNganh.equals("DKP"))
            return "Kĩ Thuật Phần Mềm (DKP)";
        if (maNganh.equals("DAN"))
            return "Ngôn Ngữ Anh (DAN)";
        if (maNganh.equals("DSA"))
            return "Sư Phạm Tiếng Anh (DSA)";
        if (maNganh.equals("DQK"))
            return "Quản Trị Kinh Doanh (DQK)";
        if (maNganh.equals("DKQ"))
            return "Kinh Doanh Quốc Tế (DKQ)";
        if (maNganh.equals("DSI"))
            return "Sư Phạm Sinh Học (DSI)";
        if (maNganh.equals("DKH"))
            return "Sư Phạm Khoa Học Tự Nhiên (DKH)";
        if (maNganh.equals("DLI"))
            return "Sư Phạm Vật Lý (DLI)";
        if (maNganh.equals("DHO"))
            return "Sư Phạm Hóa Học (DHO)";
        if (maNganh.equals("DTN"))
            return "Tài Chính Ngân Hàng (DTN)";
        if (maNganh.equals("DKE"))
            return "Kế Toán (DKE)";
        else return "";
    }

    public static void main(String[] args) {
        svDAO.get().forEach(sv->{
            System.out.println(sv.toString());});
        for(SinhVien sv : svDAO.get()){
            
        }
//        svDAO.get();
    }
}
