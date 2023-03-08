
package Nganh;

public class Nganh {
   private String maNganh;
   private String tenNganh;
   private String maKhoa;

    public Nganh() {
    }

    public Nganh(String maNganh, String tenNganh, String maKhoa) {
        this.maNganh = maNganh;
        this.tenNganh = tenNganh;
        this.maKhoa = maKhoa;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    @Override
    public String toString() {
        return "Nganh{" + "maNganh=" + maNganh + ", tenNganh=" + tenNganh + ", maKhoa=" + maKhoa + '}';
    }
   
}
