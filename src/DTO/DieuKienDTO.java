/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class DieuKienDTO {

    private String maHP;
    private String maHP_truoc;

    public DieuKienDTO() {

    }

    public DieuKienDTO(String maHP, String maHP_truoc) {
        this.maHP = maHP;
        this.maHP_truoc = maHP_truoc;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getMaHP_truoc() {
        return maHP_truoc;
    }

    public void setMaHP_truoc(String maHP_truoc) {
        this.maHP_truoc = maHP_truoc;
    }

    @Override
    public String toString() {
        return "DieuKien{" + "maHP=" + maHP + ", maHP_truoc=" + maHP_truoc + '}';
    }

}
