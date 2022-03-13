package com.portfolio.Persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ExperienciaLaboral implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEmpresa;
    private boolean esTrabajoActual;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;

    public ExperienciaLaboral(){

    }
    public ExperienciaLaboral(String nombreEmpresa, boolean esTrabajoActual, Date fechaInicio, Date fechaFin, String descripcion){
        this.nombreEmpresa = nombreEmpresa;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
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

    public Date getFechaInicio(){
        return fechaInicio;
    }

    public Date getFechaFin(){
        return fechaFin;
    }

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
                ", fecha inicio='" + fechaInicio + '\'' +
                ", fecha fin='" + fechaFin + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
