package com.DAW.GestorApp.gastos.infraestructure.persistencia.Repositorio;

import com.DAW.GestorApp.gastos.Domain.modelo.gasto;
import com.DAW.GestorApp.gastos.Domain.repositorio.GastoRepositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GastoJpaSpringData extends JpaRepository<gasto, Long>, GastoRepositorio {
    
    @Override
    default gasto guardar(gasto gasto) {
        return save(gasto);
    }
    
    @Override
    default Optional<gasto> buscarPorId(Long id) {
        return findById(id);
    }
    
    @Override
    default List<gasto> listarTodos() {
        return findAll();
    }
    
    @Override
    default void eliminar(Long id) {
        deleteById(id);
    }
}
