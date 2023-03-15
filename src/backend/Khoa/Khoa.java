
package backend.Khoa;

public class Khoa {
    private String maKhoa;
    private String tenKhoa;
    private String maTK;

    public Khoa() {
    }

    public Khoa(String maKhoa, String tenKhoa, String maTK) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.maTK = maTK;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    @Override
    public String toString() {
        return "Khoa{" + "maKhoa=" + maKhoa + ", tenKhoa=" + tenKhoa + ", maTK=" + maTK + '}';
    }
    
}
