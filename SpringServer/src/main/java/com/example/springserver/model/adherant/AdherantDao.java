package com.example.springserver.model.adherant;
import java.util.ArrayList;
import java.util.List;

import com.example.springserver.model.demande.Demande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class AdherantDao {
    @Autowired
    private AdherantRepository repository;

    public void save(Adherant adherant) {
         repository.save(adherant);
    }

    public Adherant update(Adherant adherant) {
        return repository.save(adherant);
    }
    public List<Adherant> getAlladherant() {
        List<Adherant> adherants = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(adherants::add);
        return adherants;
    }



    public void deleteadherantById(int id) {
        repository.deleteById(id);
    }
    public Adherant getAdherantById(int Id) {
        return repository.findById(Id).orElse(null);
    }


    public void saveOrUpdate(Adherant adherant) {
        repository.save(adherant);
    }


}



