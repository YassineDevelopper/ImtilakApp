package com.example.springserver.model.banque;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
@Repository

public interface BanqueRepository extends CrudRepository<Banque,Integer>{
}
