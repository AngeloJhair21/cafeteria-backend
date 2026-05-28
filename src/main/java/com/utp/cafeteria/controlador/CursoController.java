package com.utp.cafeteria.controlador;

import com.utp.cafeteria.entidad.Curso;
import com.utp.cafeteria.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cursos")
@CrossOrigin(origins = "*")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> listar() {
        return cursoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Curso> obtenerPorId(@PathVariable Long id) {
        return cursoService.obtenerPorId(id);
    }
}