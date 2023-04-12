/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLLop;

import backend.QLGiangVien.GiangVien;
import java.util.ArrayList;


public class LopBUS {
    static LopDAO lopDao = new LopDAO();
    static ArrayList<Lop> dsLop = lopDao.get();
    public LopBUS(){
        
    }
    public static Lop getLopByLopid(String id){
        for(Lop lop: dsLop){
            if(lop.getMaLop().equals(id))
                return lop;
        }
        return null;
    }
    
}
