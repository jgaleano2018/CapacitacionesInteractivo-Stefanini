package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.CursoEntity;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.SpringDataCursoRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Curso;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.CursoRepository;


public class JpaCursoAdapter implements CursoRepository {


	private final SpringDataCursoRepository jpa;
	
	public JpaCursoAdapter(SpringDataCursoRepository jpa) {
		this.jpa = jpa;
	}
	
	private Curso toDomain(CursoEntity e) {
		return new Curso(e.getIdCurso(), e.getIdCapacitacion(), e.getNombre(), e.getDescripcion(), e.getDuracion());
	}

	private CursoEntity toEntity(Curso c) {
		CursoEntity e = new CursoEntity();
		e.setIdCurso(c.getIdCurso());
		e.setIdCapacitacion(c.getIdCapacitacion());
		e.setNombre(c.getNombre());
		e.setDescripcion(c.getDescripcion());
		e.setDuracion(c.getDuracion());
		return e;
	}
	
	@Override
	public Curso save(Curso curso) {
		CursoEntity e = toEntity(curso);
		CursoEntity saved = jpa.save(e);
		return toDomain(saved);
	}
	
	
	@Override
	public Optional<Curso> findById(Integer id) {
		return jpa.findById(id).map(this::toDomain);
	}
	
	
	@Override
	public List<Curso> findAll() {
		return jpa.findAll().stream().map(this::toDomain).collect(Collectors.toList());
	}
	
	
	@Override
	public void deleteById(Integer id) {
		jpa.deleteById(id);
	}
}