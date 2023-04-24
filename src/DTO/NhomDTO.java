
package DTO;

public class NhomDTO {
   private String maHP;
   private int soNhom;
   private int hocKy;
   private int nam;
   private String maGV;
   private String phong;
   private int soLuongSV;
   private String thu;
   private int tietBD;
   private int soTiet;

    public NhomDTO() {
    }

    public NhomDTO(String maHP, int soNhom, int hocKy, int nam, String maGV, String phong, int soLuongSV, String thu, int tietBD, int soTiet) {
        this.maHP = maHP;
        this.soNhom = soNhom;
        this.hocKy = hocKy;
        this.nam = nam;
        this.maGV = maGV;
        this.phong = phong;
        this.soLuongSV = soLuongSV;
        this.thu = thu;
        this.tietBD = tietBD;
        this.soTiet = soTiet;
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

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public int getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(int soLuongSV) {
        this.soLuongSV = soLuongSV;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public int getTietBD() {
        return tietBD;
    }

    public void setTietBD(int tietBD) {
        this.tietBD = tietBD;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    @Override
    public String toString() {
        return "Nhom{" + "maHP=" + maHP + ", soNhom=" + soNhom + ", hocKy=" + hocKy + ", nam=" + nam + ", maGV=" + maGV + ", phong=" + phong + ", soLuongSV=" + soLuongSV + ", thu=" + thu + ", tietBD=" + tietBD + ", soTiet=" + soTiet + '}';
    }
   
}
