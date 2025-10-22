package com.DAW.GestorApp.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ingresos")
public class Ingreso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ingreso;

    private LocalDateTime fecha_ingreso;
    private String categoria;
    private Double monto;
    private String descripcion;

}
