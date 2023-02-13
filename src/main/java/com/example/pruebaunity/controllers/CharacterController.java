package com.example.pruebaunity.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.pruebaunity.services.CharacterService;

import lombok.extern.slf4j.Slf4j;

import com.example.pruebaunity.entities.Personaje;

@Slf4j
@Controller
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/personaje")
public class CharacterController {
	
	@Autowired
	private CharacterService characterService;
	
	@GetMapping("/")
	public ResponseEntity<List<Personaje>> listadoCharacter() {
		//return ResponseEntity.ok(characterService.listadoCharacter());
		return ResponseEntity.ok(characterService.getAllCharacters());	}
	@PostMapping("/create")
	public ResponseEntity<Personaje> guardar(@RequestBody Personaje characterRequest){
		Personaje newCharacter = characterService.create(characterRequest);
		try {
			return ResponseEntity.created(new URI("/character"+newCharacter.getId())).body(newCharacter);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}
	
	@PostMapping("/update")
	public ResponseEntity<Personaje> update(@RequestBody Personaje characterRequest){
		Personaje newCharacter = characterService.create(characterRequest);
		try {
			return ResponseEntity.created(new URI("/character"+newCharacter.getId())).body(newCharacter);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<Void> eliminarId(@PathVariable Long id){
		characterService.deleteId(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Personaje>> listarById(@PathVariable("id") Long id){
		return ResponseEntity.ok(characterService.findById(id));
	}
	
}
