package com.portfolio.Persona.repository;

import com.portfolio.Persona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
