package com.example.springserver.controller;


import com.example.springserver.model.demande.Demande;
import com.example.springserver.model.demande.DemandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DemandeController {
    @Autowired

    private DemandeDao demandeDao;
    @GetMapping("/demande/get-all")
    public List<Demande> getAllDemande(){
        return demandeDao.getAllDemande();
    }

    @GetMapping("/getdemande/{id_demande}")
    public ResponseEntity<Demande> getDemandeById(@PathVariable("id_demande") int id_demande) {
        Demande demande = null;
        try {
            demande = demandeDao.getDemandeById(id_demande);
        }
        catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Demande>(demande, HttpStatus.OK);
    }

    @PutMapping("/demande/update")
    public ResponseEntity<Demande> update(@RequestBody Demande demandes) {
        Demande demande = null;
        try {
            demande = demandeDao.update(demandes);
        }
        catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Demande>(demande, HttpStatus.OK);
    }


    @PostMapping("/demande/save")
    public void save(@RequestBody Demande demande) {
         demandeDao.save(demande);
    }


    @DeleteMapping("/demande/{Id_demande}")
    public void deleteDemande(@PathVariable("Id_demande") int id) {
        demandeDao.deletedemandeById(id);
    }
}
