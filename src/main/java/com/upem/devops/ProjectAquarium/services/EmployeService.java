package com.upem.devops.ProjectAquarium.services;

import com.upem.devops.ProjectAquarium.models.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employes;

    @Autowired
    BassinService bassinService;


    @PostConstruct
    public void init(){
        //Admin de l'application

        Employe e1 = new Employe(1,"Fati","admin","admin","fati","44 rue de x","16/07/1998","AS123","Gestionnaire");
        Employe e2 = new Employe(2,"Sersouri","employe","employe","fati","france","11/07/2000","QW21","Employe");
        Employe e3 = new Employe(2,"FatimaZohra","resp","resp","fati","avenue y","19/09/2000","QW21","Responsable Bassin");

        e1.addBassin(bassinService.getBassinById(1));
        e2.addBassin(bassinService.getBassinById(2));
        e3.addBassin(bassinService.getBassinById(2));
        addEmploye(e1);
        addEmploye(e2);
        addEmploye(e3);
    }

    public Iterable<Employe> getEmployes() {
        return employes.findAll();
    }

    public Employe getEmployeById(int id) { return employes.findById(id);}
    public List<Employe> getEmployeByNom(String nom) { return employes.findByNom(nom);}


    public Employe addEmploye(Employe e ){
        return this.employes.save(e);
    }


    public void addEmployes(List<Employe> list){
        this.employes.saveAll(list);
    }

    public void deleteEmploye(int id) { this.employes.deleteById(id);}

    public Employe login(String username, String pwd ){

        Iterable<Employe> list = getEmployes();
        for (Employe e: list) {
            if(e.getIdentifiant().equals(username) && e.getMotdepasse().equals(pwd)){
                System.out.println("eeeee "+e);
                return e;
            }
        }
        return null;

    }

}
