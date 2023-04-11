/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.DIEUKIEN;

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
public class DieuKienDAO {

    public DieuKienDAO() {

    }
    Connection con = null;
    PreparedStatement pstm = null;

    public ArrayList<DieuKien> get() {
        con = ConnectionDB.getConnection();
        ArrayList<DieuKien> dsdk = new ArrayList<>();
        try {
            String query = "SELECT * FROM DIEUKIEN";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maHP = rs.getString("MaHP");
                String maHP_truoc = rs.getString("MaHP_Truoc");
                DieuKien dk = new DieuKien(maHP, maHP_truoc);
                dsdk.add(dk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dsdk;
    }

    public void add(DieuKien dk) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Insert into DIEUKIEN values(?,?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, dk.getMaHP_truoc());
            pstm.setString(2, dk.getMaHP());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maHP, String maHP_truoc) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Delete From DIEUKIEN where MaHP = ? and MaHP_Truoc = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maHP_truoc);
            pstm.setString(2, maHP);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public void update(String maHP, String maHP_truoc, DieuKien dk) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Update DIEUKIEN set MaHP = ?,MaHP_Truoc = ? where MaHP = ? and MaHP_Truoc = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, dk.getMaHP());
            pstm.setString(2, dk.getMaHP_truoc());
            pstm.executeUpdate();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public static void main(String[] args) {
        DieuKienDAO dkd = new DieuKienDAO();
        ArrayList<DieuKien> dsdk = dkd.get();
        dsdk.forEach(kq -> System.out.println(kq.toString()));
        DieuKien dk = new DieuKien("866103", "866102");
        dkd.add(dk);

    }
}
