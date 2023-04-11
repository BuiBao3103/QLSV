/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.KetQua;

import backend.QLHocPhan.HocPhan;
import backend.QLHocPhan.HocPhanBUS;
import backend.QLTaiKhoan.TaiKhoanBUS;
import frontend.Login;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class KetQuaBUS {

    static KetQuaDAO kqDAO = new KetQuaDAO();

    private ArrayList<KetQua> dsKQSV = getListKQsvFromDB();

    public ArrayList<KetQua> getListKQsvFromDB() {
        if (TaiKhoanBUS.curentLogin.getMaNhomQuyen().equals("Q4")) {
            return kqDAO.get(TaiKhoanBUS.curentLogin.getTenTaiKhoan());
        }
        return null;
    }

    public boolean isLearned(String maHP) {
        for (KetQua kq : dsKQSV) {
            if (kq.getMaHP().equals(maHP)) {
                return true;
            }
        }
        return false;
    }

    public void addRowData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        int stt = 1;
        model.setRowCount(0);
        for (KetQua kq : dsKQSV) {
            HocPhan hp = HocPhanBUS.getHocPhanByID(kq.getMaHP());
            String tenHP = hp.getTenHP();
            int soTC = hp.getTinChi();
            String phanTramQuaTrinh = hp.getPhanTramQuaTrinh() + "%";
            String phanTramThi = (100 - hp.getPhanTramQuaTrinh()) + "%"; // % điểm thi = 100% - %điểm quá trình
            double diemQuaTrinh = kq.getDiemQT();
            double diemCuoiKy = kq.getDiemCK();
            double diemHe10 = DiemHe10(phanTramQuaTrinh, diemQuaTrinh, diemCuoiKy);
            String diemChu = DiemChuHe4(diemHe10);
            model.addRow(new Object[]{
                stt++, kq.getMaHP(), tenHP, soTC, phanTramQuaTrinh,
                phanTramThi, diemQuaTrinh, diemCuoiKy,
                diemHe10, diemChu
            });
        }
    }

    public double DiemHe10(String PhanTramQuaTrinh, double diemQuaTrinh, double diemThi) {
        if (PhanTramQuaTrinh.equals("40%")) {
            return diemQuaTrinh * 0.4 + diemThi * 0.6;
        } else {
            return diemQuaTrinh * 0.5 + diemThi * 0.5;
        }
    }

    public String DiemChuHe4(double diemHe10) {
        if (diemHe10 >= 8.5) {
            return "A";
        } else if (diemHe10 >= 7.0 && diemHe10 <= 8.4) {
            return "B";
        } else if (diemHe10 >= 5.5 && diemHe10 <= 6.9) {
            return "C";
        } else if (diemHe10 >= 4.0 && diemHe10 <= 5.4) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        kqDAO.get("3121410066");
    }

    public ArrayList<KetQua> getDsKQSV() {
        return dsKQSV;
    }

    public void setDsKQSV(ArrayList<KetQua> dsKQSV) {
        this.dsKQSV = dsKQSV;
    }

}
