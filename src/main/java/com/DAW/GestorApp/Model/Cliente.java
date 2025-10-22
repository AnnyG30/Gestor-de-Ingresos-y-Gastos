package com.DAW.GestorApp.Model;


import jakarta.persistence.*;

@Entity
@Table(name= "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    private String nombre;
    private String apellido;
    private String correo;
}
