package com.example.springserver.model.demande;

import com.example.springserver.model.adherant.Adherant;
import com.example.springserver.model.banque.Banque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DemandeDao {

    @Autowired
    private DemandeRepositoty repository;

    public void  save(Demande demande){
         repository.save(demande);
    }

    public Demande update(Demande demande) {
        return repository.save(demande);
    }

    public List<Demande> getAllDemande(){
        List<Demande> demandes=new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(demandes::add);
        return demandes;
    }



    public void deletedemandeById(int id_demande) {
        repository.deleteById(id_demande);
    }

    public Demande getDemandeById(int id_demande) {
        return repository.findById(id_demande).orElse(null);
    }

    public void saveOrUpdateDem(Demande demande) {
        repository.save(demande);
    }

}
