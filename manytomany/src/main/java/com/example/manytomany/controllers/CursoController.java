package com.example.manytomany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.manytomany.entities.Curso;
import com.example.manytomany.repositories.CursoRepository;

public class CursoController {
    @Autowired
    CursoRepository cursoRepository;

    @GetMapping("/cursos")
    public ResponseEntity<List<Curso>> getCursos(){
        List<Curso> cursos = cursoRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(cursos);
    }

    @PostMapping
    public ResponseEntity<String> addCurso(@RequestBody Curso curso){
        cursoRepository.save(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body("Curso creado");
    }

    
}
