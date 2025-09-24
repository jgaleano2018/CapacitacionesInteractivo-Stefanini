package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence;


import org.springframework.stereotype.Component;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.UsuarioEntity;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.SpringDataUsuarioRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Usuario;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.UsuarioRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class JpaUsuarioAdapter implements UsuarioRepository {


	private final SpringDataUsuarioRepository jpaRepo;
	
	
	public JpaUsuarioAdapter(SpringDataUsuarioRepository jpaRepo) {
	this.jpaRepo = jpaRepo;
	}
	
	
	private Usuario toDomain(UsuarioEntity e) {
	return new Usuario(e.getId(), e.getNombre(), e.getPassword(), e.getEstado());
	}
	
	
	private UsuarioEntity toEntity(Usuario u) {
	return new UsuarioEntity(u.getId(), u.getNombre(), u.getPassword(), u.getEstado());
	}
	
	
	@Override
	public Usuario save(Usuario usuario) {
	UsuarioEntity entity = toEntity(usuario);
	UsuarioEntity saved = jpaRepo.save(entity);
	return toDomain(saved);
	}
	
	
	@Override
	public Optional<Usuario> findById(Integer id) {
	return jpaRepo.findById(id).map(this::toDomain);
	}
	
	
	@Override
	public List<Usuario> findAll() {
	return jpaRepo.findAll().stream().map(this::toDomain).collect(Collectors.toList());
	}
	
	
	@Override
	public void deleteById(Integer id) {
	jpaRepo.deleteById(id);
	}
}