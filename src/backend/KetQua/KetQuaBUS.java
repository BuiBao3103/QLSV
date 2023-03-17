/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.KetQua;

import backend.QLTaiKhoan.TaiKhoanBUS;
import frontend.Login;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
/**
 *
 * @author ASUS
 */
public class KetQuaBUS {
   
    public void addRowData(JTable table){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        ArrayList<KetQua> list = new  KetQuaDAO().get(new TaiKhoanBUS().getTenTK());
       
        int stt =1;
        for (KetQua i : list) {
            double diemHe10 =DiemHe10(i.getPhanTramQuaTrinh(),i.getDiemQT(),i.getDiemCK());
            String diemChu =DiemChuHe4(diemHe10);
     
            model.addRow(new Object[]{
                stt++,i.getMaHP(),i.getTenHP(),i.getSoTinChi(),i.getPhanTramQuaTrinh()+"%",
                100-i.getPhanTramQuaTrinh()+"%",i.getDiemQT(),i.getDiemCK(),
                diemHe10,diemChu
                
            });
    }
   
    }
     public double DiemHe10(int PhanTramQuaTrinh,double diemQuaTrinh,double diemThi){
         if(PhanTramQuaTrinh==40)
            return diemQuaTrinh*0.4 + diemThi*0.6;
         else 
             return diemQuaTrinh*0.5 + diemThi*0.5;
    }
     public String DiemChuHe4(double diemHe10){
         if(diemHe10>=8.5)
            return "A";
         else if(diemHe10>=7.0 &&diemHe10<=8.4)
             return "B";
         else if(diemHe10>=5.5 &&diemHe10<=6.9)
             return "C";
         else if(diemHe10>=4.0 &&diemHe10<=5.4)
             return "D";
         else 
             return "F";             
     }
     public static void main(String[] args) {
         System.out.println(new TaiKhoanBUS().getTenTK());
    }
}

