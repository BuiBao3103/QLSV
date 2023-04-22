/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.KetQua;

import backend.QLHocPhan.HocPhan;
import backend.QLHocPhan.HocPhanBUS;
import backend.QLTaiKhoan.TaiKhoanBUS;
import frontend.Login;
import frontend.Score;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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

    public void addRowData(Score score, int nam,int hk) {
        JTable table = score.getjTable2();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int stt = 0;
         double TongDiemHe10 = 0;
         double TongDiemHe4 = 0;
         int soTinChi =0;
        model.setRowCount(0);
        for (KetQua kq : dsKQSV) {
            if (hk == kq.getHocKy() && nam == kq.getNam()) {
                HocPhan hp = HocPhanBUS.getHocPhanByID(kq.getMaHP());
                String tenHP = hp.getTenHP();
                int soTC = hp.getTinChi();
                String phanTramQuaTrinh = hp.getPhanTramQuaTrinh() + "%";
                String phanTramThi = (100 - hp.getPhanTramQuaTrinh()) + "%"; // % điểm thi = 100% - %điểm quá trình
                 double diemQuaTrinh = kq.getDiemQT();
                 double diemCuoiKy = kq.getDiemCK();
                 double diemHe10 = DiemHe10(phanTramQuaTrinh, diemQuaTrinh, diemCuoiKy);
                 soTinChi +=soTC;
                String diemChu = DiemChuHe4(diemHe10);
                TongDiemHe10  += diemHe10;
                TongDiemHe4 += TinhDiemHe4(diemHe10);
                stt++;
                model.addRow(new Object[]{
                    stt, kq.getMaHP(), tenHP, soTC, phanTramQuaTrinh,
                    phanTramThi, diemQuaTrinh, diemCuoiKy,
                    diemHe10, diemChu
                });
            }
        }
         double diemTrungBinhHe10 = TongDiemHe10 / stt;
         double diemTrungBinhHe4 = TongDiemHe4/stt;
       score.getTxtHocKyHe10().setText(String.valueOf(diemTrungBinhHe10));
        score.getTxtHocKyHe4().setText(String.valueOf(diemTrungBinhHe4));
        score.getTxtSoTCHocKy().setText(String.valueOf(soTinChi));
    }
public void showTable( ){
     for ( KetQua kq : dsKQSV) {
                HocPhan hp = HocPhanBUS.getHocPhanByID(kq.getMaHP());
                String tenHP = hp.getTenHP();
                int soTC = hp.getTinChi();
                String phanTramQuaTrinh = hp.getPhanTramQuaTrinh() + "%";
                String phanTramThi = (100 - hp.getPhanTramQuaTrinh()) + "%"; // % điểm thi = 100% - %điểm quá trình
                 double diemQuaTrinh = kq.getDiemQT();
                 double diemCuoiKy = kq.getDiemCK();
                 double diemHe10 = DiemHe10(phanTramQuaTrinh, diemQuaTrinh, diemCuoiKy);
                   String diemChu = DiemChuHe4(diemHe10);
                 
     }
}
    public int[] convertStringToNumber(String text) {
        int[]  result = new int[2];
        String firstPart = text.substring(0, 4);
        String secondPart = text.substring(4, 5);
        result[0] = Integer.parseInt(firstPart);
        result[1] = Integer.parseInt(secondPart);
        return result;
    }
public boolean formatCheck(String text){
    if (text.length() != 5) {
        return false;
    }
    for (int i = 0; i < text.length(); i++) {
        if (!Character.isDigit(text.charAt(i))) {
            return false;
        }
    }
    return true;
}
public void SearchHocKy (Score score){
    String input = score.getTxtSearch().getText();
    if(formatCheck(input)){
        int[] result =convertStringToNumber(input);
        addRowData(score, result[0], result[1]); 
    }
    else{
        JOptionPane.showMessageDialog(score, "Nhập sai định dạng");
    }
}
    public  double DiemHe10(String PhanTramQuaTrinh,  double diemQuaTrinh, double diemThi) {
        if (PhanTramQuaTrinh.equals("40%")) {
            return diemQuaTrinh * 0.4 + diemThi * 0.6;
        } else {
            return diemQuaTrinh * 0.5 + diemThi * 0.5;
        }
    }
public double TinhDiemHe4(double diemHe10){
      if (diemHe10 >= 8.5) {
            return 4.0;
        } else if (diemHe10 >= 7.0 && diemHe10 <= 8.4) {
            return 3.0;
        } else if (diemHe10 >= 5.5 && diemHe10 <= 6.9) {
            return 2.0;
        } else if (diemHe10 >= 4.0 && diemHe10 <= 5.4) {
            return 1.0;
        } else {
            return 0.0;
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
