/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.LopDAO;
import DTO.LopDTO;
import java.util.ArrayList;


public class LopBUS {
    static LopDAO lopDao = new LopDAO();
    public static ArrayList<LopDTO> dsLop = lopDao.get();
    public LopBUS(){
        
    }
    public static LopDTO getLopByLopid(String id){
        for(LopDTO lop: dsLop){
            if(lop.getMaLop().equals(id))
                return lop;
        }
        return null;
    }
    
}
