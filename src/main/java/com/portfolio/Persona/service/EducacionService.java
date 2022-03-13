package com.portfolio.Persona.service;

import com.portfolio.Persona.model.Educacion;
import com.portfolio.Persona.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {

    private final EducacionRepository eduRepo;

    @Autowired
    public EducacionService(EducacionRepository eduRepo) {
        this.eduRepo = eduRepo;
    }

    public Educacion addEducacion(Educacion educacion){
        return eduRepo.save(educacion);
    }

    public Educacion updateEducacion(Educacion educacion){
        return eduRepo.save(educacion);
    }

    public void deleteEducacion(Long id){
        eduRepo.deleteEducacionById(id);
    }
}
