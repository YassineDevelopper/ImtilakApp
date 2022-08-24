package com.example.springserver.model.demande;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeRepositoty extends CrudRepository<Demande,Integer> {
}
