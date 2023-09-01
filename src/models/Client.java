/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Toshiba
 */
public class Client {
    private String nom_c;
    private String prenom_c;
    private String address_c;
    private String password;

    public Client(String nom_c, String prenom_c, String address_c, String password) {
        this.nom_c = nom_c;
        this.prenom_c = prenom_c;
        this.address_c = address_c;
        this.password = password;
    }

    public String getNom_c() {
        return nom_c;
    }

    public String getPrenom_c() {
        return prenom_c;
    }

    public String getAddress_c() {
        return address_c;
    }

    public String getPassword() {
        return password;
    }

    public void setNom_c(String nom_c) {
        this.nom_c = nom_c;
    }

    public void setPrenom_c(String prenom_c) {
        this.prenom_c = prenom_c;
    }

    public void setAddress_c(String address_c) {
        this.address_c = address_c;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
