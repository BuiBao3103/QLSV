package DAO;

import DTO.NhomQuyenDTO;
import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;

public class NhomQuyenDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public NhomQuyenDAO() {
    }

    public ArrayList<NhomQuyenDTO> get() {
        con = ConnectionDB.getConnection();
        ArrayList<NhomQuyenDTO> dsnq = new ArrayList<>();//+
        try {
            String query = "select * from NhomQuyen";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maNhomQuyen = rs.getString("MaNhomQuyen");//+
                String tenNhomQuyen = rs.getString("TenNhomQuyen");//+
                NhomQuyenDTO nq = new NhomQuyenDTO(maNhomQuyen, tenNhomQuyen);
                dsnq.add(nq);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con,pstm);
        }
        return dsnq;//+
    }

    public void add(NhomQuyenDTO nq) {
                con = ConnectionDB.getConnection();

        try {
            String query = "INSERT INTO NhomQuyen VALUES (?,?);";//++
            pstm = con.prepareStatement(query);
            pstm.setString(1, nq.getMaNhomQuyen());//+
            pstm.setString(2, nq.getTenNhomQuyen());//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con,pstm);
        }
    }

    public void update(String maNhomQuyen, NhomQuyenDTO nq) {
                con = ConnectionDB.getConnection();

        try {
            String query = "UPDATE NhomQuyen SET MaNhomQuyen = ?, TenNhomQuyen = ? WHERE MaNhomQuyen=?";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, nq.getMaNhomQuyen());//+
            pstm.setString(2, nq.getTenNhomQuyen());//+
            pstm.setString(3, maNhomQuyen);//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con,pstm);
        }
    }

    public void delete(String maNhomQuyen) {
        
        try {
            String query = "DELETE FROM NhomQuyen WHERE MaNhomQuyen=?;";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, maNhomQuyen);//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con,pstm);
        }
    }
//    ----------------------------Kiem Tra-----------------------------------
//    public static void main(String[] args) {
//        NhomQuyenDAO nq = new NhomQuyenDAO();
//        NhomQuyen nqmoi = new NhomQuyen("Q1","Admin");
//        nq.add(nqmoi);
//        ArrayList<NhomQuyen> dsnq = nq.get();     
//        for (NhomQuyen i : dsnq) {
//            System.out.println(i.toString());
//        }
//        NhomQuyen nqmoi1 = new NhomQuyen("Q2","GV");
//        nq.update("Q1", nqmoi1);
//        nq.delete("Q2");
//    }
}
