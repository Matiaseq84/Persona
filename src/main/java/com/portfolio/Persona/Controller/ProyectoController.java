package com.portfolio.Persona.Controller;

import com.portfolio.Persona.model.Proyecto;
import com.portfolio.Persona.service.ProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    
    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @PostMapping("/add")
    public ResponseEntity<Proyecto> addProyecto (@RequestBody Proyecto proyecto) {
        Proyecto newProyecto = proyectoService.addProyecto(proyecto);
        return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Proyecto> updatePersona (@RequestBody Proyecto proyecto) {
        Proyecto updateProyecto = proyectoService.updateProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable("id") Long id) {
        proyectoService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
