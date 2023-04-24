/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhoaDAO;
import DTO.KhoaDTO;
import DTO.NganhDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class KhoaBUS {
    
    static KhoaDAO khoaDAO = new KhoaDAO();
    static ArrayList<KhoaDTO> dsKhoa = khoaDAO.get();
    
    public static KhoaDTO getKhoaByID(String maKhoa) {
        for (KhoaDTO k : dsKhoa) {
            if (k.getMaKhoa().equals(maKhoa)) {
                return k;
            }
        }
        return null;
    }
    
    public static KhoaDTO getKhoaByNganhID(String maNganh) {
        NganhDTO nganhSV = NganhBUS.getNganhByID(maNganh);
        return getKhoaByID(nganhSV.getMaKhoa());
    }

    public static ArrayList<KhoaDTO> getDsKhoa() {
        return dsKhoa;
    }

    public static void setDsKhoa(ArrayList<KhoaDTO> dsKhoa) {
        KhoaBUS.dsKhoa = dsKhoa;
    }
}
