package com.portfolio.Persona.security.controller;

import com.portfolio.Persona.dto.Mensaje;
import com.portfolio.Persona.security.dto.JwtDto;
import com.portfolio.Persona.security.dto.LoginUser;
import com.portfolio.Persona.security.dto.NuevoUser;
import com.portfolio.Persona.security.entity.Rol;
import com.portfolio.Persona.security.entity.User;
import com.portfolio.Persona.security.enums.RolNombre;
import com.portfolio.Persona.security.jwt.JwtProvider;
import com.portfolio.Persona.security.service.RolService;
import com.portfolio.Persona.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.MediaSize;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUser nuevoUser, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Campos mal puestos o email inválido"), HttpStatus.BAD_REQUEST);
        if (userService.existsByNombreUser(nuevoUser.getNombreUser()))
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        if (userService.existsByEmail(nuevoUser.getEmail()))
            return new ResponseEntity(new Mensaje("Ese email ya existe"), HttpStatus.BAD_REQUEST);
        User user =
                new User(nuevoUser.getNombre(), nuevoUser.getNombreUser(), nuevoUser.getEmail(),
                        passwordEncoder.encode(nuevoUser.getPassword()));
        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getbyRolNombre(RolNombre.ROLE_USER).get());
        if (nuevoUser.getRoles().contains("admin"))
            roles.add(rolService.getbyRolNombre(RolNombre.ROLE_ADMIN).get());
        user.setRoles(roles);
        userService.save(user);
        return new ResponseEntity(new Mensaje("Usuario guardado"), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUser loginUser, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Campos mal puestos"), HttpStatus.BAD_REQUEST);
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getNombreUser(), loginUser.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }
}
