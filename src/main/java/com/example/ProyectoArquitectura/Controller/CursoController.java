package com.example.ProyectoArquitectura.Controller;

import com.example.ProyectoArquitectura.Model.Curso;
import com.example.ProyectoArquitectura.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/listar")
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @PostMapping("/guardar")
    public Curso guardarCurso(@RequestBody Curso curso) {
        return cursoService.guardarCurso(curso);
    }
}