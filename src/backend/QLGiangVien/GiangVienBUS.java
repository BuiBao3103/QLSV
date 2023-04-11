/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLGiangVien;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class GiangVienBUS {

    static GiangVienDAO gvDAO = new GiangVienDAO();
    static ArrayList<GiangVien> dsgv = gvDAO.get();

    public GiangVienBUS() {
    }

    public static GiangVien getGVnameByGVid(String id) {
        for (GiangVien gv : dsgv) {
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
