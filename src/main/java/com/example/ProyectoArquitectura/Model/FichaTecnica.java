package com.example.ProyectoArquitectura.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FichaTecnica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String duracion;
    private String modalidad;

    @OneToOne
    @JoinColumn(name = "curso_id", unique = true)
    private Curso curso;
}
