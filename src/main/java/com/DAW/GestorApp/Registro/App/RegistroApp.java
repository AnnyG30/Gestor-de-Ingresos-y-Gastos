package com.DAW.GestorApp.Registro.App;

import com.DAW.GestorApp.Registro.Domain.Entities.RegistroEntity;
import com.DAW.GestorApp.Registro.Domain.Service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistroApp {

    @Autowired
    private RegistroService service;

    public List<RegistroEntity> listarRegistros() {
        return service.getAllRegistros();
    }

    public RegistroEntity guardarRegistro(RegistroEntity registro) {
        return service.guardarRegistro(registro);
    }

    public RegistroEntity buscarPorId(Long id) {
        return service.buscarPorId(id);
    }

    public void eliminarRegistro(Long id) {
        service.eliminarRegistro(id);
    }
}
