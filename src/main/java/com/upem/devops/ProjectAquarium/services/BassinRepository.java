package com.upem.devops.ProjectAquarium.services;

import com.upem.devops.ProjectAquarium.models.Bassin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */
public interface BassinRepository extends CrudRepository<Bassin, Integer> {

    List<Bassin> findByNom(String nom);
    Bassin findById(int id);
}
