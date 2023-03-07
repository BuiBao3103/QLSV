/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLGiangVien;

import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author ASUS
 */
public class GiangVienDAO {

    Connection con = ConnectionDB.getConnection();

    public GiangVienDAO() {
    }

    public ArrayList<GiangVien> get() {
        ArrayList<GiangVien> dsgv = new ArrayList<>();//+
        try {
            String query = "select * from GiangVien";//+
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maGV = rs.getString("MaGV");//+
                String tenGV = rs.getString("TenGV");//+
                String maTK = rs.getString("MaTK");//+
                GiangVien gv = new GiangVien(maGV, tenGV, maTK);//+
                dsgv.add(gv);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
        return dsgv;//+
    }

    public void add(GiangVien gv) {
        try {
            String query = "INSERT INTO GiangVien VALUES (?,?,?);";//++
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, gv.getMaGV());//+
            st.setString(2, gv.getTenGV());//+
            st.setString(3, gv.getMaTK());//+
            st.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void update(String maGV, GiangVien gv) {
        try {
            String query = "UPDATE GiangVien SET MaGV = ?, TenGV= ?, MaTK = ? WHERE maGV=?";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, gv.getMaGV());//+
            st.setString(2, gv.getTenGV());//+
            st.setString(3, gv.getMaTK());//+
            st.setString(4, maGV);//+
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void delete(String maGV) {
        try {
            String query = "DELETE FROM Giangvien WHERE MaGV=?;";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, maGV);//+
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }
    
    
}
