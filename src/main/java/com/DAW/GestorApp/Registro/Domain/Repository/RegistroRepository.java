package com.DAW.GestorApp.Registro.Domain.Repository;

import com.DAW.GestorApp.Registro.App.RegistroApp;
import com.DAW.GestorApp.Registro.Domain.Entities.RegistroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<RegistroEntity, Long> {}

