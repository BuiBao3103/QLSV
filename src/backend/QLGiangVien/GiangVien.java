/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLGiangVien;

/**
 *
 * @author ASUS
 */
public class GiangVien {

    private String maGV;
    private String tenGV;
    private String maTK;

    public GiangVien() {
    }

    public GiangVien(
            String maGV, String tenGV,
            String maTK
    ) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.maTK = maTK;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGV=" + maGV + ", tenGV=" + tenGV + ", maTK=" + maTK + '}';
    }

}
