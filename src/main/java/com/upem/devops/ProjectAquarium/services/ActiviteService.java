package com.upem.devops.ProjectAquarium.services;


import com.upem.devops.ProjectAquarium.models.Activite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class ActiviteService {
    @Autowired
    private ActiviteRepository activites;

    @PostConstruct
    public void init(){
        Activite a1 = new Activite(1,"11/02/2020","Inspection de la qualité de l’eau","14:00","17:00","Privee",1,1);
        Activite a2 = new Activite(2,"16/03/2020","Nourissage bassin","10:50","11:20","Publique",2,2);
        Activite a3 = new Activite(2,"22/01/2020","Bilan vétérinaire","13:10","14:30","Privee",2,2);

        addActivite(a1);
        addActivite(a2);
        addActivite(a3);
    }


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

    public Iterable<Activite> searchByDateAndHour(String date,String hour){
        Date d = new Date(date);
        int month = d.getMonth()+1;
        date = d.getDate()+"/0"+month+"/2020";
        Iterable<Activite> list = getActivites();
        List<Activite> res = new ArrayList<>();
        for (Activite a: list
             ) {
            if(a.getPubliqueOuPrivee().equals("Publique")) {
                if (a.getJour().equals(date)) {
                    if (a.getHeureDebut().equals("") == false) {
                        if (a.getHeureDebut().equals(hour)) {
                            System.out.println(a);
                            res.add(a);
                        }
                    } else res.add(a);
                }
            }
        }
        return res;
    }

}
