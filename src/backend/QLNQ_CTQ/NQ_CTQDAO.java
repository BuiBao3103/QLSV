package backend.QLNQ_CTQ;

import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

public class NQ_CTQDAO {

    Connection con = ConnectionDB.getConnection();

    public NQ_CTQDAO() {
    }

    public ArrayList<NQ_CTQ> get() {
        ArrayList<NQ_CTQ> dsnq_ctq = new ArrayList<>();//+
        try {
            String query = "select * from NQ_CTQ";//+
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maNhomQuyen = rs.getString("MaNhomQuyen");//+
                String maQuyen = rs.getString("MaQuyen");//+
                NQ_CTQ nq_ctq = new NQ_CTQ(maNhomQuyen, maQuyen);
                dsnq_ctq.add(nq_ctq);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
        return dsnq_ctq;//+
    }

    public void add(NQ_CTQ nq_ctq) {
        try {
            String query = "INSERT INTO NQ_CTQ VALUES (?,?);";//++
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, nq_ctq.getMaNhomQuyen());//+
            st.setString(2, nq_ctq.getMaQuyen());//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    // vì bảng NQ_CTQ có 2 khóa chính nên truyền vào cả 2 để cập nhật
    public void update(String maNhomQuyen, String maQuyen, NQ_CTQ nq_ctq) {
        try {
            String query = "UPDATE NQ_CTQ SET MaNhomQuyen = ?, MaQuyen = ? WHERE MaNhomQuyen=? and MaQuyen = ?";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, nq_ctq.getMaNhomQuyen());//+
            st.setString(2, nq_ctq.getMaQuyen());//+
            st.setString(3, maNhomQuyen);//+
            st.setString(4, maQuyen);
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void delete(String maNhomQuyen, String maQuyen) {
        try {
            String query = "DELETE FROM NQ_CTQ WHERE MaNhomQuyen = ? and MaQuyen = ?;";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, maNhomQuyen);//+
            st.setString(2, maQuyen);
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
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
