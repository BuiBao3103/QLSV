package backend.Nhom;

import connectDB.ConnectionDB;
import java.util.ArrayList;
import java.sql.*;

public class NhomDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public ArrayList<Nhom> get() {
        ArrayList<Nhom> dsn = new ArrayList<>();
        con = ConnectionDB.getConnection();
        try {
            String query = "select * from Nhom";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maHP = rs.getString("MaHP");
                int soNhom = rs.getInt("SoNhom");
                int hocKy = rs.getInt("HocKy");
                int nam = rs.getInt("Nam");
                String maGV = rs.getString("MaGV");
                String phong = rs.getString("Phong");
                int soSinhVien = rs.getInt("SoSinhVien");
                String thu = rs.getString("Thu");
                int tietBD = rs.getInt("TietBD");
                int soTiet = rs.getInt("SoTiet");
                Nhom n = new Nhom(maHP, soNhom, hocKy, nam, maGV, phong, soSinhVien, thu, tietBD, soTiet);
                dsn.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
        return dsn;
    }

    public void add(Nhom n) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Insert into Nhom values (?,?,?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, n.getMaHP());
            pstm.setInt(2, n.getSoNhom());
            pstm.setInt(3, n.getHocKy());
            pstm.setInt(4, n.getNam());
            pstm.setString(5, n.getMaGV());
            pstm.setString(6, n.getPhong());
            pstm.setInt(7, n.getSoLuongSV());
            pstm.setString(8, n.getThu());
            pstm.setInt(9, n.getTietBD());
            pstm.setInt(10, n.getSoTiet());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maHP, int soNhom, int hocKy, int nam) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Delete from Nhom where MaHP = ? and SoNhom = ? and HocKy = ? and Nam = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maHP);
            pstm.setInt(2, soNhom);
            pstm.setInt(3, hocKy);
            pstm.setInt(4, nam);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public void update(String maHP, int soNhom, int hocKy, int nam, Nhom n) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Update Nhom set MaHP = ?,SoNhom = ?, HocKy = ?, Nam = ?, "
                    + "MaGV = ?, Phong = ?, SoSinhVien = ?, Thu = ?, TietBD = ?, SoTiet = ? "
                    + "where MaHP = ? and SoNhom = ? and HocKy = ? and Nam = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, n.getMaHP());
            pstm.setInt(2, n.getSoNhom());
            pstm.setInt(3, n.getHocKy());
            pstm.setInt(4, n.getNam());
            pstm.setString(5, n.getMaGV());
            pstm.setString(6, n.getPhong());
            pstm.setInt(7, n.getSoLuongSV());
            pstm.setString(8, n.getThu());
            pstm.setInt(9, n.getTietBD());
            pstm.setInt(10, n.getSoTiet());
            pstm.setString(11, maHP);
            pstm.setInt(12, soNhom);
            pstm.setInt(13, hocKy);
            pstm.setInt(14, nam);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }

    }

    public static void main(String[] args) {
        NhomDAO nd = new NhomDAO();
//        ArrayList<Nhom> n = nd.get();
//        n.forEach(nh-> System.out.println(nh.toString()));
//Nhom n = new Nhom("861303",3,3,2022,"123","C.A105",40,"2",1,3);
//nd.add(n);
//nd.update("861302",2 , 2,2021 , n);
        nd.delete("861303", 3, 3, 2022);
    }
}
