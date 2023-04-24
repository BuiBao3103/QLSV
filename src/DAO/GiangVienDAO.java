/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.GiangVienDTO;
import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class GiangVienDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public GiangVienDAO() {
    }

    public ArrayList<GiangVienDTO> get() {
        con = ConnectionDB.getConnection();
        ArrayList<GiangVienDTO> dsgv = new ArrayList<>();//+
        try {
            String query = "select * from GiangVien";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maGV = rs.getString("MaGV");//+
                String tenGV = rs.getString("TenGV");//+
                String maTK = rs.getString("MaTK");//+
                GiangVienDTO gv = new GiangVienDTO(maGV, tenGV, maTK);//+
                dsgv.add(gv);//+
            }
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dsgv;//+
    }

    public void add(GiangVienDTO gv) {
        con = ConnectionDB.getConnection();
        try {
            String query = "INSERT INTO GiangVien VALUES (?,?,?);";//++
            pstm = con.prepareStatement(query);
            pstm.setString(1, gv.getMaGV());//+
            pstm.setString(2, gv.getTenGV());//+
            pstm.setString(3, gv.getMaTK());//+
            pstm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void update(String maGV, GiangVienDTO gv) {
        con = ConnectionDB.getConnection();
        try {
            String query = "UPDATE GiangVien SET MaGV = ?, TenGV= ?, MaTK = ? WHERE maGV=?";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, gv.getMaGV());//+
            pstm.setString(2, gv.getTenGV());//+
            pstm.setString(3, gv.getMaTK());//+
            pstm.setString(4, maGV);//+
            ResultSet rs = pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maGV) {
        con = ConnectionDB.getConnection();
        try {
            String query = "DELETE FROM Giangvien WHERE MaGV=?;";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, maGV);//+
            ResultSet rs = pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }
}
