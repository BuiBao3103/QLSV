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
        ArrayList<SinhVien> dssv = new ArrayList<>();//+
        try {
            String query = "select * from SinhVien";//+
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");//+
                String cmnd = rs.getString("Cmnd");//+
                String hoTen = rs.getString("HoTen");//+
                Date ngaySinh = rs.getDate("NgaySinh");//+
                String gioiTinh = rs.getString("GioiTinh");//+
                String diaChi = rs.getString("DiaChi");//+
                String danToc = rs.getString("DanToc");//+
                String tonGiao = rs.getString("TonGiao");//+
                String nienKhoa = rs.getString("NienKhoa");//+
                String maNganh = rs.getString("MaNganh");//+
                int maTK = rs.getInt("MaTK");

                SinhVien sv = new SinhVien(maSV, cmnd, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);//+
                dssv.add(sv);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
        return dssv;//+
    }

    public void add(SinhVien sv) {
        try {
            String query = "INSERT INTO SinhVien VALUES (?,?,?,?,?,?,?,?,?,?,?);";//++
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, sv.getMaSV());//+
            st.setString(2, sv.getCmnd());//+
            st.setString(3, sv.getHoTen());//+
            st.setDate(4, (java.sql.Date) sv.getNgaySinh());
            st.setString(5, sv.getGioiTinh());//+
            st.setString(6, sv.getDiaChi());//+
            st.setString(7, sv.getDanToc());//+
            st.setString(8, sv.getTonGiao());//+
            st.setString(9, sv.getNienKhoa());//+
            st.setString(10, sv.getMaNganh());//+
            st.setInt(11, sv.getMaTK());//+

            st.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void update(String maSV, SinhVien sv) {
        try {
            String query = "UPDATE SinhVien SET MaSV = ?, Cmnd= ?, HoTen= ?, "
                    + "NganhSinh=?,GioiTinh=?, DiaChi=?, DanToc=?, TonGiao=?, "
                    + "NienKhoa=?, MaNganh=?, MaTK=? WHERE MaSV=?";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, sv.getMaSV());//+
            st.setString(2, sv.getCmnd());//+
            st.setString(3, sv.getHoTen());//+
            st.setDate(4, (java.sql.Date) sv.getNgaySinh());
            st.setString(5, sv.getGioiTinh());//+
            st.setString(6, sv.getDiaChi());//+
            st.setString(7, sv.getDanToc());//+
            st.setString(8, sv.getTonGiao());//+
            st.setString(9, sv.getNienKhoa());//+
            st.setString(10, sv.getMaNganh());//+
            st.setInt(11, sv.getMaTK());//+
            st.setString(12, maSV);//+

            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void delete(String maSV) {
        try {
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
