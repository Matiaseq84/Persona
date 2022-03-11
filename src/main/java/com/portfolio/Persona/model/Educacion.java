package com.portfolio.Persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String instituto;
    private String carrera;
    private boolean estado;
    private Date fechaInicio;
    private Date fechaFin;
    private String urlLogo;

    public Educacion(){};

    public Educacion(String instituto, String carrera, boolean estado, Date fechaInicio, Date fechaFin, String urlLogo) {
        this.instituto = instituto;
        this.carrera = carrera;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlLogo = urlLogo;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(){
        this.instituto = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(){
        this.carrera = carrera;
    }

    public boolean isEstado(){
        return estado;
    }

    public void setEstado(){
        this.estado = estado;
    }

    public Date getFechaInicio(){
        return fechaInicio;
    }

    public void setFechaInicio(){
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin(){
        return fechaFin;
    }

    public void setFechaFin(){
        this.fechaFin = fechaFin;
    }

    public String getUrlLogo(){
        return urlLogo;
    }

    public void setUrlLogo(){
        this.urlLogo = urlLogo;
    }

    @Override
    public String toString(){
        return "Educacion{" +
                "id=" + id +
                ", instituto='" + instituto + '\'' +
                ", carrera='" + carrera + '\'' +
                ", estado='" + estado + '\'' +
                ", fecha inicio='" + fechaInicio + '\'' +
                ", fecha fin='" + fechaFin + '\'' +
                ", url logo='" + urlLogo + '\'' +
                '}';
    }

}
