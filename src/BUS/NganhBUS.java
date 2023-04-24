/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NganhDAO;
import DTO.NganhDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class NganhBUS {

    static NganhDAO nganhDAO = new NganhDAO();
    static ArrayList<NganhDTO> dsNganh = nganhDAO.get();

    public static NganhDTO getNganhByID(String maNganh) {
        for (NganhDTO n : dsNganh) {
            if (n.getMaNganh().equals(maNganh)) {
                return n;
            }
        }
        return null;
    }

    public static NganhDAO getNganhDAO() {
        return nganhDAO;
    }

    public static void setNganhDAO(NganhDAO nganhDAO) {
        NganhBUS.nganhDAO = nganhDAO;
    }

    public static ArrayList<NganhDTO> getDsNganh() {
        return dsNganh;
    }

    public static void setDsNganh(ArrayList<NganhDTO> dsNganh) {
        NganhBUS.dsNganh = dsNganh;
    }
}
