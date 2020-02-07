package com.upem.devops.ProjectAquarium.Controllers;


import com.upem.devops.ProjectAquarium.models.Bassin;

import com.upem.devops.ProjectAquarium.services.BassinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */
@RestController
public class BassinController {

    @Autowired
    BassinService bassinService;

    @GetMapping("/bassins")
    public Iterable<Bassin> getbassins() {
        System.out.println("getbassins");
        return bassinService.getBassins();
    }

    @GetMapping("/Bassin/{id}")
    public Bassin getBassin(@PathVariable Integer id) {
        Bassin b = new Bassin(1,14,1.4,"etat",1,1);
        //return BassinService.getBassinById(id);
        return b;
    }


    @PostMapping(path = "/addbassins")
    public void addBassins(@RequestBody List<Bassin> list) {
        bassinService.addBassins(list);
    }

    @PostMapping(path = "/addBassin")
    public void addBassin(@RequestBody Bassin b) {
        bassinService.addBassin(b);
    }

    @PutMapping(value = "/updateBassin")
    public Bassin updateBassin( @RequestBody Bassin Bassin) {
        return bassinService.addBassin(Bassin);
    }

    @DeleteMapping("/deleteBassin/{id}")
    public void deleteBassin(@PathVariable int id) {
        bassinService.deleteBassin(id);
    }
}
