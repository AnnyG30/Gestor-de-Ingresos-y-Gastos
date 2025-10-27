package com.DAW.GestorApp.gastos.interfaces.controlador;

import com.DAW.GestorApp.gastos.Domain.modelo.gasto;
import com.DAW.GestorApp.gastos.Domain.servicio.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gastos")
public class GastoControlador {
    private final ListargastosServicio listargastosServicio;
    private final obtenerGastoServicio obtenerGastoServicio;
    private final Registrogastoservicio registrogastoservicio;
    private final EliminarGastoServicio eliminarGastoServicio;

    public GastoControlador(ListargastosServicio listargastosServicio,
                           obtenerGastoServicio obtenerGastoServicio,
                           Registrogastoservicio registrogastoservicio,
                           EliminarGastoServicio eliminarGastoServicio) {
        this.listargastosServicio = listargastosServicio;
        this.obtenerGastoServicio = obtenerGastoServicio;
        this.registrogastoservicio = registrogastoservicio;
        this.eliminarGastoServicio = eliminarGastoServicio;
    }

    @GetMapping
    public List<gasto> getAllGastos() {
        return listargastosServicio.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<gasto> getGastoById(@PathVariable Long id) {
        return obtenerGastoServicio.obtenerPorId(id);
    }

    @PostMapping
    public gasto createGasto(@RequestBody gasto gasto) {
        return registrogastoservicio.registrar(gasto);
    }

    @PutMapping("/{id}")
    public gasto updateGasto(@PathVariable Long id, @RequestBody gasto gasto) {

        return registrogastoservicio.actualizar(id, gasto);
    }

    @DeleteMapping("/{id}")
    public void deleteGasto(@PathVariable Long id) {
        eliminarGastoServicio.eliminar(id);
    }
}
