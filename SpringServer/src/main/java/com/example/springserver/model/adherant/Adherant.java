package com.example.springserver.model.adherant;
import com.example.springserver.model.demande.Demande;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
public class Adherant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int cin;
    private int ppr;
    private String nomprenom;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date datenaissance;
    private String genre;
    private BigInteger n_adh;

    @OneToMany(mappedBy = "adherant")
    private List<Demande> demandes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getPpr() {
        return ppr;
    }

    public void setPpr(int ppr) {
        this.ppr = ppr;
    }

    public String getNomprenom() {
        return nomprenom;
    }

    public void setNomprenom(String nomprenom) {
        this.nomprenom = nomprenom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BigInteger getN_adh() {
        return n_adh;
    }

    public void setN_adh(BigInteger n_adh) {
        this.n_adh = n_adh;
    }
}
