package com.example.manytomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.manytomany.entities.Curso;
public interface CursoRepository  extends JpaRepository<Curso, Long>{

    
}
