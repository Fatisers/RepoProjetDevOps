package com.upem.devops.ProjectAquarium.services;


import com.upem.devops.ProjectAquarium.models.Espece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class EspeceService {
    @Autowired
    private EspeceRepository especes;

    @PostConstruct
    public void init(){
        Espece e1 = new Espece(1,"Poisson rouge","Femelle",10,"granulés",1);
        Espece e2 = new Espece(1,"Panga","Male",5,"granulés",1);
        Espece e3 = new Espece(1,"Espadon","Male",2,"crustacés et calmars",2);

        addEspece(e1);
        addEspece(e2);
        addEspece(e3);
    }

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
