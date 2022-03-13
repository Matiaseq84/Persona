package com.portfolio.Persona.service;

import com.portfolio.Persona.model.Educacion;
import com.portfolio.Persona.model.ExperienciaLaboral;
import com.portfolio.Persona.repository.ExperienciaLaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService {

    private final ExperienciaLaboralRepository expLaboralRepo;

    @Autowired
    public ExperienciaLaboralService(ExperienciaLaboralRepository expLaboralRepo) {
        this.expLaboralRepo = expLaboralRepo;
    }

    public ExperienciaLaboral addExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        return expLaboralRepo.save(experienciaLaboral);
    }

    public ExperienciaLaboral updateExperienciaLaboral(ExperienciaLaboral experienciaLaboral){
        return expLaboralRepo.save(experienciaLaboral);
    }

    public void deleteExperienciaLaboral(Long id){
        expLaboralRepo.deleteExperienciaLaboralById(id);
    }
}
