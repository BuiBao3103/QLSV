/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectDB;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class ConnectionDB {
    static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=quanlysinhvien";
    static String userName = "sa";
    static String password = "123456";
    public static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return con;
    }
    public static void closeConnection(Connection con){
        try {
             if(con!=null)
                    con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Connection con = ConnectionDB.getConnection();
        
        try {
             String query = "insert into KHOA values(?,?)";
             PreparedStatement p = con.prepareStatement(query);
             p.setString(1,"DCTT");
             p.setString(2,"công nghệ thông tin");
             p.execute();
        } catch (SQLException e) {
            e.getMessage();
        }
       finally{
        ConnectionDB.closeConnection(con);
        }
    }
}
