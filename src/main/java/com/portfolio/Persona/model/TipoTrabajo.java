package com.portfolio.Persona.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TipoTrabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreTipo;

    public TipoTrabajo(){};

    public TipoTrabajo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(){
        this.nombreTipo = nombreTipo;
    }

    @Override
    public String toString(){
        return "TipoTrabajoRepository{" +
                "id=" + id +
                ", nombre='" + nombreTipo + '\'' +
                '}';
    }

    @OneToMany(targetEntity = ExperienciaLaboral.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "te_fk", referencedColumnName = "id")
    private List<ExperienciaLaboral> empleos;

}
