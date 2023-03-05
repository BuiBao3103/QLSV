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

    ArrayList<GiangVien> dsgv = new ArrayList<>();
    GiangVienDAO gvDao = new GiangVienDAO();

    public GiangVienBUS() {
    }

    public static void main(String[] args) {
        GiangVienBUS gvBUS = new GiangVienBUS();
        gvBUS.dsgv = gvBUS.gvDao.get();
        gvBUS.dsgv.forEach(gv -> {
            System.out.println(gv.toString());
        });
    }
}
