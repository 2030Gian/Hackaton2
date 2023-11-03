package com.example.manytomany.entities;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_curso", updatable = false, nullable = false)
    private UUID id_curso;

    @Column(name = "name", nullable = false, unique = false)
    private String name;

    @ManyToMany(mappedBy = "cursos")
    private List<Estudiante> estudiantes;

 
    public Curso(){};
    public Curso(String name){
        this.name = name;
    }

    public UUID getId(){
        return this.id_curso;
    } 

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}