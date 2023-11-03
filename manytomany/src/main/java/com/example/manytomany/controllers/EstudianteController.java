package com.example.manytomany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.manytomany.entities.Estudiante;
import com.example.manytomany.repositories.EstudianteRepository;

public class EstudianteController {
    @Autowired
    EstudianteRepository estudianteRepository;

    @GetMapping("/estudiantes")
    public ResponseEntity<List<Estudiante>> getEstudiantes(){
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(estudiantes);
    }

    @PostMapping("/estudiantes")
    public ResponseEntity<String> addEstudiante(@RequestBody Estudiante estudiante){
        estudianteRepository.save(estudiante);
        return ResponseEntity.status(HttpStatus.CREATED).body("Estudiante Creado");
    }

    

    
}