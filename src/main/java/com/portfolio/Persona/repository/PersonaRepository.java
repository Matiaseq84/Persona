package com.portfolio.Persona.repository;

import com.portfolio.Persona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    void deletePersonaById(Long id);

    Optional<Persona> findPersonaById(Long id);
}
