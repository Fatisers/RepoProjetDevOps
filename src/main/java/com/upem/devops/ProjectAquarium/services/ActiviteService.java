package com.upem.devops.ProjectAquarium.services;


import com.upem.devops.ProjectAquarium.models.Activite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class ActiviteService {
    @Autowired
    private ActiviteRepository activites;


    public Iterable<Activite> getActivites() {
        return activites.findAll();
    }

    public Activite getActiviteById(int id) { return activites.findById(id);}
    public List<Activite> getActiviteByNom(String nom) { return activites.findByNom(nom);}


    public Activite addActivite(Activite a ){
        return this.activites.save(a);
    }


    public void addActivites(List<Activite> list){
        this.activites.saveAll(list);
    }

    public void deleteActivite(int id) { this.activites.deleteById(id);}

}
