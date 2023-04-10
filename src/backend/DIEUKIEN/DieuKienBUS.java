/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.DIEUKIEN;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class DieuKienBUS {

    static DieuKienDAO dkDAO = new DieuKienDAO();
    static ArrayList<DieuKien> dsDK = dkDAO.get();

    public static String getMaHP(String maHP_truoc) {
        for (DieuKien dk : dsDK) {
            if (dk.getMaHP_truoc().equals(maHP_truoc)) {
                return dk.getMaHP();
            }
        }
        return null;
    }

    public static ArrayList<DieuKien> getDsDK() {
        return dsDK;
    }

    public static void setDsDK(ArrayList<DieuKien> dsDK) {
        DieuKienBUS.dsDK = dsDK;
    }
    
}
  