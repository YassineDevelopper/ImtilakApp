package com.example.springserver.model.adherant;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AdherantRepository extends CrudRepository<Adherant,Integer> {
}

