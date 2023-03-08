/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetQua;


public class KetQua {
    private String maSV;
    private String maHP;
    private int soNhom;
    private int hocKy;
    private int nam;
    private double diemQT;
    private double diemCK;

    public KetQua() {
    }

    public KetQua(String maSV, String maHP, int soNhom, int hocKy, int nam, double diemQT, double diemCK) {
        this.maSV = maSV;
        this.maHP = maHP;
        this.soNhom = soNhom;
        this.hocKy = hocKy;
        this.nam = nam;
        this.diemQT = diemQT;
        this.diemCK = diemCK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public int getSoNhom() {
        return soNhom;
    }

    public void setSoNhom(int soNhom) {
        this.soNhom = soNhom;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(double diemQT) {
        this.diemQT = diemQT;
    }

    public double getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(double diemCK) {
        this.diemCK = diemCK;
    }

    @Override
    public String toString() {
        return "KetQua{" + "maSV=" + maSV + ", maHP=" + maHP + ", soNhom=" + soNhom + ", hocKy=" + hocKy + ", nam=" + nam + ", diemQT=" + diemQT + ", diemCK=" + diemCK + '}';
    }
    
}
