package com.example.pruebaunity.repositories;

import com.example.pruebaunity.entities.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface PlanetRepository extends CrudRepository<Planet, Long> {

}
