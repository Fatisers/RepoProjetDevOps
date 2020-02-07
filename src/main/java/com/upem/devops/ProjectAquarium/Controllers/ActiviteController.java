package com.upem.devops.ProjectAquarium.Controllers;

import com.upem.devops.ProjectAquarium.models.Activite;
import com.upem.devops.ProjectAquarium.services.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */
public class ActiviteController {

    @RestController
    public class AnimalController {

        @Autowired
        ActiviteService activiteService;

        @GetMapping("/activites")
        public Iterable<Activite> getActivites() {
            System.out.println("getactivites");
            return activiteService.getActivites();
        }

        @GetMapping("/activite/{id}")
        public Activite getAnimal(@PathVariable Integer id) {
            Activite a = new Activite(1,"Mardi", "Activite", "14h", "16h", "privee", 1, 1);
            //return animalService.getAnimalById(id);
            return a;
        }


        @PostMapping(path = "/addactivites")
        public void addActivites(@RequestBody List<Activite> list) {
            activiteService.addActivites(list);
        }

        @PostMapping(path = "/addactivite")
        public void addActivite(@RequestBody Activite a) {
            activiteService.addActivite(a);
        }

        @PutMapping(value = "/updateactivite")
        public Activite updateActivite(@RequestBody Activite activite) {
            return activiteService.addActivite(activite);
        }

        @DeleteMapping("/deleteactivite/{id}")
        public void deleteActivite(@PathVariable int id) {
            activiteService.deleteActivite(id);
        }

    }

}
