package com.portfolio.Persona.service;

import com.portfolio.Persona.model.ExperienciaLaboral;
import com.portfolio.Persona.model.Proyecto;
import com.portfolio.Persona.repository.ExperienciaLaboralRepository;
import com.portfolio.Persona.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {
    private final ProyectoRepository proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepository proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }

    public Proyecto addProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public Proyecto updateProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }

    public void deleteProyecto(Long id){
        proyectoRepo.deleteProyectoById(id);
    }
}
