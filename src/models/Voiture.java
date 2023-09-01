/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Toshiba
 */
public class Voiture {
    private String modele;
    private String mark;
    private int id_c;

    public Voiture(String modele, String mark, int id_c) {
        this.modele = modele;
        this.mark = mark;
        this.id_c = id_c;
    }

    public String getModele() {
        return modele;
    }

    public String getMark() {
        return mark;
    }

    public int getId_c() {
        return id_c;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }
    
}
