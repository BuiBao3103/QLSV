/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLSinhVien;

import connectDB.ConnectionDB;
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

    public static void main(String[] args) {
        ArrayList<SinhVien> dssv = new SinhVienDAO().get();
        Date ngay = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(ngay.toString());
        System.out.println();
        try {
            System.out.println(java.sql.Date.valueOf(format.format(ngay)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dssv.get(5).getNgaySinh().toString());
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

    public void restore(String maSV) {
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
}
