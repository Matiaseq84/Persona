package com.portfolio.Persona.security.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserPrincipal implements UserDetails {
    private String nombre;
    private String nombreUser;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public UserPrincipal(String nombre, String nombreUser, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUser = nombreUser;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public UserPrincipal() {}

    public static UserPrincipal build(User user) {
        List<GrantedAuthority> authorities =
                user.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol
                        .getRolNombre().name())).collect(Collectors.toList());
        return new UserPrincipal(user.getNombre(), user.getNombreUser(), user.getEmail(), user.getPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return nombreUser;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
