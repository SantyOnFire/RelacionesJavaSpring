package com.example.ProyectoArquitectura.Repository;

import com.example.ProyectoArquitectura.Model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}