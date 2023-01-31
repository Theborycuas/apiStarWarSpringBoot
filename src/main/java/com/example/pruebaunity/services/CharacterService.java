package com.example.pruebaunity.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceBinding.ServiceLifecycleOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pruebaunity.repositories.CharacterRepository;
import com.example.pruebaunity.entities.Personaje;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CharacterService {

	@Autowired
	private CharacterRepository characterRepository;
	
	public List<Personaje> listadoCharacter(){
		return (List<Personaje>) characterRepository.findAll();
		/*List<Personaje> characters = new ArrayList<>();
		
		Iterator it = characterRepository.findAll().iterator();
		
		while(it.hasNext()) {
			Personaje characterDto = (Personaje) it.next();
			characters.add(characterDto);
		}
		return characters;*/
	}

	public Personaje create(Personaje personaje) {
		characterRepository.save(personaje);
		return personaje;

	}
	public List<Personaje> getAllCharacters(){
		return (List<Personaje>) characterRepository.findAll();
	}

	public void delete(Personaje personaje) {
		characterRepository.delete(personaje);

	}
	

	public void deleteId(Long id) {
		// TODO Auto-generated method stub
		characterRepository.deleteById(id);
		
	}
	
	public Optional<Personaje> findById(Long id){
		return characterRepository.findById(id);
	}
}
