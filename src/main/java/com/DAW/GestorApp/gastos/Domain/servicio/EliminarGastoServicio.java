package com.DAW.GestorApp.gastos.Domain.servicio;

import com.DAW.GestorApp.gastos.Domain.repositorio.GastoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class EliminarGastoServicio {
    
    private final GastoRepositorio gastoRepositorio;
    
    public EliminarGastoServicio(GastoRepositorio gastoRepositorio) {
        this.gastoRepositorio = gastoRepositorio;
    }
    
    public void eliminar(Long id) {
        gastoRepositorio.eliminar(id);
    }
}
