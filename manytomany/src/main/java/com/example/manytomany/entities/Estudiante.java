package com.example.manytomany.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
import java.util.UUID;
import java.util.List;


@Entity
@Table(name="estudiantes")
public class Estudiante{

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_estudiante", updatable = false, nullable = false)
    private UUID id_estudiante;

    @Column(name = "name", nullable = false, unique = false)
    private String name;

    @ManyToMany
    @JoinTable(
        name = "estudiante_curso", joinColumns = @JoinColumn(name = "estudiante_id", referencedColumnName = "id_estudiante"),
        inverseJoinColumns = @JoinColumn(name = "curso_id", referencedColumnName = "id_curso")
    )
    private List<Curso> cursos;


    public Estudiante(){};
    public Estudiante(String name){
        this.name = name;
    };


    public UUID getId(){
        return this.id_estudiante;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



}