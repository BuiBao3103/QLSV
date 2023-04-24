/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NQ_CTQDAO;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class NQ_CTQBUS {
NQ_CTQDAO nqDao = new NQ_CTQDAO();
    public NQ_CTQBUS() {
    }
     public ArrayList<String> getListCTQByNQuyen(String nhomQuyen){
         return nqDao.getListCTQByNQuyen(nhomQuyen);
     }
}
