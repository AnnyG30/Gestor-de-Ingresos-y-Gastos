package com.DAW.GestorApp.Registro.Domain.Service;

import com.DAW.GestorApp.Registro.App.RegistroApp;
import com.DAW.GestorApp.Registro.Domain.Entities.RegistroEntity;
import com.DAW.GestorApp.Registro.Domain.Repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {
    @Autowired
    private RegistroRepository repo;

    public List<RegistroEntity> getAllRegistros(){
        return repo.findAll();
    }

    public RegistroEntity guardarRegistro(RegistroEntity registro) {
        return repo.save(registro);
    }

    public RegistroEntity buscarPorId(Long id){
        return repo.findById(id).orElse(null);
    }

    public void eliminarRegistro(Long id){
        repo.deleteById(id);
    }
}
