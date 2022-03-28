package com.portfolio.Persona.security.service;

import com.portfolio.Persona.security.entity.Rol;
import com.portfolio.Persona.security.enums.RolNombre;
import com.portfolio.Persona.security.repository.RolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepo rolRepo;

    public Optional<Rol> getbyRolNombre(RolNombre rolNombre) {
        return rolRepo.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        rolRepo.save(rol);
    }
}
