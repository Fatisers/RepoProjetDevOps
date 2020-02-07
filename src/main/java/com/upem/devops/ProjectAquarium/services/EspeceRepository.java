package com.upem.devops.ProjectAquarium.services;

import com.upem.devops.ProjectAquarium.models.Espece;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */
public interface EspeceRepository extends CrudRepository<Espece, Integer> {

    List<Espece> findByNom(String nom);
    Espece findById(int id);
}
