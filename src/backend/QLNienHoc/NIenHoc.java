/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLNienHoc;

/**
 *
 * @author ASUS
 */
public class NIenHoc {

    private int nienKhoa;
    private int nam;

    public NIenHoc(int nienKhoa, int nam) {
        this.nienKhoa = nienKhoa;
        this.nam = nam;
    }

    public int getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(int nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
}
