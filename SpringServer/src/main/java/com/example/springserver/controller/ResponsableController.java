package com.example.springserver.controller;



import com.example.springserver.model.respo.Responsable;
import com.example.springserver.model.respo.ResponsableDao;
import com.example.springserver.model.respo.ResponsableRepository;
import com.example.springserver.model.respo.UserNotFoundException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
public class ResponsableController {
    @Autowired
    private ResponsableDao responsableDao;

    @GetMapping("/responsable/get-all")
    public List<Responsable> getAllResponsables() {
        return responsableDao.getAllResponsables();
    }

    @GetMapping("/responsable/getResById/{id_respo}")
    public ResponseEntity<Responsable> getResById(@PathVariable("id_respo") int id_respo) {
        Responsable responsable = null;
        try {
            responsable = responsableDao.getResById(id_respo);
        }
        catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Responsable>(responsable, HttpStatus.OK);
    }

    @PutMapping("/responsable/addOrUpdateRes")
    public ResponseEntity<Responsable> addOrUpdateRes(@RequestBody Responsable Responsables) {
        Responsable responsable = null;
        try {
            responsable = responsableDao.addOrUpdateRes(Responsables);
        }
        catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Responsable>(responsable, HttpStatus.OK);
    }

    @PostMapping("/responsable/save")
    public void save(@RequestBody Responsable responsable) {
        responsableDao.save(responsable);
    }

    @DeleteMapping("/responsable/deleteRes/{id_respo}")
    public void delete(@PathVariable int id_respo){
        responsableDao.delete(id_respo);
    }
/*
    @PutMapping("/responsable/updateRes")
    public void updateRes(@RequestBody Responsable responsable) {
        responsableDao.save(responsable);
    }
*/

 /*   @PostMapping("/responsable/edit")
    public void edit(@PathVariable("id_respo") int id_respo, Model model, RedirectAttributes ra) {
        try {
            Responsable responsable = responsableDao.get(id_respo);
            model.addAttribute("responsable", responsable);
            model.addAttribute("page", "edit responsable( ID :" + id_respo + ")");
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message ", "updated successfully");

        }
    }

    */


}
