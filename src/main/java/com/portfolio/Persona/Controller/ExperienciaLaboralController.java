package com.portfolio.Persona.Controller;

import com.portfolio.Persona.model.ExperienciaLaboral;
import com.portfolio.Persona.model.Persona;
import com.portfolio.Persona.service.ExperienciaLaboralService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaLaboralController {
    private final ExperienciaLaboralService experienciaLaboralService;

    public ExperienciaLaboralController(ExperienciaLaboralService experienciaLaboralService) {
        this.experienciaLaboralService = experienciaLaboralService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ExperienciaLaboral>> getAllExperiencias() {
        List<ExperienciaLaboral> experiencias = experienciaLaboralService.findAllExperiencias();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ExperienciaLaboral> addExperienciaLaboral (@RequestBody ExperienciaLaboral experienciaLaboral) {
        ExperienciaLaboral newExperienciaLaboral = experienciaLaboralService.addExperienciaLaboral(experienciaLaboral);
        return new ResponseEntity<>(newExperienciaLaboral, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ExperienciaLaboral> updatePersona (@RequestBody ExperienciaLaboral experienciaLaboral) {
        ExperienciaLaboral updateExperienciaLaboral = experienciaLaboralService.updateExperienciaLaboral(experienciaLaboral);
        return new ResponseEntity<>(updateExperienciaLaboral, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperienciaLaboral(@PathVariable("id") Long id) {
        experienciaLaboralService.deleteExperienciaLaboral(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
