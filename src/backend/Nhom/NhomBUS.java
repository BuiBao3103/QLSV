/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Nhom;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class NhomBUS {

    private static NhomDAO nhomDAO = new NhomDAO();
    private static ArrayList<Nhom> dsNhom = new ArrayList<>();

    public static void main(String[] args) {
        dsNhom = nhomDAO.get();
    }

    public static void showGroupSuggestions(JTable table) {
        dsNhom = nhomDAO.get();
        DefaultTableModel tblNhom = (DefaultTableModel) table.getModel();
        tblNhom.setRowCount(0);
        int i = 1;
        for (Nhom nhom : dsNhom) {
            Object[] rowData = {i++, nhom.getMaHP(), "abc", nhom.getSoNhom(), 1,
                nhom.getSoLuongSV(), 10, nhom.getThu(), nhom.getTietBD(), 
                nhom.getSoTiet(),nhom.getPhong(), nhom.getMaGV()};
            tblNhom.addRow(rowData);
        }
    }
}
