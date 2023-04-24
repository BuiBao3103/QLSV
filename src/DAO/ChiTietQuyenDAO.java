package DAO;

import DTO.ChiTietQuyenDTO;
import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;

public class ChiTietQuyenDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public ChiTietQuyenDAO() {
    }

    public ArrayList<ChiTietQuyenDTO> get() {
        con = ConnectionDB.getConnection();
        ArrayList<ChiTietQuyenDTO> dsctq = new ArrayList<>();//+
        try {
            String query = "select * from ChiTietQuyen";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maQuyen = rs.getString("MaQuyen");
                String tenQuyen = rs.getString("TenQuyen");
                String maNhomQuyen = rs.getString("MaNhomQuyen");
                ChiTietQuyenDTO ctq = new ChiTietQuyenDTO(maQuyen, tenQuyen, maNhomQuyen);
                dsctq.add(ctq);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dsctq;//+
    }

    public void add(ChiTietQuyenDTO ctq) {
        con = ConnectionDB.getConnection();

        try {
            String query = "INSERT INTO ChiTietQuyen VALUES (?,?,?);";//++
            pstm = con.prepareStatement(query);
            pstm.setString(1, ctq.getMaQuyen());//+
            pstm.setString(2, ctq.getTenQuyen());//+
            pstm.setString(3, ctq.getMaNhomQuyen());//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void update(String maQuyen, ChiTietQuyenDTO ctq) {
        con = ConnectionDB.getConnection();

        try {
            String query = "UPDATE ChiTietQuyen SET MaQuyen = ?, TenQuyen = ?, MaNhomQuyen = ? WHERE MaQuyen=?";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, ctq.getMaQuyen());//+
            pstm.setString(2, ctq.getTenQuyen());//+
            pstm.setString(3, ctq.getMaNhomQuyen());//+
            pstm.setString(4, maQuyen);
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maQuyen) {
        con = ConnectionDB.getConnection();

        try {
            String query = "DELETE FROM ChiTietQuyen WHERE MaQuyen=?;";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, maQuyen);//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }
//    -----------------------------Kiem Tra----------------------------------------------
//    public static void main(String[] args) {
//        ChiTietQuyenDAO ctq = new ChiTietQuyenDAO();
//         ArrayList<ChiTietQuyen> dsctq = ctq.get();
//         for (ChiTietQuyen i : dsctq) {
//            System.out.println(i.toString());
//        }
//        ChiTietQuyen ctqmoi = new ChiTietQuyen("MQ1","Xem Sinh Vien","Q1");
//        ctq.add(ctqmoi);
//        ChiTietQuyen ctqmoi1 = new ChiTietQuyen("MQ2","Xem giao vien","Q2");
//        ctq.update("MQ1", ctqmoi1);
//        ctq.delete("MQ2");
//    }

}
