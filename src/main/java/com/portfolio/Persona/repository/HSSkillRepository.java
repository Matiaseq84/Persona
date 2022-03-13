package com.portfolio.Persona.repository;

import com.portfolio.Persona.model.HSSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HSSkillRepository extends JpaRepository<HSSkill,Long> {
    void deleteHSSkillById(Long id);
}
