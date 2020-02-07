package com.upem.devops.ProjectAquarium.services;

import com.upem.devops.ProjectAquarium.models.Bassin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class BassinService {
    @Autowired
    private BassinRepository bassins;


    public Iterable<Bassin> getBassins() {
        return bassins.findAll();
    }

    public Bassin getBassinById(int id) { return bassins.findById(id);}
    public List<Bassin> getBassinByNom(String nom) { return bassins.findByNom(nom);}


    public Bassin addBassin(Bassin b ){
        return this.bassins.save(b);
    }


    public void addBassins(List<Bassin> list){
        this.bassins.saveAll(list);
    }

    public void deleteBassin(int id) { this.bassins.deleteById(id);}

}
