package backend.QLNQ_CTQ;

import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;

public class NQ_CTQDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public NQ_CTQDAO() {
    }

    public ArrayList<NQ_CTQ> get() {
        con = ConnectionDB.getConnection();
        ArrayList<NQ_CTQ> dsnq_ctq = new ArrayList<>();//+
        try {
            String query = "select * from NQ_CTQ";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maNhomQuyen = rs.getString("MaNhomQuyen");//+
                String maQuyen = rs.getString("MaQuyen");//+
                NQ_CTQ nq_ctq = new NQ_CTQ(maNhomQuyen, maQuyen);
                dsnq_ctq.add(nq_ctq);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dsnq_ctq;//+
    }

    public ArrayList<String> getListCTQByNQuyen(String nhomQuyen) {
        con = ConnectionDB.getConnection();
        ArrayList<String> dsctq = new ArrayList<>();//+
        try {
            String query = "select MaQuyen from NQ_CTQ where NhomQuyen = ?";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, nhomQuyen);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maQuyen = rs.getString("MaQuyen");//+ 
                dsctq.add(maQuyen);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dsctq;
    }

    public void add(NQ_CTQ nq_ctq) {
        con = ConnectionDB.getConnection();

        try {
            String query = "INSERT INTO NQ_CTQ VALUES (?,?);";//++
            pstm = con.prepareStatement(query);
            pstm.setString(1, nq_ctq.getMaNhomQuyen());//+
            pstm.setString(2, nq_ctq.getMaQuyen());//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    // vì bảng NQ_CTQ có 2 khóa chính nên truyền vào cả 2 để cập nhật
    public void update(String maNhomQuyen, String maQuyen, NQ_CTQ nq_ctq) {
        con = ConnectionDB.getConnection();

        try {
            String query = "UPDATE NQ_CTQ SET MaNhomQuyen = ?, MaQuyen = ? WHERE MaNhomQuyen=? and MaQuyen = ?";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, nq_ctq.getMaNhomQuyen());//+
            pstm.setString(2, nq_ctq.getMaQuyen());//+
            pstm.setString(3, maNhomQuyen);//+
            pstm.setString(4, maQuyen);
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maNhomQuyen, String maQuyen) {
        con = ConnectionDB.getConnection();

        try {
            String query = "DELETE FROM NQ_CTQ WHERE MaNhomQuyen = ? and MaQuyen = ?;";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, maNhomQuyen);//+
            pstm.setString(2, maQuyen);
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }
// -------------------------Kiem Tra--------------------------------
//    public static void main(String[] args) {
//        NQ_CTQDAO nq_ctq = new NQ_CTQDAO();
//        NQ_CTQ nq_ctqmoi = new NQ_CTQ("Q1","MQ9");
//        nq_ctq.add(nq_ctqmoi);
//        ArrayList<NQ_CTQ> dsnq_ctq = nq_ctq.get();
//        for (NQ_CTQ i : dsnq_ctq) {
//            System.out.println(i.toString());
//       }
//        NQ_CTQ nq_ctqmoi1 = new NQ_CTQ("Q4", "MQ1");
//        nq_ctq.update("Q2", "MQ3", nq_ctqmoi1);
//        nq_ctq.delete("Q4", "MQ1");
//    }
}
