
package Nganh;

import connectDB.ConnectionDB;
import java.util.ArrayList;
import java.sql.*;

public class NganhDAO {
    public ArrayList<Nganh> get(){
        ArrayList<Nganh> dsn = new ArrayList<>();
        Connection con = ConnectionDB.getConnection();
        try {
            String query = "select * from Nganh";
            PreparedStatement pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                String maNganh = rs.getString("MaNganh");
                String tenNganh = rs.getString("TenNganh");
                String maKhoa= rs.getString("MaKhoa");
                Nganh n = new Nganh(maNganh,tenNganh,maKhoa);  
                dsn.add(n);
            }              
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.getConnection();
        }
        return dsn;
    }
    public void add(Nganh n){
        Connection con = ConnectionDB.getConnection();
        try {
            String query = "Insert into Nganh values (?,?,?)";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, n.getMaNganh());
            pstm.setString(2, n.getTenNganh());
            pstm.setString(3, n.getMaKhoa());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }
    public void delete(String maNganh){
        Connection con = ConnectionDB.getConnection();
        try {
            String query = "Delete from Nganh where MaNganh = ? ";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,maNganh);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.getConnection();
        }
    }
    public void update(String maNganh,Nganh n){
           Connection con = ConnectionDB.getConnection();
           try {
            String query = "Update Nganh set MaNganh = ? , TenNganh = ?, MaKhoa = ? where MaNganh = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,n.getMaNganh());
            pstm.setString(2,n.getTenNganh());
            pstm.setString(3,n.getMaKhoa());
            pstm.setString(4,maNganh);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
               ConnectionDB.closeConnection(con);
        }
        
    }
    public static void main(String[] args) {
        NganhDAO n = new NganhDAO();
        ArrayList<Nganh> dsn = n.get();
        Nganh nganh = new Nganh("ABC","Tin Học","QTKD");
//        dsn.forEach( (n) -> System.out.println(n.toString()));
//dsn.forEach((nganh)-> System.out.println(nganh.toString()));
//n.add(nganh);
//n.update("ABC",nganh);
n.delete("ABC");
    }
           
}
