/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Nganh;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class NganhBUS {

    static NganhDAO nganhDAO = new NganhDAO();
    static ArrayList<Nganh> dsNganh = nganhDAO.get();

    public static Nganh getNganhByID(String maNganh) {
        for(Nganh n : dsNganh){
            if(n.getMaNganh().equals(maNganh)){
                return n;
            }
        }
        return null;
    }
}
