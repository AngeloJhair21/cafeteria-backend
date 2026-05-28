package com.utp.cafeteria.service;

import com.utp.cafeteria.entidad.Incidencia;
import com.utp.cafeteria.repository.IncidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidenciaService {

    @Autowired
    private IncidenciaRepository incidenciaRepository;

    public List<Incidencia> obtenerTodas() {
        return incidenciaRepository.findAll();
    }

    public Incidencia registrar(Incidencia incidencia) {
        return incidenciaRepository.save(incidencia);
    }

    public Incidencia actualizarEstado(Long id, String estado) {
        Optional<Incidencia> incidenciaExistente = incidenciaRepository.findById(id);
        if (incidenciaExistente.isPresent()) {
            Incidencia incidencia = incidenciaExistente.get();
            incidencia.setEstado(estado);
            return incidenciaRepository.save(incidencia);
        }
        return null;
    }
}
