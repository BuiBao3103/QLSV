/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Khoa;

import backend.Nganh.Nganh;
import backend.Nganh.NganhBUS;
import backend.QLSinhVien.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class KhoaBUS {
    
    static KhoaDAO khoaDAO = new KhoaDAO();
    static ArrayList<Khoa> dsKhoa = khoaDAO.get();
    
    public static Khoa getKhoaByID(String maKhoa) {
        for (Khoa k : dsKhoa) {
            if (k.getMaKhoa().equals(maKhoa)) {
                return k;
            }
        }
        return null;
    }
    
    public static Khoa getKhoaByNganhID(String maNganh) {
        Nganh nganhSV = NganhBUS.getNganhByID(maNganh);
        return getKhoaByID(nganhSV.getMaKhoa());
    }
}
