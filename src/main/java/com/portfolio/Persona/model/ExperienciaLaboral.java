package com.portfolio.Persona.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ExperienciaLaboral implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombreEmpresa;
    private boolean esTrabajoActual;
    private String puesto;
    private int fechaInicio;
    private int fechaFin;
    private String descripcion;



    public ExperienciaLaboral(){

    }
    public ExperienciaLaboral(String nombreEmpresa, boolean esTrabajoActual, String puesto, int fechaInicio, int fechaFin, String descripcion){
        this.nombreEmpresa = nombreEmpresa;
        this.esTrabajoActual = esTrabajoActual;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;


    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = this.id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(){
        this.nombreEmpresa = nombreEmpresa;
    }

    public boolean isEsTrabajoActual(){
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(){
        this.esTrabajoActual = esTrabajoActual;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(){
        this.puesto = puesto;
    }

    public int getFechaInicio(){
        return fechaInicio;
    }

    public void setFechaInicio() {this.fechaInicio = fechaInicio;}

    public int getFechaFin(){
        return fechaFin;
    }

    public void setFechaFin() {this.fechaFin = fechaFin;}

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(){
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return "ExperienciaLaboral{" +
                "id=" + id +
                ", nombre='" + nombreEmpresa + '\'' +
                ", trabajo actual='" + esTrabajoActual  + '\'' +
                ", puesto='" + puesto  + '\'' +
                ", fecha inicio='" + fechaInicio + '\'' +
                ", fecha fin='" + fechaFin + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }





}
