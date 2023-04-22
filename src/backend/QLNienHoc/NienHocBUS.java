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

}
