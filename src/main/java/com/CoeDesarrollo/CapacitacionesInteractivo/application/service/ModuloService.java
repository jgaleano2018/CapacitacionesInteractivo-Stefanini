package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Modulo;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.ModuloRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloService {

    private final ModuloRepository repository;

    public ModuloService(ModuloRepository repository) {
        this.repository = repository;
    }

    public Modulo create(Modulo modulo) {
        return repository.save(modulo);
    }

    public Modulo update(Integer id, Modulo updated) {
    	Optional<Modulo> existing = repository.findById(id);
    	if (existing.isEmpty()) throw new IllegalArgumentException("Curso not found: " + id);
    	Modulo m = existing.get();
        m.setNombre(updated.getNombre());
        m.setDescripcion(updated.getDescripcion());
        m.setOrden(updated.getOrden());
        m.setIdCurso(updated.getIdCurso());
        return repository.save(m);
    }

    public Optional<Modulo> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Modulo> findAll() {
        return repository.findAll();
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    /*public List<Modulo> findByCurso(Integer idCurso) {
        return repository.findByCursoId(idCurso);
    }*/
}