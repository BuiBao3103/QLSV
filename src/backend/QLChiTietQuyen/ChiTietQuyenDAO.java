package backend.QLChiTietQuyen;

import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

public class ChiTietQuyenDAO {

    Connection con = ConnectionDB.getConnection();

    public ChiTietQuyenDAO() {
    }

    public ArrayList<ChiTietQuyen> get() {
        ArrayList<ChiTietQuyen> dsctq = new ArrayList<>();//+
        try {
            String query = "select * from ChiTietQuyen";//+
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maQuyen = rs.getString("MaQuyen");
                String tenQuyen = rs.getString("TenQuyen");
                String maNhomQuyen = rs.getString("MaNhomQuyen");
                ChiTietQuyen ctq = new ChiTietQuyen(maQuyen, tenQuyen, maNhomQuyen);
                dsctq.add(ctq);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
        return dsctq;//+
    }

    public void add(ChiTietQuyen ctq) {
        try {
            String query = "INSERT INTO ChiTietQuyen VALUES (?,?,?);";//++
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, ctq.getMaQuyen());//+
            st.setString(2, ctq.getTenQuyen());//+
            st.setString(3, ctq.getMaNhomQuyen());//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void update(String maQuyen, ChiTietQuyen ctq) {
        try {
            String query = "UPDATE ChiTietQuyen SET MaQuyen = ?, TenQuyen = ?, MaNhomQuyen = ? WHERE MaQuyen=?";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, ctq.getMaQuyen());//+
            st.setString(2, ctq.getTenQuyen());//+
            st.setString(3, ctq.getMaNhomQuyen());//+
            st.setString(4, maQuyen);
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void delete(String maQuyen) {
        try {
            String query = "DELETE FROM ChiTietQuyen WHERE MaQuyen=?;";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, maQuyen);//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
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
