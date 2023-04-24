/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;


public class SinhVienDTO {

    private int trangThai;
    private String maSV;
    private String cmnd;
    private String soDienThoai;
    private String maLop;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String danToc;
    private String tonGiao;
    private String nienKhoa;
    private String maNganh;
    private int maTK;

    @Override
    public String toString() {
        return "SinhVien{" + "trangThai=" + trangThai + ", maSV=" + maSV + ", cmnd=" + cmnd + ", soDienThoai=" + soDienThoai + ", maLop=" + maLop + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", danToc=" + danToc + ", tonGiao=" + tonGiao + ", nienKhoa=" + nienKhoa + ", maNganh=" + maNganh + ", maTK=" + maTK + '}';
    }

    public SinhVienDTO() {
    }

    public SinhVienDTO(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(String nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public int getMaTK() {
        return maTK;
    }

    public void setMaTK(int maTK) {
        this.maTK = maTK;
    }
//
//    public SinhVien(int trangThai, String maSV, String cmnd, String soDienThoai, String hoTen, Date ngaySinh, String gioiTinh, String diaChi, String danToc, String tonGiao, String nienKhoa, String maNganh, int maTK) {
//        this.trangThai = trangThai;
//        this.maSV = maSV;
//        this.cmnd = cmnd;
//        this.soDienThoai = soDienThoai;
//        this.hoTen = hoTen;
//        this.ngaySinh = ngaySinh;
//        this.gioiTinh = gioiTinh;
//        this.diaChi = diaChi;
//        this.danToc = danToc;
//        this.tonGiao = tonGiao;
//        this.nienKhoa = nienKhoa;
//        this.maNganh = maNganh;
//        this.maTK = maTK;
//    }

    public SinhVienDTO(int trangThai, String maSV, String cmnd, String soDienThoai, String maLop, String hoTen, Date ngaySinh, String gioiTinh, String diaChi, String danToc, String tonGiao, String nienKhoa, String maNganh, int maTK) {
        this.trangThai = trangThai;
        this.maSV = maSV;
        this.cmnd = cmnd;
        this.soDienThoai = soDienThoai;
        this.maLop = maLop;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.danToc = danToc;
        this.tonGiao = tonGiao;
        this.nienKhoa = nienKhoa;
        this.maNganh = maNganh;
        this.maTK = maTK;
    }
    

}
