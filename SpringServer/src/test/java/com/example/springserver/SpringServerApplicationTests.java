package com.example.springserver;

import com.example.springserver.model.respo.Responsable;
import com.example.springserver.model.respo.ResponsableDao;
import com.example.springserver.model.respo.UserNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@SpringBootTest
class SpringServerApplicationTests {

    @Autowired
    private ResponsableDao responsableDao;

    @Test
    void addResponsableTest() {
        Responsable responsable = new Responsable();
        responsable.setPrenomrespo("Yassine");
        responsable.setUsername("Yassine username");
        responsable.setPassword("Yassine password");
        responsableDao.save(responsable);
    }

    //@Test
    void getAllResponsables() {
        List<Responsable> responsables = responsableDao.getAllResponsables();
        System.out.println(responsables);
    }

    @Test
    void DeleteRes() {
        responsableDao.delete(8);
    }

    @Test
    void updateRes() {
        Responsable responsable = new Responsable();
        responsable.setPrenomrespo("Yassine");
        responsable.setUsername("Yassine user");
        responsable.setPassword("Yassine password");
        responsableDao.save(responsable);
    }




}

