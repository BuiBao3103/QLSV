/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhomDAO;
import DTO.NhomDTO;
import DTO.KetQuaDTO;
import BUS.KetQuaBUS;
import DAO.KetQuaDAO;
import DTO.NganhDTO;
import BUS.NganhBUS;
import DTO.HocPhanDTO;
import DAO.HocPhanDAO;
import DTO.NienHocDTO;
import DAO.NienHocDAO;
import DTO.SinhVienDTO;
import DAO.SinhVienDAO;
import GUI.MainPanel.Schedule;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class NhomBUS {

    public static NhomDAO nhomDAO = new NhomDAO();
    public static boolean dangkyMon = nhomDAO.getCurrentDangKyMon();
    public static ArrayList<NhomDTO> dsNhom = nhomDAO.get();
    static SinhVienDAO svDAO = new SinhVienDAO();
    static HocPhanDAO hpDAO = new HocPhanDAO();

    public static ArrayList<NhomDTO> dsNhomDaHoc = nhomDAO.getBySinhVien(); // lấy các học phần sv đang đăng nhập đã học

    public static void updateCurrentDangKyMon(boolean isDangkyMon) {
        nhomDAO.updateCurrentDangKyMon(isDangkyMon);
    }

    public static void showGroupRegistration(JTable table, JLabel lblTongTinChi) {
        DefaultTableModel tblDangKy = (DefaultTableModel) table.getModel();
        tblDangKy.setRowCount(0);
        int i = 1;
        int sumTC = 0;
        for (KetQuaDTO dk : KetQuaBUS.dsDaDangKySV) {
            HocPhanDTO hp = HocPhanBUS.getHocPhanByID(dk.getMaHP());
            sumTC += hp.getTinChi();
            int phanTramGK = hp.getPhanTramQuaTrinh();
            int phanTramCK = 100 - phanTramGK;
            Object[] rowData = {i++, hp.getMaHP(), hp.getTenHP(), dk.getSoNhom(), hp.getTinChi(), phanTramGK, phanTramCK};
            tblDangKy.addRow(rowData);
        }
        lblTongTinChi.setText("Tổng số tín chỉ: " + sumTC);
    }

    public static void showGroupSuggestions(JTable table) {
        DefaultTableModel tblNhom = (DefaultTableModel) table.getModel();
        tblNhom.setRowCount(0);
        int i = 1;
        for (NhomDTO nhom : dsNhom) {
            //Check isLearned
            if (KetQuaBUS.isLearned(nhom.getMaHP())) {
                continue;
            }
            //check isRegister
            if (checkIsRegistered(nhom.getMaHP())) {
                continue;
            }
            //Check condition Khoa, Nganh
            if (!checkSvKhoaNganh(nhom.getMaHP())) {
                continue;
            }
            //Check condition hocphan previous
            if (!checkPreviousHocPhan(nhom.getMaHP())) {
                continue;
            }
            //Get data GiangVien
            String fullnameGV = GiangVienBUS.getGVnameByGVid(nhom.getMaGV()).getTenGV();
            String formattedName = GiangVienBUS.formatGVName(fullnameGV);//Trương Tấn Khoa -> T.T.Khoa
            //Get data HocPhan
            String nameHP = HocPhanBUS.getHPnameByHPid(nhom.getMaHP());
            String tcHP = HocPhanBUS.getHocPhanByID(nhom.getMaHP()).getTinChi() + "";
            //handle remaining slot 
            int remainSlot = nhom.getSoLuongSV()
                    - countGroupRegistered(KetQuaBUS.dsDaDangKyToanTruong, nhom.getMaHP(), nhom.getSoNhom());
            //Create row data
            Object[] rowData = {i++, nhom.getMaHP(), nameHP, nhom.getSoNhom(), tcHP,
                nhom.getSoLuongSV(), remainSlot, nhom.getThu(),
                nhom.getTietBD(), nhom.getSoTiet(), nhom.getPhong(), formattedName};
            tblNhom.addRow(rowData);
        }
    }

    public static int countGroupRegistered(ArrayList<KetQuaDTO> dskq, String maHP, int soNhom) {
        int cnt = 0;
        for (KetQuaDTO kq : dskq) {
            if (kq.getMaHP().equals(maHP) && kq.getSoNhom() == soNhom) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean checkIsRegistered(String maHP) {
        for (KetQuaDTO dk : KetQuaBUS.dsDaDangKySV) {
            if (dk.getMaHP().equals(maHP)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPreviousHocPhan(String maHP) {
        ArrayList<String> dsMonHocTruoc = HocPhanBUS.getMonHocTruoc(maHP);
        for (String hpt : dsMonHocTruoc) {
            if (KetQuaBUS.isLearned(hpt)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSvKhoaNganh(String maHP) {
        HocPhanDTO hp = HocPhanBUS.getHocPhanByID(maHP);
        SinhVienDTO sv = (new SinhVienDAO()).getByMaSV(TaiKhoanBUS.curentLogin.getTenTaiKhoan()).get(0);
        switch (hp.getChuyenBiet()) {
            case 0 -> {//mon chung cua toan truong
                return true;
            }
            case 1 -> {//mon chung cua khoa
                NganhDTO nganhSV = NganhBUS.getNganhByID(sv.getMaNganh());
                if (hp.getMaKhoa().equals(nganhSV.getMaKhoa())) {
                    return true;
                }
                return false;
            }
            case 2 -> {//mon rieng cua nganh
                if (hp.getMaNganh().equals(sv.getMaNganh())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static void filterGroup(String monHoc, String chuyenBiet, String chuyenBietPhu, JTable table) {
        boolean found = false;
        DefaultTableModel tblNhom = (DefaultTableModel) table.getModel();
        tblNhom.setRowCount(0);
        int i = 1;
        for (NhomDTO nhom : dsNhom) {
            HocPhanDTO hp = HocPhanBUS.getHocPhanByID(nhom.getMaHP());
            //filter by ChuyenBiet
            //chuyen biet = 0 ->Mon chung; 1->mon chung cua khoa 2-> mon rieng cua nganh
            if (chuyenBiet.equals("Môn Chung") && hp.getChuyenBiet() != 0) {
                continue;
            }
            if (chuyenBiet.equals("Ngành") && (hp.getChuyenBiet() != 2 || !chuyenBietPhu.equals(hp.getMaNganh()))) {
                continue;
            } else if (chuyenBiet.equals("Khoa") && (hp.getChuyenBiet() != 1 || !chuyenBietPhu.equals(hp.getMaKhoa()))) {
                continue;
            }

            String nameHP = HocPhanBUS.getHPnameByHPid(nhom.getMaHP());
            //filter by name or id HP
            if (!nhom.getMaHP().toLowerCase().contains(monHoc.toLowerCase())
                    && !nameHP.toLowerCase().contains(monHoc.toLowerCase())) {
                continue;
            }
            found = true;
            //Get data GiangVien
            String fullnameGV = GiangVienBUS.getGVnameByGVid(nhom.getMaGV()).getTenGV();
            String formattedName = GiangVienBUS.formatGVName(fullnameGV);//Trương Tấn Khoa -> T.T.Khoa
            //Get data HocPhan
            String tcHP = hp.getTinChi() + "";
            //handle remaining slot 
            int remainSlot = nhom.getSoLuongSV()
                    - countGroupRegistered(KetQuaBUS.dsDaDangKyToanTruong, nhom.getMaHP(), nhom.getSoNhom());
            //Create row data
            Object[] rowData = {i++, nhom.getMaHP(), nameHP, nhom.getSoNhom(), tcHP,
                nhom.getSoLuongSV(), remainSlot, nhom.getThu(),
                nhom.getTietBD(), nhom.getSoTiet(), nhom.getPhong(), formattedName};
            tblNhom.addRow(rowData);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Không tim thấy môn học nào!", "Kết quả lọc", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // ------ các hàm thao tác với tkb -------------------
    public static void formatTable(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static void showTKB(Schedule schedule) {
        JTable table = schedule.getTblSchedule();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        formatTable(table);
        int hocKy;
        int nam;
        try {
            String hocKyDaChon = schedule.getCbChonHocKy().getSelectedItem().toString();
            hocKy = Integer.parseInt(hocKyDaChon.split(" - ")[0]); // lấy học kì đã chọn trong combobox
            nam = Integer.parseInt(hocKyDaChon.split(" - ")[1]); // lấy năm đã chọn trong combobox
        } catch (Exception e) {
            return;
        }
        arrangeSchedule(schedule);
        for (NhomDTO nh : dsNhomDaHoc) {
            if (nh.getHocKy() == hocKy && nh.getNam() == nam) {
                HocPhanDTO hp = hpDAO.getByMaHP(nh.getMaHP()); // cái này lấy ra học phần của nhóm đó để có tên hp, số tchi ...
                tableModel.addRow(new Object[]{
                    nh.getMaHP(), hp.getTenHP(), nh.getSoNhom(), hp.getTinChi(), nh.getThu(), nh.getTietBD(), nh.getSoTiet(), nh.getPhong()
                });
            }
        }
        table.setModel(tableModel);
    }

    public static ArrayList<SinhVienDTO> getDSSVFromSelectedRow(Schedule schedule) { // hàm này lấy dssv từ học phần đang chọn
        int selectedRow = schedule.getTblSchedule().getSelectedRow();
        JTable tblSchedule = schedule.getTblSchedule();
        String maHpDuocChon = tblSchedule.getValueAt(selectedRow, 0).toString();
        int nhomDuocChon = Integer.parseInt(tblSchedule.getValueAt(selectedRow, 2).toString());

        ArrayList<String> dsMaSV = new KetQuaDAO().getDsMaSV(maHpDuocChon, nhomDuocChon);
        ArrayList<SinhVienDTO> dssv = new ArrayList();
        for (String MaSV : dsMaSV) {
            SinhVienDTO sv = svDAO.getByMaSV(MaSV).get(0);
            dssv.add(sv);
        }
        return dssv;
    }

    public static void showDSSV(Schedule schedule) {
        int selectedRow = schedule.getTblSchedule().getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Chọn môn muốn xem danh sách");
            return;
        }
        ArrayList<SinhVienDTO> dssv = getDSSVFromSelectedRow(schedule); // lấy dssv đang học Hphan nhóm đang chọn

        JTable table = schedule.getTblDSSV();
        schedule.getScpDSSV().setVisible(true);
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        formatTable(table);

        int i = 1;
        for (SinhVienDTO sv : dssv) {
            if (sv.getTrangThai() == 1) {
                tableModel.addRow(new Object[]{
                    i++, sv.getMaSV(), sv.getHoTen(), SinhVienBUS.maNganhToTenNganh(sv.getMaNganh()), sv.getMaLop()
                });
            }
        }
    }

    public static void addItemToCbChonHocKy(Schedule schedule) {
        String maSV = TaiKhoanBUS.curentLogin.getTenTaiKhoan();
        SinhVienDTO sv = svDAO.getByMaSV(maSV).get(0);
        int namVaoHoc = Integer.parseInt(sv.getNienKhoa().split("-")[0]);
        NienHocDTO hientai = new NienHocDAO().getCurrentNienHoc();
        schedule.getCbChonHocKy().removeAll();
        while (namVaoHoc <= hientai.getNam()) {
            schedule.getCbChonHocKy().addItem(hientai.getHocKi() + " - " + hientai.getNam());
            hientai = NienHocBUS.prevNienHoc(hientai);
        }
    }

    // mấy hàm dưới này phục vụ sắp xếp môn học
    public static int getNumberFromDayOfWeek(String dayOfWeek) { // cái hàm này trả về số thứ tự các ngày trong tuần, cho dễ xắp xếp á
        switch (dayOfWeek) {
            case "Hai":
                return 2;
            case "Ba":
                return 3;
            case "Tư":
                return 4;
            case "Năm":
                return 5;
            case "Sáu":
                return 6;
            case "Bảy":
                return 7;
            default:
                return 8;
        }
    }

    public static boolean compare2NhomDTO(NhomDTO nh1, NhomDTO nh2) {
        if (getNumberFromDayOfWeek(nh1.getThu()) > getNumberFromDayOfWeek(nh2.getThu())) { // nhóm 1 nằm sau nhóm 2
            return true;
        } else if (getNumberFromDayOfWeek(nh1.getThu()) == getNumberFromDayOfWeek(nh2.getThu())) { // 2 nhóm cùng ngày trong tuần
            if (nh1.getTietBD() > nh2.getTietBD()) {
                return true; // nhóm 1 học sau nhóm 2
            } else { // nhóm 1 học trước nhóm 2
                return false;
            }
        }
        return false; // nhóm 1 học trước nhóm 2 trong 2 ngày khác nhau
    }

    public static void swap(ArrayList<NhomDTO> dsn, int index1, int index2) { // hàm này đổi chổ 2 vị trí trong arrayLisst nhóm
        NhomDTO temp = dsn.get(index1);
        dsn.set(index1, dsn.get(index2));
        dsn.set(index2, temp);
    }

    public static void arrangeSchedule(Schedule schedule) {
        if (schedule.getBtnSapXepTheoMon().isSelected()) { // sắp xếp theo mã môn
            for (NhomDTO nh1 : dsNhomDaHoc) {
                for (NhomDTO nh2 : dsNhomDaHoc) {
                    if (Integer.parseInt(nh1.getMaHP()) > Integer.parseInt(nh2.getMaHP())) {
                        int index1 = dsNhomDaHoc.indexOf(nh1);
                        int index2 = dsNhomDaHoc.indexOf(nh2);
                        swap(dsNhomDaHoc, index1, index2);
                    }
                }
            }
        } else { // sắp xếp theo thứ tiết
            for (NhomDTO nh1 : dsNhomDaHoc) {
                for (NhomDTO nh2 : dsNhomDaHoc) {
                    if (nh1.getNam() == nh2.getNam() && nh1.getHocKy() == nh2.getHocKy()) {
                        if (compare2NhomDTO(nh1, nh2)) { // nhóm 1 sau nhóm 2
                            int index1 = dsNhomDaHoc.indexOf(nh1);
                            int index2 = dsNhomDaHoc.indexOf(nh2);
                            swap(dsNhomDaHoc, index1, index2);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        NhomBUS nBUS = new NhomBUS();
//        System.out.println(nBUS.hocKyHienTai());
    }
}
