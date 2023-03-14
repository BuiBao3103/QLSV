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

    Connection con = ConnectionDB.getConnection();

    public SinhVienDAO() {
    }

    public ArrayList<SinhVien> get() {
        con = ConnectionDB.getConnection();
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
            String query = "select * from SinhVien";//+
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
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
            ConnectionDB.closeConnection(con);
        }
        return dssv;//+
    }

    public static void main(String[] args) {
        (new SinhVienDAO()).get();
        System.out.println("yes");
    }

    public void add(SinhVien sv) {
        con = ConnectionDB.getConnection();
        try {
            String query = "INSERT INTO SinhVien VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";//++
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, sv.getTrangThai());
            st.setString(2, sv.getMaSV());//+
            st.setString(3, sv.getCmnd());//+
            st.setString(4, sv.getSoDienThoai());
            st.setString(5, sv.getHoTen());//+
            st.setDate(6, (java.sql.Date) sv.getNgaySinh());
            st.setString(7, sv.getGioiTinh());//+
            st.setString(8, sv.getDiaChi());//+
            st.setString(9, sv.getDanToc());//+
            st.setString(10, sv.getTonGiao());//+
            st.setString(11, sv.getNienKhoa());//+
            st.setString(12, sv.getMaNganh());//+
            st.setInt(13, sv.getMaTK());//+

            st.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void update(String maSV, SinhVien sv) {

        try {
            con = ConnectionDB.getConnection();
            String query = "UPDATE SinhVien SET TrangThai = ?,MaSV = ?, Cmnd= ?,SoDienThoai = ?, HoTen= ?, "
                    + "NganhSinh=?,GioiTinh=?, DiaChi=?, DanToc=?, TonGiao=?, "
                    + "NienKhoa=?, MaNganh=?, MaTK=? WHERE MaSV=?";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, sv.getTrangThai());
            st.setString(2, sv.getMaSV());//+
            st.setString(3, sv.getCmnd());//+
            st.setString(4, sv.getSoDienThoai());
            st.setString(5, sv.getHoTen());//+
            st.setDate(6, (java.sql.Date) sv.getNgaySinh());
            st.setString(7, sv.getGioiTinh());//+
            st.setString(8, sv.getDiaChi());//+
            st.setString(9, sv.getDanToc());//+
            st.setString(10, sv.getTonGiao());//+
            st.setString(11, sv.getNienKhoa());//+
            st.setString(12, sv.getMaNganh());//+
            st.setInt(13, sv.getMaTK());//+
            st.setString(14, maSV);//+

            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void delete(String maSV) {
        try {
            con = ConnectionDB.getConnection();
            String query = "DELETE FROM SinhVien WHERE MaSV=?;";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, maSV);//+
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }
}
