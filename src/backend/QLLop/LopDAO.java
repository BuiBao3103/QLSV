/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLLop;
import connectDB.ConnectionDB;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author PC
 */
public class LopDAO {
    Connection con = null;
    PreparedStatement pstm = null;

    public ArrayList<Lop> get() {
        ArrayList<Lop> dsl = new ArrayList<>();
        con = ConnectionDB.getConnection();
        try {
            String query = "select * from Lop";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maLop = rs.getString("MaLop");
                String maNganh = rs.getString("MaNganh");
                String maCoVan = rs.getString("MaCoVan");
                int soLuong = rs.getInt("SoLuong");
                Lop l = new Lop(maLop,maNganh,maCoVan,soLuong);
                dsl.add(l);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
        return dsl;
    }

    public void add(Lop l) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Insert into Lop values (?,?,?,?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, l.getMaLop());
            pstm.setString(2, l.getMaNganh());
            pstm.setString(3, l.getMaCoVan());
            pstm.setInt(4, l.getSoLuong());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maLop) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Delete from Lop where MaLop = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maLop);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public void update(String maLop, Lop l) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Update Lop set MaLop = ? , MaNganh = ?, MaCoVan = ?, SoLuong = ? where MaLop = '?'";
            pstm = con.prepareStatement(query);
            pstm.setString(1, l.getMaLop());
            pstm.setString(2, l.getMaNganh());
            pstm.setString(3, l.getMaCoVan());
            pstm.setInt(4, l.getSoLuong());
            pstm.setString(5, maLop);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }
    
    public Lop getLopByMaLop(String MaLop){
        con = ConnectionDB.getConnection();
        try {
            String query = "select * from Lop WHERE MaLop ='"+MaLop+"'";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maLop = rs.getString("MaLop");
                String maNganh = rs.getString("MaNganh");
                String maCoVan = rs.getString("MaCoVan");
                int soLuong = rs.getInt("SoLuong");
                Lop l = new Lop(maLop,maNganh,maCoVan,soLuong);
                return l;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return null;
    }
    
    public void updateSoLuong(String maLop){ // hàm này tăng số lượng mỗi khi thêm sinh viên
        con = ConnectionDB.getConnection();
        try {
            String query = "UPDATE Lop Set SoLuong = SoLuong + 1 where MaLop = '"+maLop+"' ";
            pstm = con.prepareStatement(query);
           // pstm.setString(1, maLop);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }
    
    public String GiangVienForNewLop(){ // hàm này trả về GV cố vấn cho ít lớp nhất
        con = ConnectionDB.getConnection();
        ArrayList<String> dsMaGV = new ArrayList();
        try {
            String query = "select gv.MaGV\n" +
                            "from GIANGVIEN gv left join Lop l on gv.MaGV = l.MaCoVan \n" +
                            "group by gv.MaGV\n" +
                            "order by COUNT(l.MaLop)"; // cái này nó đếm số lớp mỗi GV dạy rồi xếp tăng dần luôn
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maGV = rs.getString("MaGV");
                dsMaGV.add(maGV);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dsMaGV.get(0);
    }
    public static void main(String[] args) {
         ArrayList<Lop> dsl = new LopDAO().get();
         System.out.println(dsl.get(3).toString());
    }
}
