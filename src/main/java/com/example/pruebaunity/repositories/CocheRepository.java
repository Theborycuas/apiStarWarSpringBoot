package com.example.pruebaunity.repositories;

import com.example.pruebaunity.entities.Coche;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CocheRepository extends CrudRepository<Coche, Long> {

}