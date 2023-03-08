package backend.QLTaiKhoan;

public class TaiKhoan {

    private int maTK;
    private String tenTaiKhoan;
    private String matKhau;
    private String maNhomQuyen;

    public TaiKhoan() {
    }

    public TaiKhoan(int maTK, String tenTaiKhoan, String matKhau, String maNhomQuyen) {
        this.maTK = maTK;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.maNhomQuyen = maNhomQuyen;
    }

    public int getMaTK() {
        return maTK;
    }

    public void setMaTK(int maTK) {
        this.maTK = maTK;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getMaNhomQuyen() {
        return maNhomQuyen;
    }

    public void setMaNhomQuyen(String maNhomQuyen) {
        this.maNhomQuyen = maNhomQuyen;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "maTK=" + maTK + ", tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", maNhomQuyen=" + maNhomQuyen + '}';
    }

}
