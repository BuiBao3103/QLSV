/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLHocPhan;

import backend.DIEUKIEN.DieuKien;
import backend.DIEUKIEN.DieuKienBUS;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class HocPhanBUS {

    static HocPhanDAO hpDAO = new HocPhanDAO();
    static ArrayList<HocPhan> dshp = hpDAO.get();

    public static String getHPnameByHPid(String id) {
        for (HocPhan hp : dshp) {
            if (hp.getMaHP().equals(id)) {
                return hp.getTenHP();
            }
        }
        return null;
    }

    public static String getHPtcByHPid(String id) {
        for (HocPhan hp : dshp) {
            if (hp.getMaHP().equals(id)) {
                return hp.getTinChi() + "";
            }
        }
        return null;
    }

    public static ArrayList<String> getMonHocTruoc(String maHP) {
        ArrayList<String> dsMonHocTruoc = new ArrayList<>();
        for (DieuKien dk : DieuKienBUS.getDsDK()) {
            if (dk.getMaHP().equals(maHP)) {
                dsMonHocTruoc.add(dk.getMaHP_truoc());
            }
        }
        return dsMonHocTruoc;
    }
}
