package com.DAW.GestorApp.Registro.Infraestructura.Controller;

import com.DAW.GestorApp.Registro.Domain.Entities.RegistroEntity;
import com.DAW.GestorApp.Registro.Domain.Service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private RegistroService service;

    @GetMapping
    public List<RegistroEntity> listarRegistros() {
        return service.getAllRegistros();
    }

    @PostMapping
    public RegistroEntity crearRegistro(@RequestBody RegistroEntity registro) {
        return service.guardarRegistro(registro);
    }

    @DeleteMapping("/{id}")
    public void eliminarRegistro(@PathVariable Long id) {
        service.eliminarRegistro(id);
    }
}
