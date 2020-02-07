package com.upem.devops.ProjectAquarium.services;

import com.upem.devops.ProjectAquarium.models.Activite;
import com.upem.devops.ProjectAquarium.models.Animal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */
public interface ActiviteRepository extends CrudRepository<Activite, Integer> {

    List<Activite> findByNom(String nom);
    Activite findById(int id);
}
