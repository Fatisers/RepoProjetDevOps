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

import com.upem.devops.ProjectAquarium.models.Animal;

import com.upem.devops.ProjectAquarium.services.AnimalService;

@RestController
public class AnimalController {

	 @Autowired
	    AnimalService animalService;

	    @GetMapping("/animaux")
	    public Iterable<Animal> getAnimaux() {
	        System.out.println("getanimaux");
	        return animalService.getAnimaux();
	    }

	    @GetMapping("/animal/{id}")
	    public Animal getAnimal(@PathVariable Integer id) {
	    	Animal a = new Animal(1, "animaleee", "male", "cancer", "11/11/2020", "12/11/2022", 2, 2);
	        //return animalService.getAnimalById(id);
	    	return a;
	    }


	    @PostMapping(path = "/addanimaux")
	    public void addAnimaux(@RequestBody List<Animal> list) {
	        animalService.addAnimaux(list);
	    }

	    @PostMapping(path = "/addanimal")
	    public void addAnimal(@RequestBody Animal a) {
	        animalService.addAnimal(a);
	    }

	    @PutMapping(value = "/updateanimal")
	    public Animal updateAnimal( @RequestBody Animal animal) {
	        return animalService.addAnimal(animal);
	    }

	    @DeleteMapping("/deleteanimal/{id}")
	    public void deleteAnimal(@PathVariable int id) {
	        animalService.deleteAnimal(id);
	    }

}
