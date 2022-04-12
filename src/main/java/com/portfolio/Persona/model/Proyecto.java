package com.portfolio.Persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Proyecto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int fecha;
    private String descripcion;
    private String urlProyecto;

    public Proyecto(){};

    public Proyecto(int fecha, String descripcion, String urlProyecto){
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
    };

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = this.id;
    }

    public int getFecha(){
        return fecha;
    }

    public void setFecha(){
        this.fecha = fecha;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(){
        this.descripcion = descripcion;
    }

    public String getUrlProyecto(){
        return urlProyecto;
    }

    public void setUrlProyecto(){
        this.urlProyecto = urlProyecto;
    }

    @Override
    public String toString(){
        return "ProyectoService{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url proyecto='" + urlProyecto + '\'' +
                '}';
    }
}
