package com.portfolio.Persona.security.service;

import com.portfolio.Persona.security.entity.User;
import com.portfolio.Persona.security.entity.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserService userService;
    @Override
    public UserDetails loadUserByUsername(String nombreUser) throws UsernameNotFoundException {
        User user = userService.getByNombreUser(nombreUser).get();
        return UserPrincipal.build(user);
    }
}
