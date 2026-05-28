package com.utp.cafeteria.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tareas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private LocalDate fechaEntrega;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String prioridad;
}