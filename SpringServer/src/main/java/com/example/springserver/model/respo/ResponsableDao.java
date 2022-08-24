package com.example.springserver.model.respo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ResponsableDao {
    @Autowired
    private ResponsableRepository repository ;

    public void save(Responsable responsable) {
        repository.save(responsable);
    }

    public List<Responsable> getAllResponsables() {
        List<Responsable> Responsables = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(Responsables :: add);
    return Responsables;
    }

    public Responsable getResById(int id_respo) {
        return repository.findById(id_respo).orElse(null);
    }

    public Responsable addOrUpdateRes(Responsable responsable) {
        return repository.save(responsable);
    }

   /* public void delete(Responsable responsable) {
        repository.delete(responsable);
    }
*/


    public void delete (int id_respo) {
        repository.deleteById(id_respo);
    }


}
