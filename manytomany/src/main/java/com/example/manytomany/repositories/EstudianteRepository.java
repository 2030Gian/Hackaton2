package com.example.manytomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytomany.entities.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{

    
} 