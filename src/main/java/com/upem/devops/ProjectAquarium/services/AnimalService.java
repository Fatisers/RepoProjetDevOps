package com.upem.devops.ProjectAquarium.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upem.devops.ProjectAquarium.models.Animal;

@Service
public class AnimalService {
	
	@Autowired
    private AnimalRepository animaux;
	
	
	public Iterable<Animal> getAnimaux() {
        return animaux.findAll();
    }

    public Animal getAnimalById(int id) { return animaux.findById(id);}
    public List<Animal> getAnimalByNom(String nom) { return animaux.findByNom(nom);}
    

    public Animal addAnimal(Animal a ){
        return this.animaux.save(a);
    }


    public void addAnimaux(List<Animal> list){
        this.animaux.saveAll(list);
    }

    public void deleteAnimal(int id) { this.animaux.deleteById(id);}
	
}
