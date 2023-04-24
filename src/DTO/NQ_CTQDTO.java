package DTO;

public class NQ_CTQDTO {

    private String maNhomQuyen;
    private String maQuyen;

    public NQ_CTQDTO() {
    }

    public NQ_CTQDTO(String maNhomQuyen, String maQuyen) {
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
