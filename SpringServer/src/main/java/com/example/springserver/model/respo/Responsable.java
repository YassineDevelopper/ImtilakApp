package com.example.springserver.model.respo;

import javax.persistence.*;

@Entity
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_respo;
    private String prenomrespo;
    private String username;
    private String password;

    public int getId_respo() {
        return id_respo;
    }

    public void setId_respo(int id_respo) {
        this.id_respo = id_respo;
    }

    public String getPrenomrespo() {
        return prenomrespo;
    }

    public void setPrenomrespo(String prenomrespo) {
        this.prenomrespo = prenomrespo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
