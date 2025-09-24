package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Capacitacion;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.CapacitacionRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class CapacitacionService {


	private final CapacitacionRepository repository;
	
	
	public CapacitacionService(CapacitacionRepository repository) {
		this.repository = repository;
	}
	
	
	public Capacitacion create(Capacitacion c) {
		return repository.save(c);
	}
	
	
	public Optional<Capacitacion> findById(Integer id) {
		return repository.findById(id);
	}
	
	
	public List<Capacitacion> findAll() {
		return repository.findAll();
	}
	
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	
	public Capacitacion update(Integer id, Capacitacion updated) {
		Optional<Capacitacion> existing = repository.findById(id);
		if (existing.isEmpty()) throw new RuntimeException("Capacitacion not found: " + id);
		Capacitacion e = existing.get();
		e.setNombre(updated.getNombre());
		e.setDescripcion(updated.getDescripcion());
		e.setFechaInicio(updated.getFechaInicio());
		e.setFechaFin(updated.getFechaFin());
		return repository.save(e);
	}
}