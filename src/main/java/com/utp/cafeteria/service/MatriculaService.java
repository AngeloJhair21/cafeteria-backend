package com.utp.cafeteria.service;

import com.utp.cafeteria.entidad.Matricula;
import com.utp.cafeteria.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    public Matricula registrar(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }
}
