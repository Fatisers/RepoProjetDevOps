package com.upem.devops.ProjectAquarium.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upem.devops.ProjectAquarium.models.Secteur;

import com.upem.devops.ProjectAquarium.services.SecteurService;

@RestController
public class SecteurController {

    @Autowired
    SecteurService secteurService;

    @GetMapping("/Secteurs")
    public Iterable<Secteur> getSecteurs() {
        System.out.println("getSecteurs");
        return secteurService.getSecteurs();
    }

    @GetMapping("/secteur/{id}")
    public Secteur getsecteur(@PathVariable Integer id) {
        Secteur a = new Secteur();
        //return secteurService.getsecteurById(id);
        return a;
    }


    @PostMapping(path = "/addSecteurs")
    public void addSecteurs(@RequestBody List<Secteur> list) {
        secteurService.addSecteurs(list);
    }

    @PostMapping(path = "/addsecteur")
    public void addsecteur(@RequestBody Secteur a) {
        secteurService.addSecteur(a);
    }

    @PutMapping(value = "/updatesecteur")
    public Secteur updatesecteur( @RequestBody Secteur secteur) {
        return secteurService.addSecteur(secteur);
    }

    @DeleteMapping("/deletesecteur/{id}")
    public void deletesecteur(@PathVariable int id) {
        secteurService.deleteSecteur(id);
    }

}
