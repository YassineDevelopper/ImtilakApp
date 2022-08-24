package com.example.springserver.model.demande;

import com.example.springserver.model.adherant.Adherant;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Demande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_demande;
    private int montant;
    private int duree_en_mois;
    private String ville_du_bien;
    private String mecanisme_du_financement;
    private String ville_residence;
    private String ville_naissance;
    private String tel_mobile;
    private String tel_fixe;
    private String adresse_residence;

    @ManyToOne
    @JoinColumn(name="id")
    private Adherant adherant;

    public String getVille_residence() {
        return ville_residence;
    }

    public void setVille_residence(String ville_residence) {
        this.ville_residence = ville_residence;
    }

    public String getVille_naissance() {
        return ville_naissance;
    }

    public void setVille_naissance(String ville_naissance) {
        this.ville_naissance = ville_naissance;
    }

    public String getTel_mobile() {
        return tel_mobile;
    }

    public void setTel_mobile(String tel_mobile) {
        this.tel_mobile = tel_mobile;
    }

    public String getTel_fixe() {
        return tel_fixe;
    }

    public void setTel_fixe(String tel_fixe) {
        this.tel_fixe = tel_fixe;
    }

    public String getAdresse_residence() {
        return adresse_residence;
    }

    public void setAdresse_residence(String adresse_residence) {
        this.adresse_residence = adresse_residence;
    }

    public String getNom_banque() {
        return nom_banque;
    }

    public void setNom_banque(String nom_banque) {
        this.nom_banque = nom_banque;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getEtat_dem() {
        return etat_dem;
    }

    public void setEtat_dem(String etat_dem) {
        this.etat_dem = etat_dem;
    }

    private String nom_banque;
    private String objet;
    private String etat_dem;


    public int getId_demande() {
        return id_demande;
    }

    public void setId_demande(int id_demande) {
        this.id_demande = id_demande;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getDuree_en_mois() {
        return duree_en_mois;
    }

    public void setDuree_en_mois(int duree_en_mois) {
        this.duree_en_mois = duree_en_mois;
    }

    public String getVille_du_bien() {
        return ville_du_bien;
    }

    public void setVille_du_bien(String ville_du_bien) {
        this.ville_du_bien = ville_du_bien;
    }

    public String getMecanisme_du_financement() {
        return mecanisme_du_financement;
    }

    public void setMecanisme_du_financement(String mecanisme_du_financement) {
        this.mecanisme_du_financement = mecanisme_du_financement;
    }
}
