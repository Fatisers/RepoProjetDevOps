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

import com.upem.devops.ProjectAquarium.models.Espece;

import com.upem.devops.ProjectAquarium.services.EspeceService;

@RestController
public class EspeceController {

    @Autowired
    EspeceService EspeceService;

    @GetMapping("/especes")
    public Iterable<Espece> getespeces() {
        System.out.println("getespeces");
        return EspeceService.getEspeces();
    }

    @GetMapping("/Espece/{id}")
    public Espece getEspece(@PathVariable Integer id) {
        Espece a = new Espece();
        //return EspeceService.getEspeceById(id);
        return a;
    }


    @PostMapping(path = "/addespeces")
    public void addespeces(@RequestBody List<Espece> list) {
        EspeceService.addEspeces(list);
    }

    @PostMapping(path = "/addEspece")
    public void addEspece(@RequestBody Espece a) {
        EspeceService.addEspece(a);
    }

    @PutMapping(value = "/updateEspece")
    public Espece updateEspece( @RequestBody Espece Espece) {
        return EspeceService.addEspece(Espece);
    }

    @DeleteMapping("/deleteEspece/{id}")
    public void deleteEspece(@PathVariable int id) {
        EspeceService.deleteEspece(id);
    }

}
