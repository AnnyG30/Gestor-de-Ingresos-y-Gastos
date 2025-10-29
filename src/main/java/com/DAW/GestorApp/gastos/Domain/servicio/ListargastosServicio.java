package com.DAW.GestorApp.gastos.Domain.servicio;

import com.DAW.GestorApp.gastos.Domain.modelo.gasto;
import com.DAW.GestorApp.gastos.Domain.repositorio.GastoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListargastosServicio {
    
    private final GastoRepositorio gastoRepositorio;
    
    public ListargastosServicio(GastoRepositorio gastoRepositorio) {
        this.gastoRepositorio = gastoRepositorio;
    }
    
    public List<gasto> listarTodos() {
        return gastoRepositorio.listarTodos();
    }
}
