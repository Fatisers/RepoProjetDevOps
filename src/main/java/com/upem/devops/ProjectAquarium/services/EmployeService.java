package com.upem.devops.ProjectAquarium.services;

import com.upem.devops.ProjectAquarium.models.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */

@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employes;


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

}
