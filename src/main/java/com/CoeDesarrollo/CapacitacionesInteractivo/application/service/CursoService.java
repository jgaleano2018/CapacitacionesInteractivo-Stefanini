package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Curso;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CursoService {


	private final CursoRepository repository;
	
	public CursoService(CursoRepository repository) {
		this.repository = repository;
	}
	


	public Curso create(Curso curso) {
	return repository.save(curso);
	}
	
	
	public Optional<Curso> findById(Integer id) {
	return repository.findById(id);
	}
	
	
	public List<Curso> findAll() {
	return repository.findAll();
	}
	
	
	public Curso update(Integer id, Curso updated) {
		Optional<Curso> existing = repository.findById(id);
		if (existing.isEmpty()) throw new IllegalArgumentException("Curso not found: " + id);
		Curso e = existing.get();
		e.setNombre(updated.getNombre());
		e.setDescripcion(updated.getDescripcion());
		e.setDuracion(updated.getDuracion());
		e.setIdCapacitacion(updated.getIdCapacitacion());
		return repository.save(e);
	}
	
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}