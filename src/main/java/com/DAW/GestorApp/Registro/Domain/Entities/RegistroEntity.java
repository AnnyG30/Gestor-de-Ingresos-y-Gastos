package com.DAW.GestorApp.Registro.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class RegistroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_cliente;

    private String nombre;
    private String apellido;
    private String correo;
}
