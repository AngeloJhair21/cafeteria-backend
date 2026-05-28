package com.utp.cafeteria.controlador;

import com.utp.cafeteria.entidad.Matricula;
import com.utp.cafeteria.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/matriculas")
@CrossOrigin(origins = "*")
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @PostMapping
    public Matricula registrar(@RequestBody Matricula matricula) {
        return matriculaService.registrar(matricula);
    }
}
