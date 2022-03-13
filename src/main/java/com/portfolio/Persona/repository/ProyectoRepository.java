package com.portfolio.Persona.repository;

import com.portfolio.Persona.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto,Long> {
    void deleteProyectoById(Long id);
}
