package com.portfolio.Persona.repository;

import com.portfolio.Persona.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    void deleteEducacionById(Long id);
}
