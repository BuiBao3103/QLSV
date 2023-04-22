/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLSinhVien;

import connectDB.ConnectionDB;
import frontend.StudentInfor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class SinhVienDAO {

    Connection con = null;
    PreparedStatement pstm = null;
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public SinhVienDAO() {
    }

    public ArrayList<SinhVien> get() {
        con = ConnectionDB.getConnection();
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
            String query = "select * from SinhVien";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dssv;//+
    }

    public ArrayList<SinhVien> getByKhoa(String maKhoa) { // hàm này lấy dssv theo mã khoa truyền vào
        con = ConnectionDB.getConnection();
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
//            String query = "select * from SinhVien where MaKhoa=?";//+
            String query = "select sv.*\n from SINHVIEN sv join NGANH ng on sv.MaNganh = ng.MaNganh\n where ng.MaKhoa = '?'";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maKhoa);//+
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dssv;//+
    }

    public int getTrangThaiByMaTk(int MaTK) {
        con = ConnectionDB.getConnection();
        try {
            String query = "select TrangThai from SinhVien where MaTK = ?";//+
            pstm = con.prepareStatement(query);
            pstm.setInt(1, MaTK);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                SinhVien sv = new SinhVien(trangThai);
                return sv.getTrangThai();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return -1;
    }

    public void add(SinhVien sv) {
        con = ConnectionDB.getConnection();
        try {
            String query = "INSERT INTO SinhVien VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";//++
            pstm = con.prepareStatement(query);
            pstm.setInt(1, sv.getTrangThai());
            pstm.setString(2, sv.getMaSV());//+
            pstm.setString(3, sv.getCmnd());//+
            pstm.setString(4, sv.getSoDienThoai());
            pstm.setString(5, sv.getMaLop());
            pstm.setString(6, sv.getHoTen());//+
            pstm.setDate(7, java.sql.Date.valueOf(dateFormat.format(sv.getNgaySinh())));
            pstm.setString(8, sv.getGioiTinh());//+
            pstm.setString(9, sv.getDiaChi());//+
            pstm.setString(10, sv.getDanToc());//+
            pstm.setString(11, sv.getTonGiao());//+
            pstm.setString(12, sv.getNienKhoa());//+
            pstm.setString(13, sv.getMaNganh());//+
            pstm.setInt(14, sv.getMaTK());//+

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void update(String maSV, SinhVien sv) {
        con = ConnectionDB.getConnection();
        try {
            String query = "UPDATE SinhVien SET TrangThai = ?,MaSV = ?, Cmnd= ?,SoDienThoai = ?,MaLop = ?, HoTen= ?, "
                    + "NgaySinh=?,GioiTinh=?, DiaChi=?, DanToc=?, TonGiao=?, "
                    + "NienKhoa=?, MaNganh=?, MaTK=? WHERE MaSV=?";//+
            pstm = con.prepareStatement(query);
            pstm.setInt(1, sv.getTrangThai());
            pstm.setString(2, sv.getMaSV());//+
            pstm.setString(3, sv.getCmnd());//+
            pstm.setString(4, sv.getSoDienThoai());
            pstm.setString(5, sv.getMaLop());
            pstm.setString(6, sv.getHoTen());//+
            pstm.setDate(7, java.sql.Date.valueOf(dateFormat.format(sv.getNgaySinh())));
            pstm.setString(8, sv.getGioiTinh());//+
            pstm.setString(9, sv.getDiaChi());//+
            pstm.setString(10, sv.getDanToc());//+
            pstm.setString(11, sv.getTonGiao());//+
            pstm.setString(12, sv.getNienKhoa());//+
            pstm.setString(13, sv.getMaNganh());//+
            pstm.setInt(14, sv.getMaTK());//+
            pstm.setString(15, maSV);//+

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maSV) {
        con = ConnectionDB.getConnection();
        try {
//            String query = "DELETE FROM SinhVien WHERE MaSV=?;";//+
            String query = "UPDATE SinhVien SET TrangThai = 0 WHERE MaSV=?;";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maSV);//+
            pstm.executeUpdate();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void restore(String maSV) { // hàm này khôi phục sinh viên đã xóa
        con = ConnectionDB.getConnection();
        try {
//            String query = "DELETE FROM SinhVien WHERE MaSV=?;";//+
            String query = "UPDATE SinhVien SET TrangThai = 1 WHERE MaSV=?;";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maSV);//+
            pstm.executeUpdate();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public String maxMaSV(String year) { // cái hàm này lấy ra mã sv lớn nhất của năm hiện tại
        con = ConnectionDB.getConnection();
        try {
//            String query = "DELETE FROM SinhVien WHERE MaSV=?;";//+
            String query = "SELECT max(MaSV) FROM SinhVien WHERE MaSV like '31" + year + "%'"; // chèn cái năm vào '?'
            pstm = con.prepareStatement(query);
//            pstm.setString(1, year);//+
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getString("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return "";
    }

    public int maxMaTK() { // hàm này lấy ra mã tài khoản lớn nhất
        con = ConnectionDB.getConnection();
        try {
            String query = "SELECT max(MaTK) FROM TaiKhoan"; //
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return -1;
    }

    public String maxLopWithMaNganh(String maNganh, String year) { // hàm này lấy các lớp cuối theo từng ngành trong từng năm
        con = ConnectionDB.getConnection();
        try {
            String query = "SELECT max(MaLop) FROM Lop WHERE MaLop like '" + maNganh + "1" + year + "%'"; // chèn cái mã ngành và năm vào vd: DCT123%
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getString("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return "";
    }

    public int getNumberOfStudent() { // hàm này trả về số lượng sinh viên đang hoạt động
        con = ConnectionDB.getConnection();
        try {
            String query = "SELECT Count(MaSV) FROM SinhVien WHERE TrangThai = 1";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return -1;
    }

    public int getNumberOfDeletedStudent() { // hàm này trả về số lượng sinh viên đã xóa
        con = ConnectionDB.getConnection();
        try {
            String query = "SELECT Count(MaSV) FROM SinhVien WHERE TrangThai = 0";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return -1;
    }

    public ArrayList<SinhVien> getByNumberOfPage(int page) { // hàm này lấy dssv theo số trang đang xét
        con = ConnectionDB.getConnection();
        int nextStudent = (page - 1) * 20; // page 1 sẽ lấy từ 1->100 svien, page 2 sẽ lấy từ 101->200 svien
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
//            String query = "select * from SinhVien where MaKhoa=?";//+
            String query = "SELECT *\n"
                    + "FROM SINHVIEN \n"
                    + "WHERE TrangThai = 1\n"
                    + "ORDER BY MaSV\n"
                    + "OFFSET ?  rows\n" // offset là tính từ Svien nào, offset 0 thì lấy từ 1->100 , trong sql tính từ dòng 1
                    + "FETCH NEXT 20 ROWS ONLY;";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, nextStudent);//+
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dssv;//+
    }

    public ArrayList<SinhVien> getDeletedStudentByNumberOfPage(int page) { // hàm này lấy dssv theo số trang đang xét
        con = ConnectionDB.getConnection();
        int nextStudent = (page - 1) * 20; // page 1 sẽ lấy từ 1->100 svien, page 2 sẽ lấy từ 101->200 svien
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
//            String query = "select * from SinhVien where MaKhoa=?";//+
            String query = "SELECT *\n"
                    + "FROM SINHVIEN \n"
                    + "WHERE TrangThai = 0\n"
                    + "ORDER BY MaSV\n"
                    + "OFFSET ?  rows\n" // offset là tính từ Svien nào, offset 0 thì lấy từ 1->100 , trong sql tính từ dòng 1
                    + "FETCH NEXT 20 ROWS ONLY;";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, nextStudent);//+
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dssv;//+
    }

    public ArrayList<SinhVien> getByHoTen(String HoTen) { // hàm này lấy dssv theo họ tên truyền vào
        con = ConnectionDB.getConnection();
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
//            String query = "select * from SinhVien where MaKhoa=?";//+
            String query = "SELECT * FROM SinhVien WHERE HoTen like N'%" + HoTen + "%'";
            pstm = con.prepareStatement(query);
//            pstm.setString(1, HoTen);//+
//            System.out.println(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dssv;//+
    }

    public ArrayList<SinhVien> getByMaSV(String MaSV) { // hàm này lấy dssv theo Mã SV truyền vào
        con = ConnectionDB.getConnection();
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
//            String query = "select * from SinhVien where MaKhoa=?";//+
            String query = "SELECT * FROM SinhVien WHERE MaSV like '%" + MaSV + "%'";
            pstm = con.prepareStatement(query);
//            pstm.setString(1, HoTen);//+
//            System.out.println(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dssv;//+
    }

    public ArrayList<SinhVien> getByNganh(String TenNganh) { // hàm này lấy dssv theo Mã SV truyền vào
        con = ConnectionDB.getConnection();
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
//            String query = "select * from SinhVien where MaKhoa=?";//+
            String query = "SELECT * FROM SINHVIEN sv join NGANH n on sv.MaNganh = n.MaNganh WHERE n.MaNganh like '%" + TenNganh + "%' or n.TenNganh like N'%" + TenNganh + "%'";
            pstm = con.prepareStatement(query);
//            pstm.setString(1, TenNganh);//+
//            pstm.setString(2, TenNganh);
//            System.out.println(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dssv;//+
    }

    public ArrayList<SinhVien> getByCondition(String CondiTion, String conditionName) { // hàm này lấy dssv theo mã khoa truyền vào
        con = ConnectionDB.getConnection();
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        if (conditionName.equals("Tên")) {
            dssv = getByHoTen(CondiTion);
        } else if (conditionName.equals("MSSV")) {
            dssv = getByMaSV(CondiTion);
        } else {
            dssv = getByNganh(CondiTion);
        }
        ConnectionDB.closeConnection(con, pstm);
        return dssv;//+
    }
    public ArrayList<SinhVien> getByFilter(StudentInfor stu){
        con = ConnectionDB.getConnection();
        String giaTriTen = stu.getTimKiemTen();
        String giaTriMSSV = stu.getTimKiemMSSV();
        String giaTriNganh = stu.getTimKiemNganh(); // sau khi lọc các giá trị kia thì lọc lại ngành bằng SinhVienBUS
        String giaTriLop = stu.getTimKiemLop();
        String giaTriGioiTinh = stu.getTimKiemGioiTinh();
        String giaTriNamSinh = stu.getTimKiemNamSinh();
        String giaTriKhoa = stu.getTimKiemKhoa(); // sau khi lọc các giá trị kia thì lọc lại Khóa bằng SinhVienBUS
               
        ArrayList<SinhVien> dssv = new ArrayList<>();
        try {
            String query = "select * from SinhVien where HoTen like N'%"+giaTriTen+"%' "
                    +"and maSV like '%"+giaTriMSSV+"%' "
                    +"and MaLop like '%"+giaTriLop+"%' "
                    +"and GioiTinh like N'%"+giaTriGioiTinh+"%' "
                    +"and YEAR(NgaySinh) like '%"+giaTriNamSinh+"%'";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dssv;//+
        
    }
    
    public static void main(String[] args) {
//        ArrayList<SinhVien> dssv = new SinhVienDAO().getByNganh("Công");
//        Date ngay = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//
//        System.out.println(ngay.toString());
//        System.out.println();
//        try {
//            System.out.println(java.sql.Date.valueOf(format.format(ngay)));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(dssv.get(5).getNgaySinh().toString());
//            System.out.println(new SinhVienDAO().getNumberOfDeletedStudent());
//            System.out.println((int)Math.ceil(1067/100.0));
//        for(SinhVien sv: dssv){
//            System.out.println(sv.toString());
//        }
    }
}
