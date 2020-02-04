package com.upem.devops.ProjectAquarium.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.upem.devops.ProjectAquarium.models.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Integer>{

	 List<Animal> findByNom(String nom);
	 Animal findById(int id);
}
