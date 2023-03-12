/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLSinhVien;

/**
 *
 * @author ASUS
 */
public class SinhVienBUS {

    static SinhVienDAO svDAO=new SinhVienDAO();

    public SinhVienBUS() {
    }

    public static void main(String[] args) {
        svDAO.get().forEach(sv->{
            System.out.println(sv.toString());});
        for(SinhVien sv : svDAO.get()){
            
        }
//        svDAO.get();
    }
}
