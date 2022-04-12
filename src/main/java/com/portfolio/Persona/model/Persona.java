package com.portfolio.Persona.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String sobreMi;
    private String urlImagen;

    public Persona(){}

    public Persona(String nombre, String apellido, String telefono, String correo, String sobreMi, String urlImagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.sobreMi = sobreMi;
        this.urlImagen = urlImagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre() {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido() {
        this.apellido = apellido;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(){
        this.telefono = telefono;
    }
     public String getCorreo(){
        return correo;
     }

     public void setCorreo(){
        this.correo = correo;
     }

     public String getSobreMi() {
        return sobreMi;
     }

     public void setSobreMi(){
        this.sobreMi = sobreMi;
     }

     public String getUrlImagen() {
       return urlImagen;
     }
     public void setUrlImagen(){
        this.urlImagen = urlImagen;
     }

     @Override
     public String toString(){
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", sobreMi='" + sobreMi + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                '}';
     }


     @OneToMany(targetEntity = ExperienciaLaboral.class, cascade = CascadeType.ALL)
     @JoinColumn(name = "pe_fk", referencedColumnName = "id")
     private Set<ExperienciaLaboral> empleos = new HashSet<>();

    @OneToMany(targetEntity = Educacion.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pe_fk", referencedColumnName = "id")
    private List<Educacion> educacion;

    @OneToMany(targetEntity = HSSkill.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ph_fk", referencedColumnName = "id")
    private List<HSSkill> hsSkills;

    @OneToMany(targetEntity = Proyecto.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pp_fk", referencedColumnName = "id")
    private List<Proyecto> proyectos;

}
