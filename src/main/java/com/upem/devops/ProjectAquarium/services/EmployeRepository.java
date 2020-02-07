package com.upem.devops.ProjectAquarium.services;

import com.upem.devops.ProjectAquarium.models.Employe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fatisers on 04/02/2020.
 */
public interface EmployeRepository extends CrudRepository<Employe, Integer> {

    List<Employe> findByNom(String nom);
    Employe findById(int id);
}
