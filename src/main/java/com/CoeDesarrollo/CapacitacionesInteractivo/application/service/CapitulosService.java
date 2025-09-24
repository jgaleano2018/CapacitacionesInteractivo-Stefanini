package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Capitulo;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.CapitulosRepository;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class CapitulosService {


	private final CapitulosRepository repository;

    public CapitulosService(CapitulosRepository repository) {
        this.repository = repository;
    }

    public Capitulo create(Capitulo capitulo) {
        return repository.save(capitulo);
    }
    
    public Capitulo update(Integer id, Capitulo input) {
    	Optional<Capitulo> existing = repository.findById(id);
		if (existing.isEmpty()) throw new RuntimeException("Capitulo not found: " + id);
		Capitulo e = existing.get();
    	e.setTitulo(input.getTitulo());
    	e.setContenido(input.getContenido());
    	e.setOrden(input.getOrden());
    	e.setIdModulo(input.getIdModulo());
    	return repository.save(e);
    	}

    public List<Capitulo> getAll() {
        return repository.findAll();
    }

    public Optional<Capitulo> getById(Integer id) {
        return repository.findById(id);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
