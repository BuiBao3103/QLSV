/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLSinhVien;

import backend.Nganh.*;
import backend.QLTaiKhoan.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import frontend.StudentInfo;
import frontend.Table;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class SinhVienBUS {

    static SinhVienDAO svDAO = new SinhVienDAO();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // cái này để chuyển qua lại kiểu date với String
    static ArrayList<SinhVien> dssv = new SinhVienDAO().get();
    static ArrayList<Nganh> dsNganh = new NganhDAO().get();
    public static ArrayList<String> dsTenNganh = new ArrayList();

    public SinhVienBUS() {
    }

    public static void getDsTenNganh() { // hàm này sẽ thay đổi ds lấy tất cả các ngành
        dsTenNganh.add(""); // cái này cho cái trường hợp chưa chọn
        for (Nganh i : dsNganh) {
            dsTenNganh.add(maNganhToTenNganh(i.getMaNganh()));
        }

    }

    public static void getDsTenNganhByKhoa(String maKhoa) {  // hàm này sẽ lấy được ds các ngành thuộc về khoa '...'
        dsTenNganh.add(""); // cái này cho cái trường hợp chưa chọn
        for (Nganh i : dsNganh) {
            if (i.getMaKhoa().equals(maKhoa)) {
                dsTenNganh.add(maNganhToTenNganh(i.getMaNganh()));
            }
        }
    }

    public static void formatTable(JTable table) {
        table.getColumn("MSSV").setMinWidth(150);
        table.getColumn("MSSV").setMaxWidth(150);
        table.getColumn("Ngành").setMaxWidth(350);
        table.getColumn("Ngành").setMinWidth(350);
        table.getColumn("Niên Khóa").setMaxWidth(100);
        table.getColumn("Niên Khóa").setMinWidth(100);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumn("Niên Khóa").setCellRenderer(centerRenderer);
        table.setDefaultRenderer(String.class, centerRenderer);
        table.getColumn("MSSV").setCellRenderer(centerRenderer);
        table.getColumn("Niên Khóa").setCellRenderer(centerRenderer);
        table.getColumn("Họ Tên").setCellRenderer(centerRenderer);
        table.getColumn("Ngành").setCellRenderer(centerRenderer);
        table.getTableHeader().setDefaultRenderer(centerRenderer);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(35);
        table.setRowMargin(10);
        table.setFont(new java.awt.Font("Segoe UI", 0, 16));
        table.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setAutoCreateRowSorter(true);

    }

    public static void showStudentList(JTable table) {
        getDsTenNganh(); // cái hàm này sẽ thay đổi cái dstennganh cho cái combobox ten nganh
        ArrayList<SinhVien> dssv = new SinhVienDAO().get();
        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        for (SinhVien i : dssv) {
            if (i.getTrangThai() == 1) {
                tblSinhVien.addRow(new Object[]{
                    i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
                });
            }
        }
        formatTable(table);
        table.setModel(tblSinhVien);
    }

    public static void showDeletedStudent(JTable table) {
        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        for (SinhVien i : dssv) {
            if (i.getTrangThai() == 0) {
                tblSinhVien.addRow(new Object[]{
                    i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
                });
            }
        }
        formatTable(table);
        table.setModel(tblSinhVien);
    }

    public static void resetDssvWhenChangeTrangThai(Table table) { // cái hàm này thay đổi dssv khi chọn giá trị cho cbTrangThai
        ArrayList<SinhVien> dssvNew = new ArrayList();
        dssv = svDAO.get();
        if (table.getCbTrangThaiSinhVien().getSelectedIndex() == 0){ // đang hoạt động
            for (SinhVien i : dssv){
                if(i.getTrangThai() == 1){
                    dssvNew.add(i);
                }
            }
        }
        else{
            for (SinhVien i : dssv){
                if(i.getTrangThai() == 0){
                    dssvNew.add(i);
                }
            }
        }
        dssv = dssvNew;
//       System.out.println(dssv.size());
    }

    public static void showStudentListWithCondition(JTable table, String condition, String conditionName) {
        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
//        System.out.println(conditionName);


        ArrayList<SinhVien> dssvNew = new ArrayList();
        if (conditionName.equals("MSSV")) {
            for (SinhVien i : dssv) {
                if (i.getMaSV().contains(condition)) {
                    dssvNew.add(i);
                }
            }
        }
        if (conditionName.equals("Tên")) {
            for (SinhVien i : dssv) {
                if (i.getHoTen().contains(condition)) {
                    dssvNew.add(i);
                }
            }
        }
        if (conditionName.equals("Ngành")) {
            for (SinhVien i : dssv) {
                if (maNganhToTenNganh(i.getMaNganh()).contains(condition)) {
                    dssvNew.add(i);
                }
            }
        }
        if (dssvNew.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy sinh viên nào\n");
            return;
        }
        for (SinhVien i : dssvNew) {
            if (i.getTrangThai() == 1) {
                tblSinhVien.addRow(new Object[]{
                    i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
                });
            }
        }
    }

    public static SinhVien StudentinTable(JTable table, int row) { //hàm này trả về sinh viên ở dòng được chọn trong bảng
        String mssv = table.getValueAt(row, 0) + ""; // cái dòng này sẽ từ cái dòng được chọn trong bảng lấy ra giá trị trong ô mssv
        for (SinhVien sv : dssv) {
            if (sv.getMaSV().equals(mssv)) {
                return sv;
            }
        }
        return null;
    }

    public static void showMoreInfoStudent(Table table, SinhVien sv) {
        table.setTxtHoTenSinhVien(sv.getHoTen());
        table.setTxtMSSinhVien(sv.getMaSV());
        table.setTxtCMNDSinhVien(sv.getCmnd());
        table.setTxtSoDTSinhVien(sv.getSoDienThoai());
        table.setTxtNgaySinhSinhVien(dateFormat.format(sv.getNgaySinh()));
        table.setTxtGioiTinhSinhVien(sv.getGioiTinh());
        table.setTxtDiaChiSinhVien(sv.getDiaChi());
        table.setTxtDanTocSinhVien(sv.getDanToc());
        table.setTxtTonGiaoSinhVien(sv.getTonGiao());
        table.setTxtNienKhoaSinhVien(sv.getNienKhoa());
//        table.setTxtNganhSinhVien(maNganhToTenNganh(sv.getMaNganh()));
        table.getCbNganhSinhVien().setSelectedItem(maNganhToTenNganh(sv.getMaNganh()));
        table.setTxtMaTKSinhVien(sv.getMaTK() + "");

    }

    public static String maNganhToTenNganh(String maNganh) { // // cái hàm này trả về tên ngành từ mã ngành DCT -> Công Nghệ Thông Tin (DCT)

        for (Nganh nganh : dsNganh) {
            if (nganh.getMaNganh().equals(maNganh)) {
                return nganh.getTenNganh() + " (" + maNganh + ")";
            }
        }
        return "";

    }

    public static String tenNganhToMaNganh(String tenNganh) {
        String maNganh = tenNganh.split("[()]")[1]; // cái "[()]" là cắt chuỗi khi gặp 2 dấu hiệu là ')' và '('
        return maNganh;
    }

    public static String checkUpdateInfo(SinhVien svCu, SinhVien svMoi) { // hàm này trả về các lỗi đã tồn tại của các thuộc tính khóa
        String errorMessage = "";
        if (!svCu.getCmnd().equals(svMoi.getCmnd())) {  // nếu sửa CMND thì 2 cái cmnd cũ mới khác nhau
            if (checkExistCMND(svMoi.getCmnd())) { //cmnd đã tồn tại
                errorMessage += "- Chứng Minh Nhân Dân\n";
            }
        }
        if (!svCu.getMaSV().equals(svMoi.getMaSV())) {
            if (checkExistMSSV(svMoi.getMaSV())) {  // mssv đã tồn tại
                errorMessage += "- Mã Số Sinh Viên\n";
            }
        }
        if (svCu.getMaTK() != svMoi.getMaTK()) {
            if (checkExistMaTaiKhoan(svMoi.getMaTK() + "")) {
                errorMessage += "- Mã Tài Khoản";
            }
        }
        return errorMessage;
    }

    public static String checkAddInfo(SinhVien svMoi) { // hàm này trả về các lỗi đã tồn tại của các thuộc tính khóa
        String errorMessage = "";

        if (checkExistCMND(svMoi.getCmnd())) { //cmnd đã tồn tại
            errorMessage += "- Chứng Minh Nhân Dân\n";
        }

        if (checkExistMSSV(svMoi.getMaSV())) {  // mssv đã tồn tại
            errorMessage += "- Mã Số Sinh Viên\n";
        }

        if (checkExistMaTaiKhoan(svMoi.getMaTK() + "")) { // mã tk tồn tại rồi
            errorMessage += "- Mã Tài Khoản";
        }

        return errorMessage;
    }

    public static void resetJPanelMoreInfo(Table table) {
        if (table.getCbTrangThaiSinhVien().getSelectedIndex() != 1) {   // cái này nó bật lại mấy cái nút nên chỉ bật cho bên trạng thái chưa xóa thôi
            table.getBtnSuaSinhVien().setEnabled(true);
        }
//        table.getBtnKhoiPhucSinhVien().setVisible(false); // tắt cái nút khôi phục đi
        table.getBtnLuuSinhVien().setEnabled(false);
        table.getTxtMSSinhVien().setEnabled(false);
        table.getTxtHoTenSinhVien().setEnabled(false);
        table.getTxtCMNDSinhVien().setEnabled(false);
        table.getTxtDanTocSinhVien().setEnabled(false);
        table.getTxtDiaChiSinhVien().setEnabled(false);
        table.getTxtGioiTinhSinhVien().setEnabled(false);
//        table.getTxtNganhSinhVien().setEnabled(false);

        table.getCbNganhSinhVien().setEnabled(false);

        table.getTxtNgaySinhSinhVien().setEnabled(false);
        table.getTxtSoDTSinhVien().setEnabled(false);
        table.getTxtNienKhoaSinhVien().setEnabled(false);
        table.getTxtTonGiaoSinhVien().setEnabled(false);
        table.getTxtMaTKSinhVien().setEnabled(false);
        table.setTxtCMNDSinhVien("");
        table.setTxtDanTocSinhVien("");
        table.setTxtDiaChiSinhVien("");
        table.setTxtGioiTinhSinhVien("");
        table.setTxtHoTenSinhVien("");
        table.setTxtMSSinhVien("");
        table.setTxtMaTKSinhVien("");
//        table.setTxtNganhSinhVien("");
        table.getCbNganhSinhVien().setSelectedIndex(0); // cái này để cái combobox ngành sinh viên nó không chứa ngành nào

        table.setTxtNgaySinhSinhVien("");
        table.setTxtNienKhoaSinhVien("");
        table.setTxtSoDTSinhVien("");
        table.setTxtTonGiaoSinhVien("");
        table.getPnMoreInfo().setVisible(false);
    }

    public static void changeBtnForTrangThai(Table table) {
        table.getBtnThemSinhVien().setEnabled(false);
        table.getBtnSuaSinhVien().setEnabled(false);
        table.getBtnXoaSinhVien().setEnabled(false);
        table.getBtnKhoiPhucSinhVien().setVisible(true);
    }

    public static void resetBtnForTrangThai(Table table) {
        table.getBtnThemSinhVien().setEnabled(true);
        table.getBtnSuaSinhVien().setEnabled(true);
        table.getBtnXoaSinhVien().setEnabled(true);
        table.getBtnKhoiPhucSinhVien().setVisible(false);
    }

    public static String compare2SinhVien(SinhVien svCu, SinhVien svMoi) {
        String result = "";
        if (!svCu.getMaSV().equals(svMoi.getMaSV())) {
            result += "Mã Sinh Vien: " + svCu.getMaSV() + "-->" + svMoi.getMaSV() + "\n";
        }
        if (!svCu.getCmnd().equals(svMoi.getCmnd())) {
            result += "CMND: " + svCu.getCmnd() + "-->" + svMoi.getCmnd() + "\n";
        }
        if (!svCu.getSoDienThoai().equals(svMoi.getSoDienThoai())) {
            result += "Số Điện Thoại: " + svCu.getSoDienThoai() + "-->" + svMoi.getSoDienThoai() + "\n";
        }
        if (!svCu.getHoTen().equals(svMoi.getHoTen())) {
            result += "Họ Tên: " + svCu.getHoTen() + "-->" + svMoi.getHoTen() + "\n";
        }
        if (!svCu.getNgaySinh().equals(svMoi.getNgaySinh())) {
            result += "Ngày Sinh: " + dateFormat.format(svCu.getNgaySinh()) + "-->" + dateFormat.format(svMoi.getNgaySinh()) + "\n";
        }
        if (!svCu.getGioiTinh().equals(svMoi.getGioiTinh())) {
            result += "Giới Tính: " + svCu.getGioiTinh() + "-->" + svMoi.getGioiTinh() + "\n";
        }
        if (!svCu.getDiaChi().equals(svMoi.getDiaChi())) {
            result += "Địa Chỉ: " + svCu.getDiaChi() + "-->" + svMoi.getDiaChi() + "\n";
        }
        if (!svCu.getDanToc().equals(svMoi.getDanToc())) {
            result += "Dân Tộc: " + svCu.getDanToc() + "-->" + svMoi.getDanToc() + "\n";
        }
        if (!svCu.getTonGiao().equals(svMoi.getTonGiao())) {
            result += "Niên Khóa: " + svCu.getNienKhoa() + "-->" + svMoi.getNienKhoa() + "\n";
        }
        if (!svCu.getMaNganh().equals(svMoi.getMaNganh())) {
            result += "Ngành: " + maNganhToTenNganh(svCu.getMaNganh()) + "-->" + maNganhToTenNganh(svMoi.getMaNganh()) + "\n";
        }
        if (result.equals("")) {
            return "Không có gì thay đổi\n";
        }
        return result;
    }

    public static SinhVien getSinhVienFromMoreInfo(Table table) {   // cái hàm này lấy thông tin từ panel Moreinfo tạo ra svien mới
        String HoTen = table.getTxtHoTenSinhVien().getText();
        String MSSV = table.getTxtMSSinhVien().getText();
        String CMND = table.getTxtCMNDSinhVien().getText();
        String SoDT = table.getTxtSoDTSinhVien().getText();
        Date NgaySinh = new Date();
        String Nganh;
        try {
            NgaySinh = dateFormat.parse(table.getTxtNgaySinhSinhVien().getText());
            Nganh = SinhVienBUS.tenNganhToMaNganh(table.getCbNganhSinhVien().getSelectedItem().toString()); // dòng này nó lấy cái phần tử đang được chọn của combobox ngành rồi chuyển về thành mã ngành

        } catch (ParseException ex) {
            // có ngoại lệ nên return về 1 sinh viên bị lỗi
            return new SinhVien(1, "", "", "", "", NgaySinh, "", "", "", "", "", "", -1);
        }
        String GioiTinh = table.getTxtGioiTinhSinhVien().getText();
        String DiaChi = table.getTxtDiaChiSinhVien().getText();
        String DanToc = table.getTxtDanTocSinhVien().getText();
        String TonGiao = table.getTxtTonGiaoSinhVien().getText();
        String NienKhoa = table.getTxtNienKhoaSinhVien().getText();
//        String Nganh = SinhVienBUS.tenNganhToMaNganh(table.getTxtNganhSinhVien().getText());
        int MaTK = Integer.parseInt(table.getTxtMaTKSinhVien().getText());
        SinhVien sv = new SinhVien(1, MSSV, CMND, SoDT, HoTen, NgaySinh, GioiTinh, DiaChi, DanToc, TonGiao, NienKhoa, Nganh, MaTK);
        return sv;
    }

    public static void updateSinhVien(Table table) { // cái hàm nàỳ sẽ bật những component cho mình sửa sinh viên
        table.getBtnSuaSinhVien().setEnabled(false);
        table.getBtnLuuSinhVien().setEnabled(true);
        table.getTxtHoTenSinhVien().setEnabled(true);
        table.getTxtCMNDSinhVien().setEnabled(true);
        table.getTxtDanTocSinhVien().setEnabled(true);
        table.getTxtDiaChiSinhVien().setEnabled(true);
        table.getTxtGioiTinhSinhVien().setEnabled(true);
//        JTextField txtNganh = table.getTxtNganhSinhVien();
        table.getCbNganhSinhVien().setEnabled(true);
        table.getTxtNgaySinhSinhVien().setEnabled(true);
        table.getTxtSoDTSinhVien().setEnabled(true);
        table.getTxtNienKhoaSinhVien().setEnabled(true);
        table.getTxtTonGiaoSinhVien().setEnabled(true);

    }

    public static void updateSinhVienToServer(Table table, SinhVien svCu, SinhVien svMoi) {
        String errorMessage = "Một số thông tin đã tồn tại rồi: \n";
        int a = JOptionPane.showConfirmDialog(table, "Bạn Muốn Lưu Sinh Viên Này ?\n" + SinhVienBUS.compare2SinhVien(svCu, svMoi));
        if (a == JOptionPane.YES_OPTION) {
            if (SinhVienBUS.checkUpdateInfo(svCu, svMoi).equals("")) {  // khi thông tin nhập vào dúng thì kiểm tra trùng
//                SinhVienDAO svDAO = new SinhVienDAO();
                svDAO.update(svCu.getMaSV(), svMoi);
                JOptionPane.showMessageDialog(table, "Sửa Thành Công");
                resetJPanelMoreInfo(table);
                dssv = svDAO.get();
            } else {    // có thông tin khóa bị trùng
                JOptionPane.showMessageDialog(table, errorMessage + checkUpdateInfo(svCu, svMoi));
            }
        }
    }

    public static void addSinhVien(Table table) {
        resetJPanelMoreInfo(table);
        table.getPnMoreInfo().setVisible(true);
        table.getBtnSuaSinhVien().setVisible(false);
        table.getBtnLuuSinhVien().setVisible(true);
        table.getBtnLuuSinhVien().setEnabled(true);
        table.getBtnXoaSinhVien().setVisible(false);

        table.getTxtMSSinhVien().setEnabled(true);
        table.getTxtHoTenSinhVien().setEnabled(true);
        table.getTxtCMNDSinhVien().setEnabled(true);
        table.getTxtDanTocSinhVien().setEnabled(true);
        table.getTxtDiaChiSinhVien().setEnabled(true);
        table.getTxtGioiTinhSinhVien().setEnabled(true);
//        table.getTxtNganhSinhVien().setEnabled(true);
        table.getCbNganhSinhVien().setEnabled(true);
        table.getTxtNgaySinhSinhVien().setEnabled(true);
        table.getTxtSoDTSinhVien().setEnabled(true);
        table.getTxtNienKhoaSinhVien().setEnabled(true);
        table.getTxtTonGiaoSinhVien().setEnabled(true);
        table.getTxtMaTKSinhVien().setEnabled(true);
    }

    public static void addSinhVienToServer(Table table, SinhVien svMoi) {
        String errorMessage = "Một số thông tin đã tồn tại rồi: \n";
        int a = JOptionPane.showConfirmDialog(table, "Bạn muốn thêm sinh viên này ?");
        if (a == JOptionPane.YES_OPTION) {
            if (SinhVienBUS.checkAddInfo(svMoi).equals("")) { // kiểm tra xem có bị trùng thông tin không
                svDAO.add(svMoi);
                JOptionPane.showMessageDialog(table, "Thêm Thành Công");
                resetJPanelMoreInfo(table);
                dssv = svDAO.get();
            } else {   // thông tin khóa bị trùng
                JOptionPane.showMessageDialog(table, errorMessage + checkAddInfo(svMoi));
            }
        }
    }

    public int getTrangThai(int MaTK) {
        return svDAO.getTrangThaiByMaTk(MaTK);
    }

    public static boolean checkHoTen(String hoTen) { // Kiểm tra tên hợp lệ không
        if (hoTen.equals("")) {
            return false;
        }

        for (int i = 0; i < hoTen.length(); i++) {
            char kiTu = hoTen.charAt(i);
            if ((kiTu < 'a' || kiTu > 'z') && (kiTu < 'A' || kiTu > 'Z') && kiTu != ' ' && !checkNguyenAm(kiTu)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkNguyenAm(char kiTu) { // cái hàm check các kí tự trong tên có dấu
        char dsNguyenAm[] = {'à', 'á', 'ả', 'ã', 'ạ', 'ă', 'Ă', 'â', 'Â', 'ằ', 'ắ', 'ẳ', 'ẵ', 'ặ', 'ầ', 'ấ', 'ẩ', 'ẫ', 'ậ',
            'ê', 'è', 'é', 'ẻ', 'ẽ', 'ẹ', 'ề', 'ế', 'ể', 'ễ', 'ệ',
            'ô', 'ơ', 'ò', 'ó', 'ỏ', 'õ', 'ọ', 'ồ', 'ố', 'ổ', 'ỗ', 'ộ', 'ờ', 'ớ', 'ở', 'ỡ', 'ợ',
            'ư', 'Ư', 'ù', 'ú', 'ủ', 'ũ', 'ụ', 'ừ', 'ứ', 'ử', 'ữ', 'ự',
            'ì', 'í', 'ỉ', 'ĩ', 'ị',
            'đ', 'Đ',
            'ỳ', 'ý', 'ỷ', 'ỹ', 'ỵ'};
        for (char nguyenAm : dsNguyenAm) {
            if (kiTu == nguyenAm) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkMSSV(String MSSV) {
        if (MSSV.length() != 10) {
            return false;
        }
        for (int i = 0; i < MSSV.length(); i++) {
            char so = MSSV.charAt(i);
            if (so < '0' || so > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean checkExistMSSV(String MSSV) { // nếu mssv tồn tại rồi trả về true
//        ArrayList<SinhVien> dssv = new ArrayList(); // Kiểm tra MSSV có tồn tại chưa
//        dssv = svDAO.get();
        for (SinhVien i : dssv) {
            if (i.getMaSV().equals(MSSV)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCMND(String CMND) {
        if (CMND.length() != 12) {
            return false;
        }
        for (int i = 0; i < CMND.length(); i++) {
            char so = CMND.charAt(i);
            if (so < '0' || so > '9') {
                return false;
            }
        }
//        ArrayList<SinhVien> dssv = new ArrayList(); // Kiểm tra CMND có tồn tại chưa
//        dssv = svDAO.get();
        return true;
    }

    public static boolean checkExistCMND(String CMND) {
        for (SinhVien i : dssv) {
            if (i.getCmnd().equals(CMND)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkGioiTinh(String gioiTinh) {
        if (!gioiTinh.equals("Nữ") && !gioiTinh.equals("Nam")) {
            return false;
        }
        return true;
    }

    public static boolean checkDanToc(String danToc) {
        String[] dsDanToc = {"Kinh", "Tày", "Thái", "Mường", "Nùng", "H'Mông", "Dao", "Gia Rai", "Ê Đê", "Ba Na", "Chăm",
            "Sán Chay", "Cơ Ho", "Xơ Đăng", "Khơ Mú", "Giáy", "Lào", "La Chí", "La Ha", "Pu Péo", "Ro Măm",
            "Mạ", "Co", "Ta Ôi", "Chu Ru", "Lô Lô", "Kháng", "Xinh Mun", "Hrê", "Ra Glai", "Mnông", "Thổ",
            "Brâu", "Ơ Đu", "Khmer", "Chuông", "Mạ Pờ Lồ", "Rơ Măm", "Khơ Me", "Khơ Mạ", "Bru - Vân Kiều",
            "Thái Đen", "Cơ Tu", "Giẻ Triêng", "Tà Ôi", "Mạ Đức", "Cống", "Bố Y", "Si La", "Pu Thê", "Rơ Ngao",
            "La Hủ", "Lự", "Phù Lá", "Ngái", "Si Đăng", "Pu Ko", "Ba Na", "Xuống", "Krông", "Lự", "Lô Lô",
            "Chứt", "Mảng", "Cờ Lao", "Bố Y", "Lô Lô Si La", "Pà Thẻn", "Cống", "Si La", "La Hủ", "Lự", "Phù Lá",
            "Ngái", "Si Đăng", "Pu Ko", "Ba Na", "Xuống", "Krông", "Lự", "Lô Lô", "Chứt", "Mảng", "Cờ Lao",
            "Bố Y", "Lô Lô Si La", "Pà Thẻn"};
        for (String dsDanToc1 : dsDanToc) {
            if (danToc.equals(dsDanToc1)) {
                return true;
            }
        }
        return false;

    }

    public static boolean checkTonGiao(String tonGiao) {
        // 10 tôn giáo phổ biến nhất Việt Nam
        String[] dsTonGiao = {"Không", "Phật giáo", "Thiên chúa giáo", "Hòa hảo", "Cao Đài", "Đạo Bửu Sơn Kỳ Hương",
            "Đạo Tứ Ân Hiếu Nghĩa", "Đạo Tam Kỳ Khổng Tử", "Đạo Tứ Thánh Tâm Minh", "Đạo Đức Thanh Minh",
            "Đạo Minh Lý Phật"};
        for (String dsTonGiao1 : dsTonGiao) {
            if (tonGiao.equals(dsTonGiao1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSoDienThoai(String soDienThoai) {
        if (soDienThoai.length() != 10) {
            return false;
        }
        for (int i = 0; i < soDienThoai.length(); i++) {
            char so = soDienThoai.charAt(i);
            if (so < '0' || so > '9') {
                return false;
            }
        }
        // Khúc này kiểm tra đầu số có tồn tại trong 30 đầu số phổ biến nhất không
        String[] dsDauSoDienThoai = {"086", "096", "097", "098", "032", "033", "034", "035", "036", "037",
            "038", "039", "088", "091", "094", "083", "084", "085", "081", "082", "089",
            "090", "093", "070", "079", "077", "076", "078", "092", "056", "058", "012", "011", "013", "014", "015", "010", "016", "017"};
        String dauSoDienThoai = soDienThoai.substring(0, 3); // lấy 3 số đầu
        int flag = 0;
        for (String i : dsDauSoDienThoai) {
            if (dauSoDienThoai.equals(i)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return false;
        }
        // ---------------------------------------------------------
        return true;
    }

    public static boolean checkDiaChi(String diaChi) {
        if (diaChi.length() == 0) {
            return false;
        }
        for (int i = 0; i < diaChi.length(); i++) {
            char kitu = diaChi.charAt(i);
            // các kí tự là chữ hoặc số hoặc dấu '/' thôi
            if (!checkNguyenAm(kitu) && kitu != '/' && kitu != ' ' && kitu != '.' && (kitu < '0' || kitu > '9') && (kitu < 'a' || kitu > 'z') && (kitu < 'A' || kitu > 'Z')) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkNienKhoa(String nienKhoa) {
        int namVaoTruong, namRaTruong;
        try {
            namVaoTruong = Integer.parseInt(nienKhoa.split("-")[0]);
            namRaTruong = Integer.parseInt(nienKhoa.split("-")[1]);
        } catch (Exception e) {
            return false;
        }
        if (namRaTruong - namVaoTruong < 4 || namRaTruong - namVaoTruong > 10) {
            return false;
        }
        Date today = new Date();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        int namHienTai = Integer.parseInt(yearFormat.format(today));
        if (namVaoTruong > namHienTai) {
            return false;
        }
        return true;
    }

    public static boolean checkNgaySinh(String ngaySinh) {
        if (ngaySinh.length() != 10) { // 1999-07-08 -> true 1999-7-8 -> false
            return false;
        }
        try {
            dateFormat.parse(ngaySinh);
        } catch (Exception e) {
            return false;
        }
        if (!checkValidNgay(ngaySinh)) {
            return false;
        }
        return true;
    }

    public static boolean checkNganh(String nganh) { // tham số truyền vao kiểu 'Công Nghệ Thông Tin (DCT)'
//        String dsMaNganh[] = {"DAN","DCT","DHO","DKE","DKH","DKP","DKQ","DLI","DQK","DSA","DSI","DTN"};
        ArrayList<Nganh> dsNganh = new ArrayList();
        dsNganh = new NganhDAO().get();
        String maNganh;
        String tenNganh;
        try {
            maNganh = tenNganhToMaNganh(nganh); // cái ngành truyền vào là kiểu "Sư Phạm Hóa (DHO)"
            tenNganh = maNganhToTenNganh(maNganh); // nên phải chuyển từ cái ngành sang mã ngành rồi chuyển lại thành tên ngành
        } catch (Exception e) {
            return false;
        }
        if (!tenNganh.equals(nganh)) { // cái này kiểm tra mã ngành với tên ngành k khớp nhau vd: Kế Toán (DKE) -> true mà nhập Kế Toán (DCT)
            return false;
        }
        for (Nganh i : dsNganh) {
            if (i.getMaNganh().equals(maNganh)) { // so sánh mã ngành nếu tồn tại thì so sánh luôn tên ngành
                if (maNganhToTenNganh(i.getMaNganh()).equals(nganh)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkMaTaiKhoan(String maTaiKhoan) {
        int intMaTaiKhoan;
        try {
            intMaTaiKhoan = Integer.parseInt(maTaiKhoan);
        } catch (Exception e) {
            return false;
        }
        if (intMaTaiKhoan < 0) {
            return false;
        }

        return true;
    }

    public static boolean checkExistMaTaiKhoan(String maTaiKhoan) {
        int intMaTaiKhoan;
        try {
            intMaTaiKhoan = Integer.parseInt(maTaiKhoan);
        } catch (Exception e) {
            return false;
        }
        ArrayList<TaiKhoan> dsTaiKhoan = new TaiKhoanDAO().get();
        for (TaiKhoan tk : dsTaiKhoan) {
            if (tk.getMaTK() == intMaTaiKhoan) { // mã tài khoản đã tồn tại
                return true;
            }
        }
        return false;
    }
    //--------------------------- Các hàm dưới đây để kiểm tra ngày sinh của sinh viên-------------------------------------------

    public static boolean checkValidNgay(String ngay) {  //kiem tra xem ngay dang xet co hop le khong
        String ngaythangnam[] = ngay.split("-"); // Tách cái chuỗi ngày ra để lấy từng phần tử
        int soNgay = Integer.parseInt(ngaythangnam[2]);
        int soThang = Integer.parseInt(ngaythangnam[1]);
        int soNam = Integer.parseInt(ngaythangnam[0]);
        Date today = new Date();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        int namHienTai = Integer.parseInt(yearFormat.format(today));
        if (namHienTai - soNam > 100 || namHienTai - soNam < 18) {
            return false;
        }
        if (soThang < 1 || soThang > 12) {
            return false;
        }
        if (soNgay < 1 || soNgay > soNgayTrongThang(soThang, soNam)) {
            return false;
        }
        return true;

    }

    public static boolean checkNamNhuan(int nam) {  // kiem tra xem nam dang xet co phai nam nhuan khong 
        if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int soNgayTrongThang(int thang, int nam) { // tim so ngay trong thang tuong ung
        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                if (checkNamNhuan(nam)) {
                    return 29;
                }
                return 28;
            }
        }
        return 0;
    }
// ---------------------------------------------------------------------------------------------------------------

    public static boolean checkAllInfo(SinhVien sv) {
        if (!checkCMND(sv.getCmnd()) || !checkDanToc(sv.getDanToc()) || !checkDiaChi(sv.getDiaChi())
                || !checkGioiTinh(sv.getGioiTinh()) || !checkHoTen(sv.getHoTen()) || !checkMSSV(sv.getMaSV())
                || !checkMaTaiKhoan(sv.getMaTK() + "") || !checkNganh(maNganhToTenNganh(sv.getMaNganh())) || !checkNgaySinh(dateFormat.format(sv.getNgaySinh()))
                || !checkNienKhoa(sv.getNienKhoa()) || !checkSoDienThoai(sv.getSoDienThoai()) || !checkTonGiao(sv.getTonGiao())) {

            return false;
        }
        return true;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
//        svDAO.get().forEach(sv -> {
//            System.out.println(sv.toString());
//        });
//        for (SinhVien sv : svDAO.get()) {
//
//        }
//        svDAO.get();

    }
}
