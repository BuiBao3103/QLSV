package backend.Khoa;

import connectDB.ConnectionDB;
import java.util.ArrayList;
import java.sql.*;

public class KhoaDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public KhoaDAO() {
    }

    public ArrayList<Khoa> get() {
        con = ConnectionDB.getConnection();
        ArrayList<Khoa> dskhoa = new ArrayList<>();
        try {
            String query = "select * from Khoa";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maKhoa = rs.getString("MaKhoa");
                String tenKhoa = rs.getString("TenKhoa");
                String maTK = rs.getString("MaTK");
                Khoa k = new Khoa(maKhoa, tenKhoa, maTK);
                dskhoa.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dskhoa;
    }

    public void add(Khoa k) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Insert into Khoa values(?,?,?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, k.getMaKhoa());
            pstm.setString(2, k.getTenKhoa());
            pstm.setString(3, k.getMaTK());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maKhoa) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Delete From Khoa where MaKhoa = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maKhoa);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public void update(String maKhoa, Khoa k) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Update Khoa set MaKhoa = ?, TenKhoa = ?, MaTK = ? where MaKhoa = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, k.getMaKhoa());
            pstm.setString(2, k.getTenKhoa());
            pstm.setString(3, k.getMaTK());
            pstm.setString(4, maKhoa);
            pstm.executeUpdate();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

//    public static void main(String[] args) {
//        KhoaDAO khd = new KhoaDAO();
////        ArrayList<Khoa> dskhoa=  khd.get();
////        dskhoa.forEach((khoa)-> System.out.println(khoa.toString()));
//        Khoa k = new Khoa("123456789", "Nguyen Minh Thuan", "1000");
////        khd.add(k);
//        khd.delete("1234");
////khd.update("123456", k);
//    }
}
