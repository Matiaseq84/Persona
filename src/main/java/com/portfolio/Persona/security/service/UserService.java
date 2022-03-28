package com.portfolio.Persona.security.service;

import com.portfolio.Persona.security.entity.User;
import com.portfolio.Persona.security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Struct;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepo userRepo;

    public Optional<User> getByNombreUser(String nombreUser){
        return userRepo.findByNombreUser(nombreUser);
    }

    public boolean existsByNombreUser(String nombreUser) {
        return userRepo.existsByNombreUser(nombreUser);
    }

    public boolean existsByEmail(String email) {
        return userRepo.existsByEmail(email);
    }

    public void save(User user){
        userRepo.save(user);
    }

}
