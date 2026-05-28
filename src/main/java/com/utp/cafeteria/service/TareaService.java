package com.utp.cafeteria.service;

import com.utp.cafeteria.entidad.Tarea;
import com.utp.cafeteria.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> obtenerTodas() {
        return tareaRepository.findAll();
    }

    public Tarea registrar(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public Tarea actualizar(Long id, Tarea tareaDetalles) {
        Optional<Tarea> tareaExistente = tareaRepository.findById(id);
        if (tareaExistente.isPresent()) {
            Tarea tarea = tareaExistente.get();
            tarea.setTitulo(tareaDetalles.getTitulo());
            tarea.setCurso(tareaDetalles.getCurso());
            tarea.setFechaEntrega(tareaDetalles.getFechaEntrega());
            tarea.setEstado(tareaDetalles.getEstado());
            tarea.setPrioridad(tareaDetalles.getPrioridad());
            return tareaRepository.save(tarea);
        }
        return null;
    }

    public void eliminar(Long id) {
        tareaRepository.deleteById(id);
    }
}