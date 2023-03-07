package backend.QLNQ_CTQ;

public class NQ_CTQ {

    private String maNhomQuyen;
    private String maQuyen;

    public NQ_CTQ() {
    }

    public NQ_CTQ(String maNhomQuyen, String maQuyen) {
        this.maNhomQuyen = maNhomQuyen;
        this.maQuyen = maQuyen;
    }

    public String getMaNhomQuyen() {
        return maNhomQuyen;
    }

    public void setMaNhomQuyen(String maNhomQuyen) {
        this.maNhomQuyen = maNhomQuyen;
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    @Override
    public String toString() {
        return "NQ_CTQ{" + "maNhomQuyen=" + maNhomQuyen + ", maQuyen=" + maQuyen + '}';
    }

}
