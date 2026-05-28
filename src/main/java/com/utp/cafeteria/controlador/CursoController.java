package com.utp.cafeteria.controlador;

import com.utp.cafeteria.entidad.Curso;
import com.utp.cafeteria.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping
    public Curso registrarCurso(@RequestBody Curso curso) {
        return cursoService.guardar(curso);
    }
}