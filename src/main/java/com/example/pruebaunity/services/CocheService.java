package com.example.pruebaunity.services;

import com.example.pruebaunity.entities.Coche;
import com.example.pruebaunity.repositories.CocheRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
@Service
public class CocheService {

    @Autowired
    private CocheRepository cocheRepository;

    public List<Coche> listadoCoches(){
        List<Coche> coches = new ArrayList<>();

        Iterator it = cocheRepository.findAll().iterator();

        while(it.hasNext()){
            Coche cocheDto = (Coche) it.next();
            coches.add(cocheDto);
        }
        return coches;
    }

    /*public List<CocheForm> listadoCoches() {
        List<CocheForm> coches = new ArrayList<>();

        Iterator it = cocheRepository.findAll().iterator();
        while (it.hasNext()) {
            Coche cocheDto = (Coche) it.next();
            coches.add(modelMapper.map(cocheDto, CocheForm.class));
        }
        return coches;
    }*/
}
