package com.example.lab3_20202396.Models.Entities;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Entity
@Table(name = "receta")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreceta", nullable = false)
    private int idReceta;

    @ManyToOne
    @JoinColumn(name = "idcategoria", nullable = false)
    private Categoria categoria;

    @Column (name = "nombre", length = 200)
    private String nombreReceta;

    @Column (name = "instrucciones")
    private String instruccionReceta;

    @Column (name = "dificultad")
    private int dificultadReceta;

    @Column (name = "tiempo_preparacion")
    private Time tiempoPreparacion;

}
