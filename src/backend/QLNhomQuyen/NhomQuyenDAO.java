package backend.QLNhomQuyen;

import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

public class NhomQuyenDAO {

    Connection con = ConnectionDB.getConnection();

    public NhomQuyenDAO() {
    }

    public ArrayList<NhomQuyen> get() {
        ArrayList<NhomQuyen> dsnq = new ArrayList<>();//+
        try {
            String query = "select * from NhomQuyen";//+
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maNhomQuyen = rs.getString("MaNhomQuyen");//+
                String tenNhomQuyen = rs.getString("TenNhomQuyen");//+
                NhomQuyen nq = new NhomQuyen(maNhomQuyen, tenNhomQuyen);
                dsnq.add(nq);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
        return dsnq;//+
    }

    public void add(NhomQuyen nq) {
        try {
            String query = "INSERT INTO NhomQuyen VALUES (?,?);";//++
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, nq.getMaNhomQuyen());//+
            st.setString(2, nq.getTenNhomQuyen());//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void update(String maNhomQuyen, NhomQuyen nq) {
        try {
            String query = "UPDATE NhomQuyen SET MaNhomQuyen = ?, TenNhomQuyen = ? WHERE MaNhomQuyen=?";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, nq.getMaNhomQuyen());//+
            st.setString(2, nq.getTenNhomQuyen());//+
            st.setString(3, maNhomQuyen);//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void delete(String maNhomQuyen) {
        try {
            String query = "DELETE FROM NhomQuyen WHERE MaNhomQuyen=?;";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, maNhomQuyen);//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
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
