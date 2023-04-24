package DAO;

import DTO.NganhDTO;
import connectDB.ConnectionDB;
import java.util.ArrayList;
import java.sql.*;

public class NganhDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public ArrayList<NganhDTO> get() {
        ArrayList<NganhDTO> dsn = new ArrayList<>();
        con = ConnectionDB.getConnection();
        try {
            String query = "select * from Nganh";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maNganh = rs.getString("MaNganh");
                String tenNganh = rs.getString("TenNganh");
                String maKhoa = rs.getString("MaKhoa");
                NganhDTO n = new NganhDTO(maNganh, tenNganh, maKhoa);
                dsn.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
        return dsn;
    }

    public void add(NganhDTO n) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Insert into Nganh values (?,?,?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, n.getMaNganh());
            pstm.setString(2, n.getTenNganh());
            pstm.setString(3, n.getMaKhoa());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maNganh) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Delete from Nganh where MaNganh = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maNganh);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public void update(String maNganh, NganhDTO n) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Update Nganh set MaNganh = ? , TenNganh = ?, MaKhoa = ? where MaNganh = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, n.getMaNganh());
            pstm.setString(2, n.getTenNganh());
            pstm.setString(3, n.getMaKhoa());
            pstm.setString(4, maNganh);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }

    }
//    public static void main(String[] args) {
//        NganhDAO n = new NganhDAO();
//        ArrayList<Nganh> dsn = n.get();
//        Nganh nganh = new Nganh("ABC","Tin Học","QTKD");
////        dsn.forEach( (n) -> System.out.println(n.toString()));
////dsn.forEach((nganh)-> System.out.println(nganh.toString()));
////n.add(nganh);
////n.update("ABC",nganh);
//n.delete("ABC");
//    }

}
