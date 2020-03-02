package com.upem.devops.ProjectAquarium.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upem.devops.ProjectAquarium.models.Animal;

import javax.annotation.PostConstruct;

@Service
public class AnimalService {
	
	@Autowired
    private AnimalRepository animaux;

    @PostConstruct
    public void init(){
        Animal a1 = new Animal(1,"Poisson","Male","Cancer","01/01/2020","02/02/2020",1,1);
        Animal a2 = new Animal(2,"Requin","Femelle","Cancer","13/03/2020","01/07/2020",2,2);
        Animal a3 = new Animal(3,"Meduse","Femelle","Cancer","04/03/2020","03/04/2020",1,2);
        Animal a4 = new Animal(4,"Mole","Male","Cancer","12/05/2020","02/06/2020",2,1);
        Animal a5 = new Animal(5,"Requin gris","Male","Cancer","08/03/2020","03/04/2020",1,2);
        Animal a6 = new Animal(6,"Méduse lune","Male","Cancer","12/11/2020","02/06/2020",2,2);


        addAnimal(a1);
        addAnimal(a2);
        addAnimal(a3);
        addAnimal(a4);
        addAnimal(a5);
        addAnimal(a6);
    }
	
	
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
