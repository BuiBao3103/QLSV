/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLSinhVien;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

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
            "MSSV", "Họ Tên", "Mã Ngành", "Niên Khóa"
        });
        
        table.getColumn("MSSV").setMinWidth(150);      
        table.getColumn("MSSV").setMaxWidth(150);
        table.getColumn("Mã Ngành").setMaxWidth(150);
        table.getColumn("Mã Ngành").setMinWidth(150);
        table.getColumn("Niên Khóa").setMaxWidth(200);
        table.getColumn("Niên Khóa").setMinWidth(200);
        
        ArrayList<SinhVien> dssv = new ArrayList();
        dssv = svDAO.get();
        for (SinhVien i: dssv){
            tblSinhVien.addRow(new Object[]{
                i.getMaSV(), i.getHoTen(), i.getMaNganh(), i.getNienKhoa()
            });
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(String.class, centerRenderer);
        table.getColumn("MSSV").setCellRenderer(centerRenderer);
        table.getColumn("Niên Khóa").setCellRenderer(centerRenderer);
        //table.setAutoCreateRowSorter(true); // tự động sắp xếp các dòng      
    }
    
    public static void showMoreInforStudent(JTable table, int position){
        ArrayList<SinhVien> dssv = new ArrayList();
        System.out.println(position);
        dssv = svDAO.get();
        
//        for (SinhVien sv: dssv){
//                System.out.println(sv.toString());
//        }
        SinhVien sv = new SinhVien();
        sv = dssv.get(position);
        System.out.println(sv.toString());
        
    }

    public static void main(String[] args) {
        svDAO.get().forEach(sv->{
            System.out.println(sv.toString());});
        for(SinhVien sv : svDAO.get()){
            
        }
//        svDAO.get();
    }
}
