package backend.QLTaiKhoan;

import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

public class TaiKhoanDAO {

    Connection con = ConnectionDB.getConnection();

    public TaiKhoanDAO() {

    }

    public ArrayList<TaiKhoan> get() {
        ArrayList<TaiKhoan> dstk = new ArrayList<>();//+
        try {
            String query = "select * from TaiKhoan";//+
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int maTK = rs.getInt("MaTK");//+
                String tenTaiKhoan = rs.getString("TenTaiKhoan");//+
                String matKhau = rs.getString("MatKhau");//+
                String maNhomQuyen = rs.getString("MaNhomQuyen");//+
                TaiKhoan tk = new TaiKhoan(maTK, tenTaiKhoan, matKhau, maNhomQuyen);
                dstk.add(tk);//+
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
        return dstk;//+
    }

    public void add(TaiKhoan tk) {
        try {
            String query = "INSERT INTO TaiKhoan VALUES (?,?,?,?);";//++
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, tk.getMaTK());//+
            st.setString(2, tk.getTenTaiKhoan());//+
            st.setString(3, tk.getMatKhau());//+
            st.setString(4, tk.getMaNhomQuyen());//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void update(int maTK, TaiKhoan tk) {
        try {
            String query = "UPDATE TaiKhoan SET MaTK = ?, TenTaiKhoan= ?, MatKhau = ?, MaNhomQuyen = ? WHERE maTK=?";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, tk.getMaTK());
            st.setString(2, tk.getTenTaiKhoan());//+
            st.setString(3, tk.getMatKhau());//+
            st.setString(4, tk.getMaNhomQuyen());//+
            st.setInt(5, maTK);//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }

    public void delete(int maTK) {
        try {
            String query = "DELETE FROM TaiKhoan WHERE MaTK=?;";//+
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, maTK);//+
            st.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }
// ---------------------------------------------kiem tra cac ham-----------------------------------------------
//    public static void main(String[] args) {
//        TaiKhoanDAO tk = new TaiKhoanDAO();
//        ArrayList<TaiKhoan> dstk = tk.get();
//        TaiKhoan tkmoi = new TaiKhoan(24, "99999", "99999", "Q3");
//        tk.add(tkmoi);
//        for (TaiKhoan i : dstk) {
//            System.out.println(i.toString());
//       }
//        TaiKhoan tkmoi2 = new TaiKhoan(24, "88888", "88888", "Q2");
//        tk.update(24, tkmoi2);
//        tk.delete(24);
//    }
}
