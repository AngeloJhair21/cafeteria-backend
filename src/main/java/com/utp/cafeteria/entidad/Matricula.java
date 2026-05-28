package com.utp.cafeteria.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "matriculas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreEstudiante;

    @Column(nullable = false)
    private String codigoEstudiante;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private String turno;
}
