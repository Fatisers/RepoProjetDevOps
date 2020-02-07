package com.upem.devops.ProjectAquarium.services;


import com.upem.devops.ProjectAquarium.models.Secteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class SecteurService {
    @Autowired
    private SecteurRepository secteurs;


    public Iterable<Secteur> getSecteurs() {
        return secteurs.findAll();
    }

    public Secteur getSecteursById(int id) { return secteurs.findById(id);}
    public List<Secteur> getSecteurByNom(String nom) { return secteurs.findByNom(nom);}


    public Secteur addSecteur(Secteur s ){
        return this.secteurs.save(s);
    }


    public void addSecteurs(List<Secteur> list){
        this.secteurs.saveAll(list);
    }

    public void deleteSecteur(int id) { this.secteurs.deleteById(id);}

}
