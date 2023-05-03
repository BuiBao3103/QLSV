package DAO;

import BUS.NienHocBUS;
import DTO.KetQuaDTO;
import DTO.NienHocDTO;
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

    public ArrayList<KetQuaDTO> get(int hk, int n) {
        con = ConnectionDB.getConnection();
        ArrayList<KetQuaDTO> dskq = new ArrayList<>();
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
                KetQuaDTO k = new KetQuaDTO(maSV, maHP, soNhom, hocKy, nam, DiemQuaTrinh, DiemCuoiKy);
                dskq.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dskq;
    }

    public int getThongKe(int hk, int nam, double diem1, double diem2) {
        con = ConnectionDB.getConnection();  
        int soLuong = -1;
        try {
            String query = "select count(*) as SoLuong "
                    + " from (select masv, (sum(diemtongket)/count(*)) as diemtongket \n"
                    + "from (select masv,hp.MaHP, (phantramquatrinh*0.01)*DiemQuaTrinh + (100-phantramquatrinh)*0.01*DiemCuoiKy as diemtongket\n"
                    + "from HocPhan hp join KetQua kq on hp.mahp = kq.mahp\n"
                    + "where hocky = ? and nam = ?) as temporary_table\n"
                    + "group by masv \n"
                    + "having (sum(diemtongket)/count(*))>= ? and (sum(diemtongket)/count(*))< ?) as ketqua";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, hk);
            pstm.setInt(2, nam);
            pstm.setDouble(3, diem1);
            pstm.setDouble(4, diem2);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                 soLuong = rs.getInt("SoLuong");            
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return soLuong;    
}
public ArrayList<KetQuaDTO> getDaHoc(String MaSV) {
        con = ConnectionDB.getConnection();
        NienHocDTO nh = NienHocBUS.getCurrentNienHoc();
        ArrayList<KetQuaDTO> dskq = new ArrayList<>();
        try {
            String query = "select * from KetQua kq join HocPhan hp on kq.MaHP=hp.MaHP "
                    + "where HocKy <> ? or Nam <> ?  and  MaSV = ?";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, nh.getHocKi());
            pstm.setInt(2, nh.getNam());
            pstm.setString(3, MaSV);

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
                KetQuaDTO k = new KetQuaDTO(maSV, maHP, soNhom, hocKy, nam, DiemQuaTrinh, DiemCuoiKy);

                dskq.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dskq;
    }

    public ArrayList<KetQuaDTO> getDaDangKy(String MaSV, int hk, int n) {
        con = ConnectionDB.getConnection();
        ArrayList<KetQuaDTO> dskq = new ArrayList<>();
        try {
            String query = "select * from KetQua kq join HocPhan hp on kq.MaHP=hp.MaHP "
                    + "where "
                    + " MaSV = ? and HocKy = ? and nam = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, MaSV);
            pstm.setInt(2, hk);
            pstm.setInt(3, n);

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
                KetQuaDTO k = new KetQuaDTO(maSV, maHP, soNhom, hocKy, nam, DiemQuaTrinh, DiemCuoiKy);

                dskq.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dskq;
    }

    public ArrayList<KetQuaDTO> getDaDangKyToanTruong(int hk, int n) {
        con = ConnectionDB.getConnection();
        ArrayList<KetQuaDTO> dskq = new ArrayList<>();
        try {
            String query = "select * from KetQua kq join HocPhan hp on kq.MaHP=hp.MaHP "
                    + "where "
                    + " HocKy = ? and nam = ?";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, hk);
            pstm.setInt(2, n);

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
                KetQuaDTO k = new KetQuaDTO(maSV, maHP, soNhom, hocKy, nam, DiemQuaTrinh, DiemCuoiKy);

                dskq.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dskq;
    }

    public ArrayList<KetQuaDTO> get(String MaSV) {
        System.out.println("KetQuaDAO");
        con = ConnectionDB.getConnection();
        ArrayList<KetQuaDTO> dskq = new ArrayList<>();
        try {
            String query = "select * from KetQua kq join HocPhan hp on kq.MaHP=hp.MaHP where  MaSV = ?";
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
                KetQuaDTO k = new KetQuaDTO(maSV, maHP, soNhom, hocKy, nam, DiemQuaTrinh, DiemCuoiKy);

                dskq.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dskq;
    }

    public void add(KetQuaDTO k) {
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

    public void update(String maSV, String maHP, int soNhom, int hocKy, int nam, KetQuaDTO kq) {
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

    public ArrayList<String> getDsMaSV(String maHP, int soNhom) {
        ArrayList<String> dsMaSV = new ArrayList();
        con = ConnectionDB.getConnection();
        try {
            String query = "select MaSV\n"
                    + "from KETQUA\n"
                    + "where MaHP = '" + maHP + "' and SoNhom = " + soNhom;
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                dsMaSV.add(maSV);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return dsMaSV;
    }

    public static void main(String[] args) {
        KetQuaDAO kqd = new KetQuaDAO();
        ArrayList<KetQuaDTO> dskq = kqd.get("3121410482");
        dskq.forEach(kq -> System.out.println(kq.toString()));
//KetQua kq = new KetQua("3121410483","861303",1,2,2022,9.5,10);
//        kqd.add(kq);
//            kqd.update("3121410482","861302", 1, 2, 2021, kq);
//    kqd.delete("3121410483","861303", 1,2,2022);
    }
}
