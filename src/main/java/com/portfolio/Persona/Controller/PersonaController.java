package com.portfolio.Persona.Controller;

import com.portfolio.Persona.model.Persona;
import com.portfolio.Persona.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    private final PersonaService personaService;


    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        List<Persona> personas = personaService.findAllPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Persona> getPersonabyId(@PathVariable("id") Long id) {
        Persona persona = personaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Persona> addPersona (@RequestBody Persona persona) {
        Persona newPersona = personaService.addPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> updatePersona (@RequestBody Persona persona) {
        Persona updatePersona = personaService.updatePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona (@PathVariable("id") Long id) {
        personaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
