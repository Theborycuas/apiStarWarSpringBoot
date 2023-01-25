package com.example.pruebaunity.repositories;

import com.example.pruebaunity.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface FilmRepository extends CrudRepository<Film, Long> {

}
