/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DieuKienDAO;
import DTO.DieuKienDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DieuKienBUS {

    public static DieuKienDAO dkDAO = new DieuKienDAO();
    public static ArrayList<DieuKienDTO> dsDK = dkDAO.get();

    public static String getMaHP(String maHP_truoc) {
        for (DieuKienDTO dk : dsDK) {
            if (dk.getMaHP_truoc().equals(maHP_truoc)) {
                return dk.getMaHP();
            }
        }
        return null;
    }

    public static ArrayList<DieuKienDTO> getDsDK() {
        return dsDK;
    }

    public static void setDsDK(ArrayList<DieuKienDTO> dsDK) {
        DieuKienBUS.dsDK = dsDK;
    }

}
