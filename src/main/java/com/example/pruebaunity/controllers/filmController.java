package com.example.pruebaunity.controllers;


import com.example.pruebaunity.entities.Film;
import com.example.pruebaunity.services.FilmService;
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
@RequestMapping("/film")
public class filmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/all")
    public ResponseEntity<List<Film>> listadoFilm() {
        //return ResponseEntity.ok(filmService.listadoFilm());
        return ResponseEntity.ok(filmService.getAllFilms());	}
    @PostMapping("/create")
    public ResponseEntity<Film> guardar(@RequestBody Film filmRequest){
        Film newFilm = filmService.create(filmRequest);
        try {
            return ResponseEntity.created(new URI("/film"+newFilm.getId())).body(newFilm);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> eliminar(@RequestBody Film filmRequest){
        filmService.delete(filmRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Film>> listarById(@PathVariable("id") Long id){
        return ResponseEntity.ok(filmService.findById(id));
    }

}
