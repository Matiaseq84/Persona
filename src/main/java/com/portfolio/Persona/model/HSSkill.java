package com.portfolio.Persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class HSSkill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreSkill;
    private Character tipoSkill;
    private int porcentaje;

    public HSSkill(){};

    public HSSkill(String nombreSkill, Character tipoSkill, int porcentaje){
        this.nombreSkill = nombreSkill;
        this.tipoSkill = tipoSkill;
        this.porcentaje = porcentaje;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = this.id;
    }

    public String getNombreSkill(){
        return nombreSkill;
    }

    public void setNombreSkill(){
        this.nombreSkill = nombreSkill;
    }

    public Character getTipoSkill(){
        return tipoSkill;
    }

    public void setTipoSkill(){
        this.tipoSkill = tipoSkill;
    }

    public int getPorcentaje(){
        return porcentaje;
    }

    public void setPorcentaje(){
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString(){
        return "HSSkill{" +
                "id=" + id +
                ", nombre ='" + nombreSkill + '\'' +
                ", tipo='" + tipoSkill + '\'' +
                ", porcentaje='" + porcentaje + '\'' +
                '}';
    }

}
