package com.upem.devops.ProjectAquarium.services;


import com.upem.devops.ProjectAquarium.models.Secteur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */
public interface SecteurRepository extends CrudRepository<Secteur, Integer> {

    List<Secteur> findByNom(String nom);
    Secteur findById(int id);
}
