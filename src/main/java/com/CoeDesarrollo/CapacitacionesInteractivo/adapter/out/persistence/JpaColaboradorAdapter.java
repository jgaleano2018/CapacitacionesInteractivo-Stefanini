package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.ColaboradorJpaEntity;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.SpringDataColaboradorRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Colaborador;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.ColaboradorRepository;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaColaboradorAdapter implements ColaboradorRepository {


	private final SpringDataColaboradorRepository jpaRepo;
	
	
	public JpaColaboradorAdapter(SpringDataColaboradorRepository jpaRepo) {
		this.jpaRepo = jpaRepo;
	}
	
	
	private Colaborador toDomain(ColaboradorJpaEntity e) {
		if (e == null) return null;
		return new Colaborador(e.getIdColaborador(), e.getNombre(), e.getEmail(), e.getCargo(), e.getFechaIngreso());
	}
	
	
	private ColaboradorJpaEntity toEntity(Colaborador d) {
		ColaboradorJpaEntity e = new ColaboradorJpaEntity();
		e.setIdColaborador(d.getIdColaborador());
		e.setNombre(d.getNombre());
		e.setEmail(d.getEmail());
		e.setCargo(d.getCargo());
		e.setFechaIngreso(d.getFechaIngreso());
		return e;
	}
	
	
	@Override
	public Colaborador save(Colaborador c) {
		ColaboradorJpaEntity e = toEntity(c);
		ColaboradorJpaEntity saved = jpaRepo.save(e);
		return toDomain(saved);
	}
	
	
	@Override
	public Optional<Colaborador> findById(Integer id) {
		return jpaRepo.findById(id).map(this::toDomain);
	}
	
	
	@Override
	public List<Colaborador> findAll() {
		return jpaRepo.findAll().stream().map(this::toDomain).collect(Collectors.toList());
	}
	
	
	@Override
	public void deleteById(Integer id) {
		jpaRepo.deleteById(id);
	}
	
	
	@Override
	public Optional<Colaborador> findByEmail(String email) {
		return jpaRepo.findByEmail(email).map(this::toDomain);
	}
}