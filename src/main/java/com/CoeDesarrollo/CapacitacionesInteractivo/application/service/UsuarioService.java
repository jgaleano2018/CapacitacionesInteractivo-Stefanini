package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import org.springframework.stereotype.Service;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Usuario;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.UsuarioRepository;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService {


	private final UsuarioRepository usuarioRepository;
	
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
	this.usuarioRepository = usuarioRepository;
	}
	
	
	public Usuario createUsuario(Usuario usuario) {
	// You can add validation, hashing password, business rules here
	return usuarioRepository.save(usuario);
	}
	
	
	public Optional<Usuario> getUsuario(Integer id) {
	return usuarioRepository.findById(id);
	}
	
	
	public List<Usuario> getAll() {
	return usuarioRepository.findAll();
	}
	
	
	public Usuario updateUsuario(Integer id, Usuario usuario) {
	usuario.setId(id);
	return usuarioRepository.save(usuario);
	}
	
	
	public void deleteUsuario(Integer id) {
	usuarioRepository.deleteById(id);
	}
}