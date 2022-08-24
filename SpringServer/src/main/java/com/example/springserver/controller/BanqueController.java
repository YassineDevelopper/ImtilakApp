package com.example.springserver.controller;


import com.example.springserver.model.banque.Banque;
import com.example.springserver.model.banque.BanqueDao;
import com.example.springserver.model.banque.BanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BanqueController {
    @Autowired

    private BanqueDao banqueDao;

    @GetMapping("/banque/get-all")
    public List<Banque> getAllBanques(){
    return banqueDao.getAllbanque();
}
    @PostMapping("/banque/save")
    public Banque save(@RequestBody Banque banque) {
    return banqueDao.save(banque);
}
}

