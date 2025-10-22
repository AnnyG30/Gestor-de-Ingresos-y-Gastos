package com.DAW.GestorApp.Repository;


import com.DAW.GestorApp.Model.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngresoRepository extends JpaRepository<Ingreso, Long> {
}
