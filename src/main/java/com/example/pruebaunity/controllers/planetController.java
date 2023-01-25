package com.example.pruebaunity.controllers;

import com.example.pruebaunity.entities.Planet;
import com.example.pruebaunity.services.PlanetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/planet")
public class planetController {

    @Autowired
    private PlanetService planetService;

    @GetMapping("/all")
    public ResponseEntity<List<Planet>> listadoPlanet() {
        //return ResponseEntity.ok(planetService.listadoPlanet());
        return ResponseEntity.ok(planetService.getAllPlanets());	}
    @PostMapping("/create")
    public ResponseEntity<Planet> guardar(@RequestBody Planet planetRequest){
        Planet newPlanet = planetService.create(planetRequest);
        try {
            return ResponseEntity.created(new URI("/planet"+newPlanet.getId())).body(newPlanet);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> eliminar(@RequestBody Planet planetRequest){
        planetService.delete(planetRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Planet>> listarById(@PathVariable("id") Long id){
        return ResponseEntity.ok(planetService.findById(id));
    }

}
