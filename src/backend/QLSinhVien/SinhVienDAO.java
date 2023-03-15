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
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class SinhVienDAO {

    Connection con = null;
    PreparedStatement pstm = null;

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
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");
                SinhVien sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
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
        (new SinhVienDAO()).get();
        System.out.println("yes");
    }

    public void add(SinhVien sv) {
        con = ConnectionDB.getConnection();
        try {
            String query = "INSERT INTO SinhVien VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";//++
            pstm = con.prepareStatement(query);
            pstm.setInt(1, sv.getTrangThai());
            pstm.setString(2, sv.getMaSV());//+
            pstm.setString(3, sv.getCmnd());//+
            pstm.setString(4, sv.getSoDienThoai());
            pstm.setString(5, sv.getHoTen());//+
            pstm.setDate(6, (java.sql.Date) sv.getNgaySinh());
            pstm.setString(7, sv.getGioiTinh());//+
            pstm.setString(8, sv.getDiaChi());//+
            pstm.setString(9, sv.getDanToc());//+
            pstm.setString(10, sv.getTonGiao());//+
            pstm.setString(11, sv.getNienKhoa());//+
            pstm.setString(12, sv.getMaNganh());//+
            pstm.setInt(13, sv.getMaTK());//+

            pstm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void update(String maSV, SinhVien sv) {
        con = ConnectionDB.getConnection();
        try {
            String query = "UPDATE SinhVien SET TrangThai = ?,MaSV = ?, Cmnd= ?,SoDienThoai = ?, HoTen= ?, "
                    + "NganhSinh=?,GioiTinh=?, DiaChi=?, DanToc=?, TonGiao=?, "
                    + "NienKhoa=?, MaNganh=?, MaTK=? WHERE MaSV=?";//+
            pstm = con.prepareStatement(query);
            pstm.setInt(1, sv.getTrangThai());
            pstm.setString(2, sv.getMaSV());//+
            pstm.setString(3, sv.getCmnd());//+
            pstm.setString(4, sv.getSoDienThoai());
            pstm.setString(5, sv.getHoTen());//+
            pstm.setDate(6, (java.sql.Date) sv.getNgaySinh());
            pstm.setString(7, sv.getGioiTinh());//+
            pstm.setString(8, sv.getDiaChi());//+
            pstm.setString(9, sv.getDanToc());//+
            pstm.setString(10, sv.getTonGiao());//+
            pstm.setString(11, sv.getNienKhoa());//+
            pstm.setString(12, sv.getMaNganh());//+
            pstm.setInt(13, sv.getMaTK());//+
            pstm.setString(14, maSV);//+

            ResultSet rs = pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maSV) {
        con = ConnectionDB.getConnection();
        try {
            String query = "DELETE FROM SinhVien WHERE MaSV=?;";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, maSV);//+
            ResultSet rs = pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }
}
