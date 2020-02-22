package com.upem.devops.ProjectAquarium.services;

import com.upem.devops.ProjectAquarium.models.Bassin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class BassinService {
    @Autowired
    private BassinRepository bassins;

    @PostConstruct
    public void init(){
        Bassin b1 = new Bassin(1,24,7,"propre",1,1);
        Bassin b2 = new Bassin(2,21,7,"propre",1,2);
        addBassin(b1);
        addBassin(b2);
    }


    public Iterable<Bassin> getBassins() {
        return bassins.findAll();
    }

    public Bassin getBassinById(int id) { return bassins.findById(id);}
    public List<Bassin> getBassinByNom(int findByIdResponsable) { return bassins.findByIdResponsable(findByIdResponsable);}


    public Bassin addBassin(Bassin b ){
        return this.bassins.save(b);
    }


    public void addBassins(List<Bassin> list){
        this.bassins.saveAll(list);
    }

    public void deleteBassin(int id) { this.bassins.deleteById(id);}

}
