/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.TaiKhoanDAO;
import DTO.TaiKhoanDTO;
import BUS.NQ_CTQBUS;
import BUS.SinhVienBUS;
import GUI.Login;
import GUI.MainPanel.ManagerYear;
import GUI.Table;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PC
 */
public class TaiKhoanBUS {

//    public static TaiKhoanDTO curentLogin = new TaiKhoanBUS().getByUsername("3121410482");
    static TaiKhoanDAO tkDAO = new TaiKhoanDAO();
    public static TaiKhoanDTO curentLogin = tkDAO.getByUserName("3121410066");

    public static void login(Login lg) {
        String tenTK = lg.getUsername().getText();
        String matkhau = lg.getPassword().getText();
        TaiKhoanBUS qltk = new TaiKhoanBUS();
        curentLogin = qltk.getByUsername(tenTK);
        System.out.println(tenTK);
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

    public TaiKhoanDTO getByUsername(String tentk) {
        return tkDAO.getByUserName(tentk);
    }

    public int getTrangThai(TaiKhoanDTO tk) {
        switch (tk.getMaNhomQuyen()) {
            case "Q4":
                return new SinhVienBUS().getTrangThai(tk.getMaTK());
        }

        return -1;
    }

    public static String getPassword() {
        if (curentLogin != null) {
            return curentLogin.getMatKhau();
        } else {
            return null;
        }
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

    public static void configManagerYear(ManagerYear managerYear) {
        int hkHienTai = NienHocBUS.currentNienHoc.getHocKi();
        int namHienTai = NienHocBUS.currentNienHoc.getNam();

        managerYear.getCbHK().setSelectedIndex(hkHienTai - 1);
        managerYear.getTxtNam().setText(namHienTai + "");

        if (NhomBUS.dangkyMon) {
            managerYear.getRdDKY().setSelected(true);
        } else {
            managerYear.getRdDKN().setSelected(true);
        }

    }

    public static void saveConfigManagerYear(ManagerYear managerYear) {
        int hkHienTai = NienHocBUS.currentNienHoc.getHocKi();
        int namHienTai = NienHocBUS.currentNienHoc.getNam();
        int hkMoi = Integer.parseInt(managerYear.getCbHK().getSelectedItem() + "");
        int namMoi = Integer.parseInt(managerYear.getTxtNam().getText());
        boolean isChange = false;
        if (hkHienTai != hkMoi || namHienTai != namMoi) {
            NienHocBUS.currentNienHoc.setHocKi(hkMoi);
            NienHocBUS.currentNienHoc.setNam(namMoi);
            NienHocBUS.updateNienHoc(hkMoi, namMoi);
            isChange = true;
        }
        System.out.println(NhomBUS.dangkyMon);
        if (NhomBUS.dangkyMon && managerYear.getRdDKN().isSelected()
                || !NhomBUS.dangkyMon && managerYear.getRdDKY().isSelected()) {
            if (managerYear.getRdDKY().isSelected()) {
                NhomBUS.dangkyMon = true;
            } else {
                NhomBUS.dangkyMon = false;
            }
            NhomBUS.updateCurrentDangKyMon(NhomBUS.dangkyMon);
            isChange = true;
        }
        if (!isChange) {
            JOptionPane.showMessageDialog(null, "Không có gì thay đổi!", "Thay đổi", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
