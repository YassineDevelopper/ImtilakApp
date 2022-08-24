package com.example.springserver.model.respo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepository extends CrudRepository<Responsable, Integer> {

}
