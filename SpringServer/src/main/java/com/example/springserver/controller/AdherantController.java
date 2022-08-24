package com.example.springserver.controller;

import com.example.springserver.model.adherant.Adherant;
import com.example.springserver.model.adherant.AdherantDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
@RestController
public class AdherantController {
    @Autowired

    private AdherantDao adherantDao;

        @GetMapping("/adherant/get-all")
    public List<Adherant> getAlladherant() {
        return adherantDao.getAlladherant();
    }

        @GetMapping("/getadherant/{id}")
    public ResponseEntity<Adherant> getAdherantById(@PathVariable("id") int id) {
            Adherant adherant = null;
        try {
            adherant = adherantDao.getAdherantById(id);
        }
        catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Adherant>(adherant, HttpStatus.OK);
    }

        @PutMapping("/adherant/update")
    public ResponseEntity<Adherant> update(@RequestBody Adherant adherants) {
        Adherant adherant = null;
        try {
            adherant = adherantDao.update(adherants);
        }
        catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Adherant>(adherant, HttpStatus.OK);
    }


        @PostMapping("/adherant/save")
    public void save(@RequestBody Adherant adherant) {
         adherantDao.save(adherant);
    }



    @DeleteMapping("/deleteadherant/{id}")
    public void deleteAdherant(@PathVariable("id") int id) {
        adherantDao.deleteadherantById(id);
    }

}
