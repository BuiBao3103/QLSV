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

    public static void login(Login lg) {
        String tenTK = lg.getUsername().getText();
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
                new Table(dsq).setVisible(true);
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
}
