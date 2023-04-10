/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLHocPhan;

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

    public static ArrayList<HocPhan> getMonHocTruoc(String maHP) {
        ArrayList<HocPhan> dsMonHocTruoc = new ArrayList<>();
       
        return null;
    }
}
