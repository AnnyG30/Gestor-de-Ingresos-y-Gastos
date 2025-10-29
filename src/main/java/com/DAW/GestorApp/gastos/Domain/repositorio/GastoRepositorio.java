package com.DAW.GestorApp.gastos.Domain.repositorio;

import com.DAW.GestorApp.gastos.Domain.modelo.gasto;
import java.util.List;
import java.util.Optional;

public interface GastoRepositorio {
    gasto guardar(gasto gasto);
    Optional<gasto> buscarPorId(Long id);
    List<gasto> listarTodos();
    void eliminar(Long id);
}
