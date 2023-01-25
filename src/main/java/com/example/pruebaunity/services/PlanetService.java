package com.example.pruebaunity.services;

import java.util.List;
import java.util.Optional;

import com.example.pruebaunity.entities.Planet;
import com.example.pruebaunity.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlanetService {
	
	@Autowired
	private PlanetRepository planetRepository;
	public Planet create(Planet planet) {
		planetRepository.save(planet);
		return planet;
		
	}
	public List<Planet> getAllPlanets(){
		return (List<Planet>) planetRepository.findAll();
	}
	
	public void delete(Planet planet) {
		planetRepository.delete(planet);
				
	}
	public Optional<Planet> findById(Long id){
		return planetRepository.findById(id);
	}
}
