package com.example.pruebaunity.services;

import java.util.List;
import java.util.Optional;

import com.example.pruebaunity.entities.Film;
import com.example.pruebaunity.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;
	public Film create(Film film) {
		filmRepository.save(film);
		return film;
		
	}
	public List<Film> getAllFilms(){
		return (List<Film>) filmRepository.findAll();
	}
	
	public void delete(Film film) {
		filmRepository.delete(film);
				
	}
	public Optional<Film> findById(Long id){
		return filmRepository.findById(id);
	}
}
