package com.utp.cafeteria.controlador;

import com.utp.cafeteria.entidad.Matricula;
import com.utp.cafeteria.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
@CrossOrigin(origins = "*") // <-- El pase VIP para Angular
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    // Método para enviar las matrículas a la tabla de la web
    @GetMapping
    public List<Matricula> listar() {
        return matriculaService.obtenerTodos();
    }

    // Método para recibir y guardar la nueva matrícula desde la web
    @PostMapping
    public Matricula registrarMatricula(@RequestBody Matricula matricula) {
        return matriculaService.guardar(matricula);
    }
}
