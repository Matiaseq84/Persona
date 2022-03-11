package com.portfolio.Persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date fecha;
    private String descripcion;
    private String urlProyecto;

    public Proyecto(){};

    public Proyecto(Date fecha, String descripcion, String urlProyecto){
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
    };

    public Date getFecha(){
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
        return "Proyecto{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url proyecto='" + urlProyecto + '\'' +
                '}';
    }
}
