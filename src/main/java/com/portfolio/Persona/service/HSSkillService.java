package com.portfolio.Persona.service;

import com.portfolio.Persona.model.ExperienciaLaboral;
import com.portfolio.Persona.model.HSSkill;
import com.portfolio.Persona.repository.ExperienciaLaboralRepository;
import com.portfolio.Persona.repository.HSSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class HSSkillService {
    private final HSSkillRepository hSSkillRepo;

    @Autowired
    public HSSkillService(HSSkillRepository hSSkillRepo) {
        this.hSSkillRepo = hSSkillRepo;
    }

    public HSSkill addHSSkill(HSSkill hsSkill) {
        return hSSkillRepo.save(hsSkill);
    }

    public List<HSSkill> findAllHsSkill(){
        return hSSkillRepo.findAll();
    }

    public HSSkill updateHSSkill(HSSkill hsSkill){
        return hSSkillRepo.save(hsSkill);
    }

    public void deleteHSSkill(Long id){
        hSSkillRepo.deleteHSSkillById(id);
    }
}
