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

    public static TaiKhoan curentLogin = new TaiKhoanBUS().getByUsername("3121410482");

    public static void login(Login lg) {
        String tenTK = lg.getUsername().getText();
        String matkhau = lg.getPassword().getText();
        TaiKhoanBUS qltk = new TaiKhoanBUS();
        curentLogin = qltk.getByUsername(tenTK);
        if (curentLogin != null) {
            int trangThai = qltk.getTrangThai(curentLogin);
            if (trangThai == 0) {
                JOptionPane.showMessageDialog(null, "Tài khoản bị vô hiệu hóa ");
                return;
            }
            if (curentLogin.getMatKhau().equals(matkhau)) {
                ArrayList<String> dsq = new NQ_CTQBUS().getListCTQByNQuyen(curentLogin.getMaNhomQuyen());
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
        table.getStudentList().setVisible(false);
        table.getGroup().setVisible(false);

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

            }
        }
    }
}
