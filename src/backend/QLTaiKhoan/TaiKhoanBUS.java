/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLTaiKhoan;

import backend.QLNQ_CTQ.NQ_CTQBUS;
import backend.QLSinhVien.SinhVienBUS;
import frontend.Login;
import frontend.Table;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PC
 */
public class TaiKhoanBUS {

    private static String tenTK = "";

    public static String getTenTK() {
        return tenTK;
    }

    public static void login(Login lg) {
        tenTK = lg.getUsername().getText();
        String matkhau = lg.getPassword().getText();
        TaiKhoanBUS qltk = new TaiKhoanBUS();
        TaiKhoan tk = qltk.getByUsername(tenTK);
        if (tk != null) {
            int trangThai = qltk.getTrangThai(tk);
            if (trangThai == 0) {
                JOptionPane.showMessageDialog(null, "Tài khoản bị vô hiệu hóa ");
                return;
            }
            if (tk.getMatKhau().equals(matkhau)) {
                ArrayList<String> dsq = new NQ_CTQBUS().getListCTQByNQuyen(tk.getMaNhomQuyen());
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ignored) {

                }
                
                new TaiKhoanBUS().phanQuyen(dsq);
               
            } else {
                JOptionPane.showMessageDialog(null, "Sai mật khẩu");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Sai tên đăng nhập");
        }
    }

    public TaiKhoan getByUsername(String tentk) {
        TaiKhoanDAO tkDAO = new TaiKhoanDAO();
        return tkDAO.getByUserName(tentk);
    }

    public int getTrangThai(TaiKhoan tk) {
        switch (tk.getMaNhomQuyen()) {
            case "Q4":
                return new SinhVienBUS().getTrangThai(tk.getMaTK());
        }

        return -1;
    }

    public void phanQuyen(ArrayList<String> dsq) {
        Table table = new Table();
        table.setVisible(true);
        table.getBtnInformation().setVisible(false);
        table.getBtnSubjectRegistration().setVisible(false);
        table.getBtnSchedule().setVisible(false);
        table.getBtnScore().setVisible(false);
        table.getInputPoint().setVisible(false);
        table.getjButton7().setVisible(false);
        table.getjButton8().setVisible(false);
        table.getjButton9().setVisible(false);
        table.getStudentList().setVisible(false);
        table.getjButton12().setVisible(false);
        table.getjButton13().setVisible(false);
        table.getGroup().setVisible(false);
        table.getAccountList().setVisible(false);
        table.getTool1().setVisible(false);
        table.getSetting().setVisible(false);
        table.getScholastic().setVisible(false);

        for (String q : dsq) {
            switch (q) {
                case "CTQ1" -> {
                    table.getBtnInformation().setVisible(true);
                }
                case "CTQ2" -> {
                    table.getBtnSubjectRegistration().setVisible(true);
                }
                case "CTQ3" -> {
                    table.getBtnSchedule().setVisible(true);
                }
                case "CTQ4" -> {
                    table.getBtnScore().setVisible(true);
                }
                case "CTQ5" -> {
                    table.getInputPoint().setVisible(true);
                }
                case "CTQ6" -> {
                    table.getBtnInformation().setVisible(true);
                }
                case "CTQ7" -> {
                    table.getjButton7().setVisible(true);
                }
                case "CTQ8" -> {
                    table.getjButton8().setVisible(true);
                }
                case "CTQ9" -> {
                    table.getjButton9().setVisible(true);
                }
                case "CTQ10" -> {
                    table.getAccountList().setVisible(true);
                    table.getScholastic().setVisible(true);
                }
            }
        }
    }
}
