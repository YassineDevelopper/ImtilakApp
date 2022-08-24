package com.example.springserver.model.banque;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class BanqueDao {
    @Autowired
    private BanqueRepository repository;

    public Banque save(Banque banque){
        return repository.save(banque);
    }

    public List<Banque> getAllbanque(){
        List<Banque> banques=new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(banques::add);
        return banques;
    }

    public void delete(int  Id_Banque){
        repository.deleteById(Id_Banque);
    }


}



