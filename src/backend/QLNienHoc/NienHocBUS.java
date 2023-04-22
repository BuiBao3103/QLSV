/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLNienHoc;

/**
 *
 * @author ASUS
 */
public class NienHocBUS {

    static NienHocDAO nhDAO = new NienHocDAO();
    static NienHoc currentNienHoc = nhDAO.getCurrentNienHoc();

    public static NienHocDAO getNhDAO() {
        return nhDAO;
    }

    public static void setNhDAO(NienHocDAO nhDAO) {
        NienHocBUS.nhDAO = nhDAO;
    }

    public static NienHoc getCurrentNienHoc() {
        return currentNienHoc;
    }

    public static void setCurrentNienHoc(NienHoc currentNienHoc) {
        NienHocBUS.currentNienHoc = currentNienHoc;
    }

    public static void updateNienHoc(int hk, int nam) {
        nhDAO.updateCurrentNienHoc(hk, nam);
    }

    public static NienHoc prevNienHoc(NienHoc nh) {
        int hkHienTai = nh.getHocKi();
        int namHienTai = nh.getNam();
        //Nêu hk hiện tại là 1 thì học kì trước là 2 của năm trước
        //Nêu hk hiện tại là 2 thì học kì trước là 1 của năm hiện tại
        int hkTruoc = (hkHienTai == 1) ? 2 : 1;
        int namTruoc = (hkHienTai == 1) ? namHienTai - 1 : namHienTai;
        return new NienHoc(hkTruoc, namTruoc);
    }
}
