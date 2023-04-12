package backend.KetQua;

import connectDB.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class KetQuaDAO {

    public KetQuaDAO() {
    }
    Connection con = null;
    PreparedStatement pstm = null;

    public ArrayList<KetQua> get(int hk, int n) {

        con = ConnectionDB.getConnection();
        ArrayList<KetQua> dskq = new ArrayList<>();
        try {
            String query = "select * from KetQua kq join HocPhan hp on kq.MaHP=hp.MaHP where HocKy = ? and Nam = ?";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, hk);
            pstm.setInt(2, n);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                String maHP = rs.getString("MaHP");
                int soNhom = rs.getInt("SoNhom");
                int hocKy = rs.getInt("HocKy");
                int nam = rs.getInt("Nam");
                double DiemQuaTrinh = rs.getDouble("DiemQuaTrinh");
                double DiemCuoiKy = rs.getDouble("DiemCuoiKy");
                KetQua k = new KetQua(maSV, maHP, soNhom, hocKy, nam, DiemCuoiKy, DiemCuoiKy);
                dskq.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dskq;
    }

    public ArrayList<KetQua> get(String MaSV) {

        con = ConnectionDB.getConnection();
        ArrayList<KetQua> dskq = new ArrayList<>();
        try {
            String query = "select * from KetQua kq join HocPhan hp on kq.MaHP=hp.MaHP where MaSV = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, MaSV);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                String maHP = rs.getString("MaHP");
                String tenHP = rs.getString("TenMon");
                int soTinChi = rs.getInt("TinChi");
                int PhanTramQuaTrinh = rs.getInt("PhanTramQuaTrinh");
                int soNhom = rs.getInt("SoNhom");
                int hocKy = rs.getInt("HocKy");
                int nam = rs.getInt("Nam");
                double DiemQuaTrinh = rs.getDouble("DiemQuaTrinh");
                double DiemCuoiKy = rs.getDouble("DiemCuoiKy");
                KetQua k = new KetQua(maSV, maHP, soNhom, hocKy, nam, DiemCuoiKy, DiemCuoiKy);

                dskq.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dskq;
    }

    public void add(KetQua k) {
        con = ConnectionDB.getConnection();

        try {
            String query = "Insert into KetQua values(?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, k.getMaSV());
            pstm.setString(2, k.getMaHP());
            pstm.setInt(3, k.getSoNhom());
            pstm.setInt(4, k.getHocKy());
            pstm.setInt(5, k.getNam());
            pstm.setDouble(6, k.getDiemQT());
            pstm.setDouble(7, k.getDiemCK());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
    }

    public void delete(String maSV, String maHP, int soNhom, int hocKy, int nam) {
        con = ConnectionDB.getConnection();

        try {
            String query = "Delete From KetQua where MaSV = ? and MaHP = ? and SoNhom = ? and HocKy = ? and Nam = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, maSV);
            pstm.setString(2, maHP);
            pstm.setInt(3, soNhom);
            pstm.setInt(4, hocKy);
            pstm.setInt(5, nam);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public void update(String maSV, String maHP, int soNhom, int hocKy, int nam, KetQua kq) {
        con = ConnectionDB.getConnection();

        try {
            String query = "Update KeTQua set MaSV = ?, MaHP = ?,SoNhom = ?, "
                    + "HocKy = ?, Nam = ?,DiemQuaTrinh = ?,DiemCuoiKy = ?"
                    + " where MaSV = ? and MaHP = ? and SoNhom = ? and HocKy = ? and Nam = ? ";
            pstm = con.prepareStatement(query);
            pstm.setString(1, kq.getMaSV());
            pstm.setString(2, kq.getMaHP());
            pstm.setInt(3, kq.getSoNhom());
            pstm.setInt(4, kq.getHocKy());
            pstm.setInt(5, kq.getNam());
            pstm.setDouble(6, kq.getDiemQT());
            pstm.setDouble(7, kq.getDiemCK());
            pstm.setString(8, maSV);
            pstm.setString(9, maHP);
            pstm.setInt(10, soNhom);
            pstm.setInt(11, hocKy);
            pstm.setInt(12, nam);
            pstm.executeUpdate();
        } catch (Exception e) {
        } finally {
            ConnectionDB.closeConnection(con, pstm);

        }
    }

    public static void main(String[] args) {
        KetQuaDAO kqd = new KetQuaDAO();
        ArrayList<KetQua> dskq = kqd.get("3121410482");
        dskq.forEach(kq -> System.out.println(kq.toString()));
//KetQua kq = new KetQua("3121410483","861303",1,2,2022,9.5,10);
//        kqd.add(kq);
//            kqd.update("3121410482","861302", 1, 2, 2021, kq);
//    kqd.delete("3121410483","861303", 1,2,2022);
    }
}
