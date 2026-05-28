package com.utp.cafeteria.controlador;

import com.utp.cafeteria.entidad.Tarea;
import com.utp.cafeteria.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin(origins = "*")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> listar() {
        return tareaService.obtenerTodas();
    }

    @PostMapping
    public Tarea registrar(@RequestBody Tarea tarea) {
        return tareaService.registrar(tarea);
    }

    @PutMapping("/{id}")
    public Tarea actualizar(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.actualizar(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        tareaService.eliminar(id);
    }
}