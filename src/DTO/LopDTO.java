/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author PC
 */
public class LopDTO {
    private String maLop;
    private String maNganh;
    private String maCoVan;
    private int soLuong;

    public LopDTO() {
    }

    public LopDTO(String maLop, String maNganh, String maCoVan, int soLuong) {
        this.maLop = maLop;
        this.maNganh = maNganh;
        this.maCoVan = maCoVan;
        this.soLuong = soLuong;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getMaCoVan() {
        return maCoVan;
    }

    public void setMaCoVan(String maCoVan) {
        this.maCoVan = maCoVan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Lop{" + "maLop=" + maLop + ", maNganh=" + maNganh + ", maCoVan=" + maCoVan + ", soLuong=" + soLuong + '}';
    }
    
}
