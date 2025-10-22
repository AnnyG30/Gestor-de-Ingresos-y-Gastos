package com.DAW.GestorApp.Controller;

import com.DAW.GestorApp.Model.Ingreso;
import com.DAW.GestorApp.Service.IngresoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingresos")
@CrossOrigin(origins = "*")
public class IngresoController {

    private final IngresoService ingresoService;

    public IngresoController(IngresoService ingresoService) {
        this.ingresoService = ingresoService;
    }

    @GetMapping
    public List<Ingreso> listar(){
        return ingresoService.Listar();
    }

    @PostMapping
    public Ingreso guardar(@RequestBody Ingreso ingreso){
        return ingresoService.guardar(ingreso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ingresoService.eliminar(id);
    }
}
