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
    
    static ArrayList<GiangVien> dsgv = new ArrayList<>();
    static GiangVienDAO gvDao = new GiangVienDAO();
    
    public GiangVienBUS() {
    }
    
    public static void main(String[] args) {
        dsgv = gvDao.get();
        dsgv.forEach(gv -> {
            System.out.println(gv.toString());
        });
//        GiangVien gvMoi = new GiangVien("11556", "Pham Nguyễn Khắc Huy", "12");
//        gvDao.update("11556", gvMoi);
//        gvDao.delete("11556");
//        gvDao.add(gvMoi);
    }
}
