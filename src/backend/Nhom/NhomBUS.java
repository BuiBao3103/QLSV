/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Nhom;

import backend.QLGiangVien.GiangVienBUS;
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
        DefaultTableModel tblNhom = (DefaultTableModel) table.getModel();
        tblNhom.setRowCount(0);
        int i = 1;
        for (Nhom nhom : dsNhom) {
            String fullnameGV = GiangVienBUS.getGVnameByGVid(nhom.getMaGV());
            String formattedName = GiangVienBUS.formatGVName(fullnameGV);//Trương Tấn Khoa -> T.T.Khoa
            Object[] rowData = {i++, nhom.getMaHP(), "abc", nhom.getSoNhom(), 1,
                nhom.getSoLuongSV(), 10, nhom.getThu().substring(4), nhom.getTietBD(),
                nhom.getSoTiet(), nhom.getPhong(), formattedName};
            tblNhom.addRow(rowData);
        }
    }

    public static void main(String[] args) {
        String fullName = "Aaa Bbb Ccc";
        String formattedName = fullName.replaceAll("(\\B\\w)\\w*\\s?", "$1.");

        System.out.println(formattedName);
    }
}
