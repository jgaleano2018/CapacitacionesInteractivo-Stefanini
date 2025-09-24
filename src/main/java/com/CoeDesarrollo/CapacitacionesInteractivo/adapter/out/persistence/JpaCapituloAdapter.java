package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence;


import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.CapituloEntity;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.SpringDataCapituloRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Capitulo;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.CapitulosRepository;

import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaCapituloAdapter implements CapitulosRepository {


	private final SpringDataCapituloRepository jpaRepo;
	
	
	public JpaCapituloAdapter(SpringDataCapituloRepository jpaRepo) {
	this.jpaRepo = jpaRepo;
	}
	
	
	@Override
	public Capitulo save(Capitulo capitulo) {
	CapituloEntity entity = toEntity(capitulo);
	CapituloEntity saved = jpaRepo.save(entity);
	return toDomain(saved);
	}
	
	
	@Override
	public Optional<Capitulo> findById(Integer id) {
	return jpaRepo.findById(id).map(this::toDomain);
	}
	
	
	@Override
	public List<Capitulo> findAll() {
		return jpaRepo.findAll().stream().map(this::toDomain).collect(Collectors.toList());
	}
	
	@Override
	public void deleteById(Integer id) {
	jpaRepo.deleteById(id);
	}
	
	
	private CapituloEntity toEntity(Capitulo domain) {
	CapituloEntity e = new CapituloEntity();
	e.setIdCapitulo(domain.getId());
	e.setIdModulo(domain.getIdModulo());
	e.setTitulo(domain.getTitulo());
	e.setContenido(domain.getContenido());
	e.setOrden(domain.getOrden());
	return e;
	}
	
	
	private Capitulo toDomain(CapituloEntity e) {
	return new Capitulo(e.getIdCapitulo(), e.getIdModulo(), e.getTitulo(), e.getContenido(), e.getOrden());
	}
}