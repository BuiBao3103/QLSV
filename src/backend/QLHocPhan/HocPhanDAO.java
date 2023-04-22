/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLHocPhan;

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

    Connection con = null;
    PreparedStatement pstm = null;

    public HocPhanDAO() {
    }

    public ArrayList<HocPhan> get() {
        con = ConnectionDB.getConnection();
        ArrayList<HocPhan> dshp = new ArrayList<>();//+
        try {
            String query = "select * from HocPhan";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maHP = rs.getString("MaHP");//+
                String tenHP = rs.getString("TenMon");//+
                int tinChi = rs.getInt("TinChi");//+
                int chuyenBiet = rs.getInt("ChuyenBiet");
                int phanTramQuaTrinh = rs.getInt("PhanTramQuaTrinh");
                String maKhoa = rs.getString("MaKhoa");
                String maNganh = rs.getString("maNganh");
                HocPhan hp = new HocPhan(maHP, tenHP, tinChi, chuyenBiet, phanTramQuaTrinh, maKhoa, maNganh);
                dshp.add(hp);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dshp;//+
    }

    public void add(HocPhan hp) {
        con = ConnectionDB.getConnection();
        try {
            String query = "INSERT INTO HocPhan VALUES (?,?,?,?,?,?,?);";//++
            pstm = con.prepareStatement(query);
            pstm.setString(1, hp.getMaHP());//+
            pstm.setString(2, hp.getTenHP());//+
            pstm.setInt(3, hp.getTinChi());//+
            pstm.setInt(4, hp.getChuyenBiet());//+
            pstm.setInt(5, hp.getPhanTramQuaTrinh());//+
            pstm.setString(6, hp.getMaKhoa());//+
            pstm.setString(7, hp.getMaNganh());//+

            pstm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void update(String maHP, HocPhan hp) {
        con = ConnectionDB.getConnection();
        try {
            String query = "UPDATE HocPhan SET MaHP = ?, TenMon= ?, TinChi= ?,ChuyenBiet =?,PhanTramQuaTrinh=?,MaKhoa=?,MaNganh=? WHERE MaHP=?";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, hp.getMaHP());//+
            pstm.setString(2, hp.getTenHP());//+
            pstm.setInt(3, hp.getTinChi());//+
            pstm.setInt(4, hp.getChuyenBiet());//+
            pstm.setInt(5, hp.getPhanTramQuaTrinh());//+
            pstm.setString(6, hp.getMaKhoa());//+
            pstm.setString(7, hp.getMaNganh());//+
            pstm.setString(8, maHP);//+
            ResultSet rs = pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maHP) {
        con = ConnectionDB.getConnection();
        try {
            String query = "DELETE FROM HocPhan WHERE MaHP=?;";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, maHP);//+
            ResultSet rs = pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }
    
    public HocPhan getByMaHP(String mahp){
        con = ConnectionDB.getConnection();
        HocPhan hp = null;
        try {
            String query = "select * from HocPhan where MaHP = '"+mahp+"'";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maHP = rs.getString("MaHP");//+
                String tenHP = rs.getString("TenMon");//+
                int tinChi = rs.getInt("TinChi");//+
                int chuyenBiet = rs.getInt("ChuyenBiet");
                int phanTramQuaTrinh = rs.getInt("PhanTramQuaTrinh");
                String maKhoa = rs.getString("MaKhoa");
                String maNganh = rs.getString("maNganh");
                hp = new HocPhan(maHP, tenHP, tinChi, chuyenBiet, phanTramQuaTrinh, maKhoa, maNganh);
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return hp;
    }
}
