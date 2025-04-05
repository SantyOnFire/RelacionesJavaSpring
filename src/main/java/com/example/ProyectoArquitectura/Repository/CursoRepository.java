package com.example.ProyectoArquitectura.Repository;

import com.example.ProyectoArquitectura.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}