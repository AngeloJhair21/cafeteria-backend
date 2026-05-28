package com.utp.cafeteria.controlador;

import com.utp.cafeteria.entidad.Incidencia;
import com.utp.cafeteria.service.IncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/incidencias")
@CrossOrigin(origins = "*")
public class IncidenciaController {

    @Autowired
    private IncidenciaService incidenciaService;

    @GetMapping
    public List<Incidencia> listar() {
        return incidenciaService.obtenerTodas();
    }

    @PostMapping
    public Incidencia registrar(@RequestBody Incidencia incidencia) {
        return incidenciaService.registrar(incidencia);
    }

    @PutMapping("/{id}/estado")
    public Incidencia actualizarEstado(@PathVariable Long id, @RequestBody Map<String, String> cuerpo) {
        return incidenciaService.actualizarEstado(id, cuerpo.get("estado"));
    }
}