/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KetQuaDAO;
import DTO.KetQuaDTO;
import DTO.HocPhanDTO;
import GUI.MainPanel.Score;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ASUS
 */
public class KetQuaBUS {

    static KetQuaDAO kqDAO = new KetQuaDAO();

    public static ArrayList<KetQuaDTO> dsKQSV = kqDAO.getDaHoc(TaiKhoanBUS.curentLogin.getTenTaiKhoan());
    public static ArrayList<KetQuaDTO> dsDaDangKySV = kqDAO.getDaDangKy(
            TaiKhoanBUS.curentLogin.getTenTaiKhoan(),
            NienHocBUS.currentNienHoc.getHocKi(),
            NienHocBUS.currentNienHoc.getNam());
    public static ArrayList<KetQuaDTO> dsDaDangKyToanTruong = (new KetQuaDAO()).getDaDangKyToanTruong(
            NienHocBUS.currentNienHoc.getHocKi(),
            NienHocBUS.currentNienHoc.getNam());

    public static boolean subjectRegistration(String maMon, int soNhom) {
        //check isLearn 
        if (isLearned(maMon)) {
            JOptionPane.showMessageDialog(null, "Bạn đã học môn này rồi!", "Đăng ký môn học", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        //check DaDangKy
        if (NhomBUS.checkIsRegistered(maMon)) {
            JOptionPane.showMessageDialog(null, "Bạn đã đăng ký môn này rồi!", "Đăng ký môn học", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        //checkKhoaNganh
        if (!NhomBUS.checkSvKhoaNganh(maMon)) {
            JOptionPane.showMessageDialog(null, "Không thuộc khoa,ngành của bạn!", "Đăng ký môn học", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        //check Prevous MonHoc
        if (NhomBUS.checkPreviousHocPhan(maMon)) {
            JOptionPane.showMessageDialog(null, "Bạn chưa học môn học trước!", "Đăng ký môn học", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        int hk = NienHocBUS.currentNienHoc.getHocKi();
        int nam = NienHocBUS.currentNienHoc.getNam();
        String maSV = TaiKhoanBUS.curentLogin.getTenTaiKhoan();
        KetQuaDTO dkm = new KetQuaDTO(maSV, maMon, soNhom, hk, nam, -1, -1);
        kqDAO.add(dkm);
        //update dsDaDangKy
        dsDaDangKySV.add(dkm);
        dsDaDangKyToanTruong.add(dkm);
        return true;
    }

    public static boolean isLearned(String maHP) {
        for (KetQuaDTO kq : dsKQSV) {
            if (kq.getMaHP().equals(maHP)) {
                return true;
            }
        }
        return false;
    }

    public void addRowData(Score score, int nam, int hk) {
        System.out.println(dsKQSV.toString());
        JTable table = score.getjTable2();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int stt = 0;
        double TongDiemHe10 = 0;
        double TongDiemHe4 = 0;
        int soTinChi = 0;
        model.setRowCount(0);
        for (KetQuaDTO kq : dsKQSV) {
            if (hk == kq.getHocKy() && nam == kq.getNam()) {
                HocPhanDTO hp = HocPhanBUS.getHocPhanByID(kq.getMaHP());
                String tenHP = hp.getTenHP();
                int soTC = hp.getTinChi();
                String phanTramQuaTrinh = hp.getPhanTramQuaTrinh() + "%";
                String phanTramThi = (100 - hp.getPhanTramQuaTrinh()) + "%"; // % điểm thi = 100% - %điểm quá trình
                double diemQuaTrinh = kq.getDiemQT();
                double diemCuoiKy = kq.getDiemCK();
                double diemHe10 = lamTronSo(DiemHe10(phanTramQuaTrinh, diemQuaTrinh, diemCuoiKy));
                String diemChu = DiemChu(diemHe10);
                String ketQua = KetQua(diemHe10);
                soTinChi += tinhSoTinChi(soTC, diemHe10);
                TongDiemHe10 += diemHe10;
                TongDiemHe4 += TinhDiemHe4(diemHe10);
                stt++;
                model.addRow(new Object[]{
                    stt, kq.getMaHP(), tenHP, soTC, phanTramQuaTrinh,
                    phanTramThi, diemQuaTrinh, diemCuoiKy,
                    diemHe10, diemChu, ketQua
                });
            }
        }
        double diemTrungBinhHe10 = TongDiemHe10 / stt;
        double diemTrungBinhHe4 = TongDiemHe4 / stt;
        score.getTxtHocKyVaNam().setText("Học kỳ " + hk + " năm " + nam);
        score.getTxtHocKyHe10().setText(String.valueOf(lamTronSo(diemTrungBinhHe10)));
        score.getTxtHocKyHe4().setText(String.valueOf(lamTronSo(diemTrungBinhHe4)));
        score.getTxtSoTCHocKy().setText(String.valueOf(soTinChi));
        formatTable(table);
    }

    public void ShowTichLuy(Score score) {
        double TongDiemHe10 = 0;
        double TongDiemHe4 = 0;
        int soTinChi = 0;
        for (KetQuaDTO kq : dsKQSV) {
            HocPhanDTO hp = HocPhanBUS.getHocPhanByID(kq.getMaHP());
            int soTC = hp.getTinChi();
            String phanTramQuaTrinh = hp.getPhanTramQuaTrinh() + "%";
            double diemQuaTrinh = kq.getDiemQT();
            double diemCuoiKy = kq.getDiemCK();
            double diemHe10 = lamTronSo(DiemHe10(phanTramQuaTrinh, diemQuaTrinh, diemCuoiKy));
            soTinChi += tinhSoTinChi(soTC, diemHe10);
            TongDiemHe10 += diemHe10;
            TongDiemHe4 += TinhDiemHe4(diemHe10);
            double diemTrungBinhHe10 = TongDiemHe10 / dsKQSV.size();
            double diemTrungBinhHe4 = TongDiemHe4 / dsKQSV.size();
            score.getTxtTichLuyHe10().setText(String.valueOf(lamTronSo(diemTrungBinhHe10)));
            score.getTxtTichLuyHe4().setText(String.valueOf(lamTronSo(diemTrungBinhHe4)));
            score.getTxtSoTinChiTichLuy().setText(String.valueOf(soTinChi));
        }

    }

    public double lamTronSo(double diem) {    // làm tròn số lên hoặc xuống tùy thuộc vào giá trị thập phân của số đó.
        return Math.round(diem * 100.0) / 100.0;
    }

    public int tinhSoTinChi(int soTinChi, double diemHe10) { // hàm này để tính tổng số tín 
        int tong = 0;
        if (diemHe10 >= 4.0) {
            tong += soTinChi;
        }
        return tong;
    }

    public static void formatTable(JTable table) {
        table.getColumn("STT").setMinWidth(30);
        table.getColumn("STT").setMaxWidth(30);
        table.getColumn("Mã Môn").setMaxWidth(100);
        table.getColumn("Mã Môn").setMinWidth(100);
        table.getColumn("Tên Môn").setMaxWidth(250);
        table.getColumn("Tên Môn").setMinWidth(250);
        table.getColumn("TC").setMaxWidth(30);
        table.getColumn("TC").setMinWidth(30);
        table.getColumn("% KT").setMaxWidth(50);
        table.getColumn("% KT").setMinWidth(50);
        table.getColumn("% Thi").setMaxWidth(50);
        table.getColumn("% Thi").setMinWidth(50);
        table.getColumn("Quá trình").setMaxWidth(70);
        table.getColumn("Quá trình").setMinWidth(70);
        table.getColumn("Điểm thi").setMaxWidth(70);
        table.getColumn("Điểm thi").setMinWidth(70);
        table.getColumn("Điểm TK").setMaxWidth(70);
        table.getColumn("Điểm TK").setMinWidth(70);
        table.getColumn("ĐTK(4)").setMaxWidth(70);
        table.getColumn("ĐTK(4)").setMinWidth(70);
        table.getColumn("KQ").setMinWidth(30);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(String.class, centerRenderer);
        table.getColumn("STT").setCellRenderer(centerRenderer);
        table.getColumn("Mã Môn").setCellRenderer(centerRenderer);
        table.getColumn("Tên Môn").setCellRenderer(centerRenderer);
        table.getColumn("TC").setCellRenderer(centerRenderer);
        table.getColumn("% KT").setCellRenderer(centerRenderer);
        table.getColumn("% Thi").setCellRenderer(centerRenderer);
        table.getColumn("Quá trình").setCellRenderer(centerRenderer);
        table.getColumn("Điểm thi").setCellRenderer(centerRenderer);
        table.getColumn("Điểm TK").setCellRenderer(centerRenderer);
        table.getColumn("ĐTK(4)").setCellRenderer(centerRenderer);
        table.getColumn("KQ").setCellRenderer(centerRenderer);

//        table.getColumn("Ngành").setCellRenderer(centerRenderer);
        table.getTableHeader().setDefaultRenderer(centerRenderer);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(35);
        table.setRowMargin(10);
        table.setFont(new java.awt.Font("Segoe UI", 0, 16));
        table.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setAutoCreateRowSorter(true);
    }

    public int[] convertStringToNumber(String text) {
        int[] result = new int[2];
        String firstPart = text.substring(0, 4);
        String secondPart = text.substring(4, 5);
        result[0] = Integer.parseInt(firstPart);
        result[1] = Integer.parseInt(secondPart);
        return result;
    }

    public boolean formatCheck(String text) {
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

    public void SearchHocKy(Score score) {
        String input = score.getTxtSearch().getText();
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(score, "Bạn chưa nhập thông tin");
            score.getTxtSearch().requestFocus(true);
            return;
        }
        if (formatCheck(input)) {
            int[] result = convertStringToNumber(input);
            addRowData(score, result[0], result[1]);
            score.getTxtSearch().setText("");
        } else {
            JOptionPane.showMessageDialog(score, "Nhập sai định dạng");
            score.getTxtSearch().requestFocus(true);
            score.getTxtSearch().setText("");
        }
    }

    public double DiemHe10(String PhanTramQuaTrinh, double diemQuaTrinh, double diemThi) {
        if (PhanTramQuaTrinh.equals("40%")) {
            return diemQuaTrinh * 0.4 + diemThi * 0.6;
        } else {
            return diemQuaTrinh * 0.5 + diemThi * 0.5;
        }
    }

    public double TinhDiemHe4(double diemHe10) {
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

    public String DiemChu(double diemHe10) {
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

    public String KetQua(double diemHe10) {
        if (diemHe10 >= 4.0) {
            return "Đạt";
        } else {
            return "X";
        }
    }

    public static void main(String[] args) {
        kqDAO.get("3121410066");
        KetQuaBUS kq = new KetQuaBUS();
        System.out.println(kq.lamTronSo(8.62));
    }

    public ArrayList<KetQuaDTO> getDsKQSV() {
        return dsKQSV;
    }

    public void setDsKQSV(ArrayList<KetQuaDTO> dsKQSV) {
        this.dsKQSV = dsKQSV;
    }

}
