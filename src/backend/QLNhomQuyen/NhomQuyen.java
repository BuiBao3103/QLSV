package backend.QLNhomQuyen;

public class NhomQuyen {

    private String maNhomQuyen;
    private String tenNhomQuyen;

    public NhomQuyen() {
    }

    public NhomQuyen(String maNhomQuyen, String tenNhomQuyen) {
        this.maNhomQuyen = maNhomQuyen;
        this.tenNhomQuyen = tenNhomQuyen;
    }

    public String getMaNhomQuyen() {
        return maNhomQuyen;
    }

    public void setMaNhomQuyen(String maNhomQuyen) {
        this.maNhomQuyen = maNhomQuyen;
    }

    public String getTenNhomQuyen() {
        return tenNhomQuyen;
    }

    public void setTenNhomQuyen(String tenNhomQuyen) {
        this.tenNhomQuyen = tenNhomQuyen;
    }

    @Override
    public String toString() {
        return "NhomQuyen{" + "maNhomQuyen=" + maNhomQuyen + ", tenNhomQuyen=" + tenNhomQuyen + '}';
    }

}
