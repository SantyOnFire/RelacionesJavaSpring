package com.example.ProyectoArquitectura.Service;

import com.example.ProyectoArquitectura.Model.Profesor;
import com.example.ProyectoArquitectura.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    public ProfesorRepository ProfesorRepository;

    public Profesor guardar(Profesor profesor){
        return ProfesorRepository.save(profesor);
    }

    public List<Profesor> listar(){
        return ProfesorRepository.findAll();
    }



}