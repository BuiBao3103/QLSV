package backend.QLTaiKhoan;

import connectDB.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TaiKhoanDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public TaiKhoanDAO() {

    }

    public ArrayList<TaiKhoan> get() {
        con = ConnectionDB.getConnection();
        ArrayList<TaiKhoan> dstk = new ArrayList<>();//+
        try {
            String query = "select * from TaiKhoan";//+
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
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
            ConnectionDB.closeConnection(con, pstm);
        }
        return dstk;//+
    }

    public TaiKhoan getByUserName(String username) {
        con = ConnectionDB.getConnection();
        try {
            String query = "select * from TaiKhoan where TenTaiKhoan = ?";//+
            pstm = con.prepareStatement(query);
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int maTK = rs.getInt("MaTK");//+
                String tenTaiKhoan = rs.getString("TenTaiKhoan");//+
                String matKhau = rs.getString("MatKhau");//+
                String maNhomQuyen = rs.getString("MaNhomQuyen");//+
                TaiKhoan tk = new TaiKhoan(maTK, tenTaiKhoan, matKhau, maNhomQuyen);
                return tk;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return null;
    }

    public void add(TaiKhoan tk) {
        con = ConnectionDB.getConnection();

        try {
            String query = "INSERT INTO TaiKhoan VALUES (?,?,?,?);";//++
            pstm = con.prepareStatement(query);
            pstm.setInt(1, tk.getMaTK());//+
            pstm.setString(2, tk.getTenTaiKhoan());//+
            pstm.setString(3, tk.getMatKhau());//+
            pstm.setString(4, tk.getMaNhomQuyen());//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void update(int maTK, TaiKhoan tk) {
        con = ConnectionDB.getConnection();

        try {
            String query = "UPDATE TaiKhoan SET MaTK = ?, TenTaiKhoan= ?, MatKhau = ?, MaNhomQuyen = ? WHERE maTK=?";//+
            pstm = con.prepareStatement(query);
            pstm.setInt(1, tk.getMaTK());
            pstm.setString(2, tk.getTenTaiKhoan());//+
            pstm.setString(3, tk.getMatKhau());//+
            pstm.setString(4, tk.getMaNhomQuyen());//+
            pstm.setInt(5, maTK);//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void updatePwd(int maTK, String newPwd) {
        con = ConnectionDB.getConnection();
        try {
            String query = "UPDATE TaiKhoan SET MatKhau = ? WHERE maTK = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, newPwd);
            pstm.setInt(2, maTK);
            pstm.executeUpdate();
            int rowsUpdated = pstm.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Password updated successfully"); 
            } else {
                System.out.println("Failed to update password");
            }
        } catch (SQLException e) {
            // handle the exception appropriately
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(int maTK) {
        con = ConnectionDB.getConnection();

        try {
            String query = "DELETE FROM TaiKhoan WHERE MaTK=?;";//+
            pstm = con.prepareStatement(query);
            pstm.setInt(1, maTK);//+
            pstm.executeQuery();
        } catch (SQLException e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);
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
