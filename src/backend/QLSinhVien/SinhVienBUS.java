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

    public SinhVienBUS() {
    }

    public static void showStudentList(JTable table) {

        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        tblSinhVien.setColumnCount(0); // xóa hết để cái bảng trống rồi mới thêm dữ liệu zo
        tblSinhVien.setColumnIdentifiers(new Object[]{ // đặt tên các cột
            "MSSV", "Họ Tên", "Ngành", "Niên Khóa"
        });

        table.getColumn("MSSV").setMinWidth(150);
        table.getColumn("MSSV").setMaxWidth(150);
        table.getColumn("Ngành").setMaxWidth(350);
        table.getColumn("Ngành").setMinWidth(350);
        table.getColumn("Niên Khóa").setMaxWidth(100);
        table.getColumn("Niên Khóa").setMinWidth(100);

        for (SinhVien i : dssv) {
            if (i.getTrangThai() == 1) {
                tblSinhVien.addRow(new Object[]{
                    i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
                });
            }
        }

        //--------------------Khúc này chỉnh các thuộc tính cho cái bảng -----------------------------------------------------
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
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
    }

    public static void showStudentListWithCondition(JTable table, String condition) {
        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        tblSinhVien.setColumnCount(0); // xóa hết để cái bảng trống rồi mới thêm dữ liệu zo
        tblSinhVien.setColumnIdentifiers(new Object[]{ // đặt tên các cột
            "MSSV", "Họ Tên", "Ngành", "Niên Khóa"
        });

        ArrayList<SinhVien> dssvNew = new ArrayList();
        for (SinhVien i : dssv) {
            if (i.getMaSV().contains(condition) || i.getHoTen().contains(condition) || maNganhToTenNganh(i.getMaNganh()).contains(condition)) {
                dssvNew.add(i);
            }
        }
        if (dssvNew.isEmpty()) {
            JOptionPane.showMessageDialog(table, "Không tìm thấy sinh viên nào\n");
        }
        for (SinhVien i : dssvNew) {
            if (i.getTrangThai() == 1) {
                tblSinhVien.addRow(new Object[]{
                    i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
                });
            }
        }
// --------------------Nguyên khúc này tùy chỉnh cái bảng thôi --------------------------------------------
        table.getColumn("MSSV").setMinWidth(150);
        table.getColumn("MSSV").setMaxWidth(150);
        table.getColumn("Ngành").setMaxWidth(350);
        table.getColumn("Ngành").setMinWidth(350);
        table.getColumn("Niên Khóa").setMaxWidth(100);
        table.getColumn("Niên Khóa").setMinWidth(100);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
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
//---------------------------------------------------------------------------------------------------------------

    }

    public static SinhVien StudentinTable(JTable table, int row) { //hàm này trả về sinh viên ở dòng được chọn trong bảng
//        ArrayList<SinhVien> dssv = new ArrayList();
//        dssv = svDAO.get();
        String mssv = table.getValueAt(row, 0) + ""; // cái dòng này sẽ từ cái dòng được chọn trong bảng lấy ra giá trị trong ô mssv
        for (SinhVien sv : dssv) {
            if (sv.getMaSV().equals(mssv)) {
                return sv;
            }
        }
        return null;
    }

    public static void showMoreInfoStudent(Table table, SinhVien sv) {
//        if (!info.isVisible()) { // cái này kiểm tra xem có mở cửa sổ thông tin sinh viên chưa
//            info.setVisible(true); // mở rồi thì chỉ cần thay đổi giá trị trong bảng thôi
//        }
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
        table.setTxtNganhSinhVien(maNganhToTenNganh(sv.getMaNganh()));
        table.setTxtMaTKSinhVien(sv.getMaTK() + "");

    }

    public static String maNganhToTenNganh(String maNganh) { // cái hàm này trả về tên ngành từ mã ngành
        if (maNganh.equals("DCT")) {
            return "Công Nghệ Thông Tin (DCT)";
        }
        if (maNganh.equals("DKP")) {
            return "Kĩ Thuật Phần Mềm (DKP)";
        }
        if (maNganh.equals("DAN")) {
            return "Ngôn Ngữ Anh (DAN)";
        }
        if (maNganh.equals("DSA")) {
            return "Sư Phạm Tiếng Anh (DSA)";
        }
        if (maNganh.equals("DQK")) {
            return "Quản Trị Kinh Doanh (DQK)";
        }
        if (maNganh.equals("DKQ")) {
            return "Kinh Doanh Quốc Tế (DKQ)";
        }
        if (maNganh.equals("DSI")) {
            return "Sư Phạm Sinh Học (DSI)";
        }
        if (maNganh.equals("DKH")) {
            return "Sư Phạm Khoa Học Tự Nhiên (DKH)";
        }
        if (maNganh.equals("DLI")) {
            return "Sư Phạm Lí (DLI)";
        }
        if (maNganh.equals("DHO")) {
            return "Sư Phạm Hóa (DHO)";
        }
        if (maNganh.equals("DTN")) {
            return "Tài Chính - Ngân Hàng (DTN)";
        }
        if (maNganh.equals("DKE")) {
            return "Kế Toán (DKE)";
        } else {
            return "";
        }
    }

    public static String tenNganhToMaNganh(String tenNganh) {
        String maNganh = tenNganh.split("[()]")[1]; // cái "[()]" là cắt chuỗi khi gặp 2 dấu hiệu là ')' và '('
        return maNganh;
    }

    public static String checkUpdateInfo(SinhVien svCu, SinhVien svMoi) { // hàm này trả về các lỗi đã tồn tại của các thuộc tính khóa
        String errorMessage = "";
        if (!svCu.getCmnd().equals(svMoi.getCmnd())) {
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

    public static void updateSinhVien(Table table) {
        table.getBtnSuaSinhVien().setEnabled(false);
        table.getBtnLuuSinhVien().setEnabled(true);
        JTextField txtHoTen = table.getTxtHoTenSinhVien();
        JTextField txtCMND = table.getTxtCMNDSinhVien();
        JTextField txtDanToc = table.getTxtDanTocSinhVien();
        JTextField txtDiaChi = table.getTxtDiaChiSinhVien();
        JTextField txtGioiTinh = table.getTxtGioiTinhSinhVien();
        JTextField txtNganh = table.getTxtNganhSinhVien();
        JTextField txtNgaySinh = table.getTxtNgaySinhSinhVien();
        JTextField txtSoDienThoai = table.getTxtSoDTSinhVien();
        JTextField txtNienKhoa = table.getTxtNienKhoaSinhVien();
        JTextField txtTonGiao = table.getTxtTonGiaoSinhVien();
        txtHoTen.setEnabled(true);
        txtCMND.setEnabled(true);
        txtDanToc.setEnabled(true);
        txtDiaChi.setEnabled(true);
        txtGioiTinh.setEnabled(true);
        txtNganh.setEnabled(true);
        txtNgaySinh.setEnabled(true);
        txtSoDienThoai.setEnabled(true);
        txtNienKhoa.setEnabled(true);
        txtTonGiao.setEnabled(true);

    }

    public static void resetJPanelMoreInfo(Table table) {
        table.getBtnSuaSinhVien().setEnabled(true);
        table.getBtnLuuSinhVien().setEnabled(false);
        table.getTxtHoTenSinhVien().setEnabled(false);
        table.getTxtCMNDSinhVien().setEnabled(false);
        table.getTxtDanTocSinhVien().setEnabled(false);
        table.getTxtDiaChiSinhVien().setEnabled(false);
        table.getTxtGioiTinhSinhVien().setEnabled(false);
        table.getTxtNganhSinhVien().setEnabled(false);
        table.getTxtNgaySinhSinhVien().setEnabled(false);
        table.getTxtSoDTSinhVien().setEnabled(false);
        table.getTxtNienKhoaSinhVien().setEnabled(false);
        table.getTxtTonGiaoSinhVien().setEnabled(false);
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

    public static SinhVien getSinhVienFromMoreInfo(Table table) {
        String HoTen = table.getTxtHoTenSinhVien().getText();
        String MSSV = table.getTxtMSSinhVien().getText();
        String CMND = table.getTxtCMNDSinhVien().getText();
        String SoDT = table.getTxtSoDTSinhVien().getText();
        Date NgaySinh = new Date();
        try {
            NgaySinh = dateFormat.parse(table.getTxtNgaySinhSinhVien().getText());
        } catch (ParseException ex) {
            System.out.println("Chuyển kiểu sang date bị lỗi ở StudentInfo.btnSuaSinhVien");
        }
        String GioiTinh = table.getTxtNgaySinhSinhVien().getText();
        String DiaChi = table.getTxtDiaChiSinhVien().getText();
        String DanToc = table.getTxtDanTocSinhVien().getText();
        String TonGiao = table.getTxtTonGiaoSinhVien().getText();
        String NienKhoa = table.getTxtNienKhoaSinhVien().getText();
        String Nganh = SinhVienBUS.tenNganhToMaNganh(table.getTxtNganhSinhVien().getText());
        int MaTK = Integer.parseInt(table.getTxtMaTKSinhVien().getText());
        SinhVien sv = new SinhVien(1, MSSV, CMND, SoDT, HoTen, NgaySinh, GioiTinh, DiaChi, DanToc, TonGiao, NienKhoa, Nganh, MaTK);
        return sv;
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
            "090", "093", "070", "079", "077", "076", "078", "092", "056", "058", "012", "011", "013", "014", "015", "010176", ""};
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

    public static boolean checkNganh(String nganh) {
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
        if (!tenNganh.equals(nganh)) { // cái này kiểm tra mã ngành với tên ngành k khớp nhau
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

    //-----------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
//        svDAO.get().forEach(sv -> {
//            System.out.println(sv.toString());
//        });
//        for (SinhVien sv : svDAO.get()) {
//
//        }
//        svDAO.get();
        System.out.println('ă' == 'ă');
    }
}
