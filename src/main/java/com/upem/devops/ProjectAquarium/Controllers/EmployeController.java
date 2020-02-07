package com.upem.devops.ProjectAquarium.Controllers;
import java.util.ArrayList;
import java.util.List;

import com.upem.devops.ProjectAquarium.models.Bassin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upem.devops.ProjectAquarium.models.Employe;

import com.upem.devops.ProjectAquarium.services.EmployeService;


/**
 * Created by fatisers on 04/02/2020.
 */


@RestController
public class EmployeController {

    @Autowired
    EmployeService EmployeService;

    @GetMapping("/Employes")
    public Iterable<Employe> getEmployes() {
        System.out.println("getEmployes");
        return EmployeService.getEmployes();
    }

    @GetMapping("/Employe/{id}")
    public Employe getEmploye(@PathVariable Integer id) {
        List<Bassin> bassins = new ArrayList<>();
        Bassin b = new Bassin(1,14,1.4,"etat",1,1);
        bassins.add(b);
        Employe a = new Employe(1, "employe1", "id", "abc", "prenom", "33 rue x", "12/2/2020", "ghjk", "aaa", bassins);
        //return EmployeService.getEmployeById(id);
        return a;
    }


    @PostMapping(path = "/addEmployes")
    public void addEmployes(@RequestBody List<Employe> list) {
        EmployeService.addEmployes(list);
    }

    @PostMapping(path = "/addEmploye")
    public void addEmploye(@RequestBody Employe a) {
        EmployeService.addEmploye(a);
    }

    @PutMapping(value = "/updateEmploye")
    public Employe updateEmploye( @RequestBody Employe Employe) {
        return EmployeService.addEmploye(Employe);
    }

    @DeleteMapping("/deleteEmploye/{id}")
    public void deleteEmploye(@PathVariable int id) {
        EmployeService.deleteEmploye(id);
    }

}
