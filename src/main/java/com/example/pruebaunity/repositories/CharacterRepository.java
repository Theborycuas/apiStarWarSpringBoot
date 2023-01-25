package com.example.pruebaunity.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.pruebaunity.entities.Personaje;

public interface CharacterRepository extends CrudRepository<Personaje, Long> {

}
