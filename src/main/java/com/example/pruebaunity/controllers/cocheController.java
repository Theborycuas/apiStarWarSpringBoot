package com.example.pruebaunity.controllers;

import com.example.pruebaunity.entities.Coche;
import com.example.pruebaunity.services.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class cocheController {

    @Autowired
    private CocheService cocheService;

    /*@RequestMapping("/")
    public String hola(Model modelo){
        modelo.addAttribute("mensaje","Hola mundo");
        return "hola";
    }*/

    @GetMapping("/coches")
    public ResponseEntity<List<Coche>> listadoCoches(){
        //Llamamos al servicio
        return new ResponseEntity<List<Coche>>(cocheService.listadoCoches(), HttpStatus.OK);
    }
}

