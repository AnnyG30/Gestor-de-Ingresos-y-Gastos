package com.DAW.GestorApp.Service;

import com.DAW.GestorApp.Model.Ingreso;
import com.DAW.GestorApp.Repository.IngresoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IngresoService {

    private final IngresoRepository ingresoRepository;

    public  IngresoService(IngresoRepository ingresoRepository) {
      this.ingresoRepository = ingresoRepository;
    }

    public List<Ingreso> Listar() {
        return ingresoRepository.findAll();
    }


    public Ingreso guardar(Ingreso ingreso){
        return ingresoRepository.save(ingreso);
    }

    public void eliminar(Long id){
        ingresoRepository.deleteById(id);
    }
}
