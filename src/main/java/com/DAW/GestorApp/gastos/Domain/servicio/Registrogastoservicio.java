package com.DAW.GestorApp.gastos.Domain.servicio;

import com.DAW.GestorApp.gastos.Domain.modelo.gasto;
import com.DAW.GestorApp.gastos.Domain.repositorio.GastoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class Registrogastoservicio {
    
    private final GastoRepositorio gastoRepositorio;
    
    public Registrogastoservicio(GastoRepositorio gastoRepositorio) {
        this.gastoRepositorio = gastoRepositorio;
    }
    
    public gasto registrar(gasto gasto) {
        return gastoRepositorio.guardar(gasto);
    }
    
    public gasto actualizar(Long id, gasto gasto) {
        gasto.setId(id);
        return gastoRepositorio.guardar(gasto);
    }
}
