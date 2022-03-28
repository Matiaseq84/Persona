package com.portfolio.Persona.security.repository;

import com.portfolio.Persona.security.entity.User;
import org.hibernate.mapping.UnionSubclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByNombreUser(String nombreUsuario);
    boolean existsByNombreUser(String nombreUser);
    boolean existsByEmail(String email);
}
