/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.HocPhanDAO;
import DTO.HocPhanDTO;
import DTO.DieuKienDTO;
import BUS.DieuKienBUS;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class HocPhanBUS {

    public static HocPhanDAO hpDAO = new HocPhanDAO();
    public static ArrayList<HocPhanDTO> dshp = hpDAO.get();

    public static String getHPnameByHPid(String id) {
        for (HocPhanDTO hp : dshp) {
            if (hp.getMaHP().equals(id)) {
                return hp.getTenHP();
            }
        }
        return null;
    }

    public static HocPhanDTO getHocPhanByID(String maHP) {
        for (HocPhanDTO hp : dshp) {
            if (hp.getMaHP().equals(maHP)) {
                return hp;
            }
        }
        return null;
    }

    public static ArrayList<String> getMonHocTruoc(String maHP) {

        ArrayList<String> dsMonHocTruoc = new ArrayList<>();
        for (DieuKienDTO dk : DieuKienBUS.getDsDK()) {
            if (dk.getMaHP().equals(maHP)) {
                dsMonHocTruoc.add(dk.getMaHP_truoc());
            }
        }
        return dsMonHocTruoc;
    }
}
