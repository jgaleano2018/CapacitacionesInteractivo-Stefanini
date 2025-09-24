package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.InsigniaEntity;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.SpringDataInsigniaRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Insignia;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.InsigniaRepository;

import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class JpaInsigniaAdapter implements InsigniaRepository {


	private final SpringDataInsigniaRepository jpaRepository;
	
	public JpaInsigniaAdapter(SpringDataInsigniaRepository jpa) {
		this.jpaRepository = jpa;
	}
	
	
	private Insignia toDomain(InsigniaEntity e) {
	return new Insignia(e.getId(), e.getNombre(), e.getDescripcion(), e.getIdTipoInsignia(), e.getImagenUrl());
	}
	
	
	private InsigniaEntity toEntity(Insignia d) {
		InsigniaEntity e = new InsigniaEntity();
		e.setId(d.getId());
		e.setNombre(d.getNombre());
		e.setDescripcion(d.getDescripcion());
		e.setIdTipoInsignia(d.getIdTipoInsignia());
		e.setImagenUrl(d.getImagenUrl());
		return e;
	}
	
	
	@Override
	public Insignia save(Insignia insignia) {
		InsigniaEntity entity = toEntity(insignia);
		InsigniaEntity saved = jpaRepository.save(entity);
		return toDomain(saved);
	}
	
	
	@Override
	public Optional<Insignia> findById(Integer id) {
		return jpaRepository.findById(id).map(this::toDomain);
	}
	
	
	@Override
	public List<Insignia> findAll() {
		return jpaRepository.findAll().stream().map(this::toDomain).collect(Collectors.toList());
	}
	
	
	@Override
	public void deleteById(Integer id) {
		jpaRepository.deleteById(id);
	}
}