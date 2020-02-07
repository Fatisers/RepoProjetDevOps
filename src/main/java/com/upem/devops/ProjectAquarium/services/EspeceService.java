package com.upem.devops.ProjectAquarium.services;


import com.upem.devops.ProjectAquarium.models.Espece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class EspeceService {
    @Autowired
    private EspeceRepository especes;


    public Iterable<Espece> getEspeces() {
        return especes.findAll();
    }

    public Espece getEspeceById(int id) { return especes.findById(id);}
    public List<Espece> getEspeceByNom(String type) { return especes.findByType(type);}


    public Espece addEspece(Espece e ){
        return this.especes.save(e);
    }


    public void addEspeces(List<Espece> list){
        this.especes.saveAll(list);
    }

    public void deleteEspece(int id) { this.especes.deleteById(id);}

}
