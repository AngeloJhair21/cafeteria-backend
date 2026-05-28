package com.utp.cafeteria.service;

import com.utp.cafeteria.entidad.Matricula;
import com.utp.cafeteria.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // <-- Faltaba importar las Listas

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;


    public List<Matricula> obtenerTodos() {
        return matriculaRepository.findAll();
    }


    public Matricula guardar(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }
}
