package com.example.springserver.model.banque;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Banque;
    private String Nom_B;
    private String adresse;
    private int tel;
    private String email;

    public int getId_Banque() {
        return Id_Banque;
    }

    public void setId_Banque(int id_Banque) {
        Id_Banque = id_Banque;
    }

    public String getNom_B() {
        return Nom_B;
    }

    public void setNom_B(String nom_B) {
        Nom_B = nom_B;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
