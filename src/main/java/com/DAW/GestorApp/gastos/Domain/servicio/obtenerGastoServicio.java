package com.DAW.GestorApp.gastos.Domain.servicio;

import com.DAW.GestorApp.gastos.Domain.modelo.gasto;
import com.DAW.GestorApp.gastos.Domain.repositorio.GastoRepositorio;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class obtenerGastoServicio {
    
    private final GastoRepositorio gastoRepositorio;
    
    public obtenerGastoServicio(GastoRepositorio gastoRepositorio) {
        this.gastoRepositorio = gastoRepositorio;
    }
    
    public Optional<gasto> obtenerPorId(Long id) {
        return gastoRepositorio.buscarPorId(id);
    }
}
