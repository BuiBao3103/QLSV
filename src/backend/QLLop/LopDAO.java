/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLLop;
import connectDB.ConnectionDB;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author PC
 */
public class LopDAO {
    Connection con = null;
    PreparedStatement pstm = null;

    public ArrayList<Lop> get() {
        ArrayList<Lop> dsl = new ArrayList<>();
        con = ConnectionDB.getConnection();
        try {
            String query = "select * from Lop";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maLop = rs.getString("MaLop");
                String maNganh = rs.getString("MaNganh");
                String maCoVan = rs.getString("MaCoVan");
                int soLuong = rs.getInt("SoLuong");
                Lop l = new Lop(maLop,maNganh,maCoVan,soLuong);
                dsl.add(l);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
        return dsl;
    }

    public void add(Lop l) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Insert into Lop values (?,?,?,?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, l.getMaLop());
            pstm.setString(2, l.getMaNganh());
            pstm.setString(3, l.getMaCoVan());
            pstm.setInt(4, l.getSoLuong());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maLop) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Delete from Lop where MaLop = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maLop);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public void update(String maLop, Lop l) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Update Lop set MaLop = ? , MaNganh = ?, MaCoVan = ?, SoLuong = ? where MaLop = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, l.getMaLop());
            pstm.setString(2, l.getMaNganh());
            pstm.setString(3, l.getMaCoVan());
            pstm.setInt(4, l.getSoLuong());
            pstm.setString(5, maLop);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }

    }
    public static void main(String[] args) {
         ArrayList<Lop> dsl = new LopDAO().get();
         System.out.println(dsl.get(3).toString());
    }
}
