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
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        try {
            String query = "select * from GiangVien";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String maGV = rs.getString("MaGV");
                String tenGV = rs.getString("TenGV");
                String maTK = rs.getString("MaTK");
                GiangVien gv = new GiangVien(maGV, tenGV, maTK);
                dsgv.add(gv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           ConnectionDB.closeConnection(con);
        }
        return dsgv;
    }

}
