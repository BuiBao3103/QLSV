/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.GiangVienDAO;
import DTO.GiangVienDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class GiangVienBUS {

    public static GiangVienDAO gvDAO = new GiangVienDAO();
    public static ArrayList<GiangVienDTO> dsgv;

    public GiangVienBUS() {
    }

    public static GiangVienDTO getGVnameByGVid(String id) {
        for (GiangVienDTO gv : dsgv) {
            if (gv.getMaGV().equals(id)) {
                return gv;
            }
        }
        return null;
    }

    public static String formatGVName(String name) {
        //Trương Tấn Khoa -> T.T.Khoa
        String[] words = name.split(" ");
        String formatName = "";
        for (int i = 0; i < words.length - 1; i++) {
            formatName += words[i].substring(0, 1) + ".";
        }
        formatName += words[words.length - 1];
        return formatName;
    }

}
