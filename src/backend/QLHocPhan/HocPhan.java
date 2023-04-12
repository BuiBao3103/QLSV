/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLHocPhan;

/**
 *
 * @author ASUS
 */
public class HocPhan {

    private String maHP;
    private String tenHP;
    private int tinChi;
    private int chuyenBiet;
    private int phanTramQuaTrinh;

    public HocPhan(String maHP, String tenHP, int tinChi, int chuyenBiet, int phanTramQuaTrinh, String maKhoa, String maNganh) {
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.tinChi = tinChi;
        this.chuyenBiet = chuyenBiet;
        this.phanTramQuaTrinh = phanTramQuaTrinh;
        this.maKhoa = maKhoa;
        this.maNganh = maNganh;
    }

    @Override
    public String toString() {
        return "HocPhan{" + "maHP=" + maHP + ", tenHP=" + tenHP + ", tinChi=" + tinChi + ", chuyenBiet=" + chuyenBiet + ", phanTramQuaTrinh=" + phanTramQuaTrinh + ", maKhoa=" + maKhoa + ", maNganh=" + maNganh + '}';
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }

    public int getChuyenBiet() {
        return chuyenBiet;
    }

    public void setChuyenBiet(int chuyenBiet) {
        this.chuyenBiet = chuyenBiet;
    }

    public int getPhanTramQuaTrinh() {
        return phanTramQuaTrinh;
    }

    public void setPhanTramQuaTrinh(int phanTramQuaTrinh) {
        this.phanTramQuaTrinh = phanTramQuaTrinh;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }
    private String maKhoa;
    private String maNganh;
}
