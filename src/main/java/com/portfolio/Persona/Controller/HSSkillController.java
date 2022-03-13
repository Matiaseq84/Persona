package com.portfolio.Persona.Controller;

import com.portfolio.Persona.model.HSSkill;
import com.portfolio.Persona.service.HSSkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hsskill")
public class HSSkillController {
    private final HSSkillService hsSkillService;

    public HSSkillController(HSSkillService hsSkillService) {
        this.hsSkillService = hsSkillService;
    }

    @PostMapping("/add")
    public ResponseEntity<HSSkill> addHSSkill (@RequestBody HSSkill hSSkill) {
        HSSkill newHSSkill = hsSkillService.addHSSkill(hSSkill);
        return new ResponseEntity<>(newHSSkill, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<HSSkill> updateHSSkill (@RequestBody HSSkill hSSkill) {
        HSSkill updateHSSkill = hsSkillService.updateHSSkill(hSSkill);
        return new ResponseEntity<>(updateHSSkill, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHSSkill(@PathVariable("id") Long id) {
        hsSkillService.deleteHSSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
