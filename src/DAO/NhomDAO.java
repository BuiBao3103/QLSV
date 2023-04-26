package DAO;

import DTO.NhomDTO;
import BUS.TaiKhoanBUS;
import DTO.NienHocDTO;
import connectDB.ConnectionDB;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.*;

public class NhomDAO {

    Connection con = null;
    PreparedStatement pstm = null;

    public boolean getCurrentDangKyMon() {
        NienHocDTO nh = null;
        try {
            FileReader reader = new FileReader("src/resource/config/DangKyMonHoc.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            reader.close();
            bufferedReader.close();
            if (line.equals("true")) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<NhomDTO> get() {
        ArrayList<NhomDTO> dsn = new ArrayList<>();
        con = ConnectionDB.getConnection();
        try {
            String query = "select * from Nhom";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maHP = rs.getString("MaHP");
                int soNhom = rs.getInt("SoNhom");
                int hocKy = rs.getInt("HocKy");
                int nam = rs.getInt("Nam");
                String maGV = rs.getString("MaGV");
                String phong = rs.getString("Phong");
                int soSinhVien = rs.getInt("SoSinhVien");
                String thu = rs.getString("Thu");
                int tietBD = rs.getInt("TietBD");
                int soTiet = rs.getInt("SoTiet");
                NhomDTO n = new NhomDTO(maHP, soNhom, hocKy, nam, maGV, phong, soSinhVien, thu, tietBD, soTiet);
                dsn.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
        return dsn;
    }

    public void add(NhomDTO n) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Insert into Nhom values (?,?,?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, n.getMaHP());
            pstm.setInt(2, n.getSoNhom());
            pstm.setInt(3, n.getHocKy());
            pstm.setInt(4, n.getNam());
            pstm.setString(5, n.getMaGV());
            pstm.setString(6, n.getPhong());
            pstm.setInt(7, n.getSoLuongSV());
            pstm.setString(8, n.getThu());
            pstm.setInt(9, n.getTietBD());
            pstm.setInt(10, n.getSoTiet());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maHP, int soNhom, int hocKy, int nam) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Delete from Nhom where MaHP = ? and SoNhom = ? and HocKy = ? and Nam = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maHP);
            pstm.setInt(2, soNhom);
            pstm.setInt(3, hocKy);
            pstm.setInt(4, nam);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public void update(String maHP, int soNhom, int hocKy, int nam, NhomDTO n) {
        con = ConnectionDB.getConnection();
        try {
            String query = "Update Nhom set MaHP = ?,SoNhom = ?, HocKy = ?, Nam = ?, "
                    + "MaGV = ?, Phong = ?, SoSinhVien = ?, Thu = ?, TietBD = ?, SoTiet = ? "
                    + "where MaHP = ? and SoNhom = ? and HocKy = ? and Nam = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, n.getMaHP());
            pstm.setInt(2, n.getSoNhom());
            pstm.setInt(3, n.getHocKy());
            pstm.setInt(4, n.getNam());
            pstm.setString(5, n.getMaGV());
            pstm.setString(6, n.getPhong());
            pstm.setInt(7, n.getSoLuongSV());
            pstm.setString(8, n.getThu());
            pstm.setInt(9, n.getTietBD());
            pstm.setInt(10, n.getSoTiet());
            pstm.setString(11, maHP);
            pstm.setInt(12, soNhom);
            pstm.setInt(13, hocKy);
            pstm.setInt(14, nam);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }

    }

    public ArrayList<NhomDTO> getBySinhVien() { // hàm này trả về những nhóm sv đã học
        String maSV = TaiKhoanBUS.curentLogin.getTenTaiKhoan();
        ArrayList<NhomDTO> dsn = new ArrayList<>();
        con = ConnectionDB.getConnection();
        try {
            String query = "Select nh.*\n"
                    + "from KETQUA kq join NHOM nh on kq.MaHP = nh.MaHP and kq.SoNhom = nh.SoNhom\n"
                    + "where kq.MaSV = '" + maSV + "'";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maHP = rs.getString("MaHP");
                int soNhom = rs.getInt("SoNhom");
                int hocKy = rs.getInt("HocKy");
                int nam = rs.getInt("Nam");
                String maGV = rs.getString("MaGV");
                String phong = rs.getString("Phong");
                int soSinhVien = rs.getInt("SoSinhVien");
                String thu = rs.getString("Thu");
                int tietBD = rs.getInt("TietBD");
                int soTiet = rs.getInt("SoTiet");
                NhomDTO n = new NhomDTO(maHP, soNhom, hocKy, nam, maGV, phong, soSinhVien, thu, tietBD, soTiet);
                dsn.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
        return dsn;

    }

    public static void main(String[] args) {
        NhomDAO nd = new NhomDAO();
//        ArrayList<Nhom> n = nd.get();
//        n.forEach(nh-> System.out.println(nh.toString()));
//Nhom n = new Nhom("861303",3,3,2022,"123","C.A105",40,"2",1,3);
//nd.add(n);
//nd.update("861302",2 , 2,2021 , n);
//        nd.delete("861303", 3, 3, 2022);
        System.out.println(nd.getBySinhVien());
    }
}
