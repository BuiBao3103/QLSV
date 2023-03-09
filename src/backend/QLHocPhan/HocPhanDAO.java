/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLHocPhan;

import backend.QLHocPhan.HocPhan;
import connectDB.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class HocPhanDAO {

    Connection con = ConnectionDB.getConnection();

    public HocPhanDAO() {
    }

    public ArrayList<HocPhan> get() {
        ArrayList<HocPhan> dshp = new ArrayList<>();//+
        try {
            String query = "select * from HocPhan";//+
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maHP = rs.getString("MaHP");//+
                String tenHP = rs.getString("TenMon");//+
                int tinChi = rs.getInt("TinChi");//+
                int chuyenBiet = rs.getInt("ChuyenBiet");
                String phanTramQuaTrinh = rs.getString("PhanTramQuaTrinh");
                String maKhoa = rs.getString("MaKhoa");
                String maNganh = rs.getString("maNganh");
                HocPhan hp = new HocPhan(maHP, tenHP, tinChi, chuyenBiet, phanTramQuaTrinh, maKhoa, maNganh);
                dshp.add(hp);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
        return dshp;//+
    }

    public void add(HocPhan hp) {
        try {
            String query = "INSERT INTO HocPhan VALUES (?,?,?,?,?,?,?);";//++
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, hp.getMaHP());//+
            st.setString(2, hp.getTenHP());//+
            st.setInt(3, hp.getTinChi());//+
            st.setInt(4, hp.getChuyenBiet());//+
            st.setString(5, hp.getPhanTramQuaTrinh());//+
            st.setString(6, hp.getMaKhoa());//+
            st.setString(7, hp.getMaNganh());//+

            st.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void update(String maHP, HocPhan hp) {
        try {
            String query = "UPDATE HocPhan SET MaHP = ?, TenMon= ?, TinChi= ?,ChuyenBiet =?,PhanTramQuaTrinh=?,MaKhoa=?,MaNganh=? WHERE MaHP=?";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, hp.getMaHP());//+
            st.setString(2, hp.getTenHP());//+
            st.setInt(3, hp.getTinChi());//+
            st.setInt(4, hp.getChuyenBiet());//+
            st.setString(5, hp.getPhanTramQuaTrinh());//+
            st.setString(6, hp.getMaKhoa());//+
            st.setString(7, hp.getMaNganh());//+
            st.setString(8, maHP);//+

            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void delete(String maHP) {
        try {
            String query = "DELETE FROM HocPhan WHERE MaHP=?;";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, maHP);//+
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }
}
