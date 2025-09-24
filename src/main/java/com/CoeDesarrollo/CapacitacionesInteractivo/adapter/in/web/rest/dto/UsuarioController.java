package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.UsuarioService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Usuario;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {


	private final UsuarioService usuarioService;
	
	
	public UsuarioController(UsuarioService usuarioService) {
	this.usuarioService = usuarioService;
	}
	
	
	@GetMapping
	public ResponseEntity<List<Usuario>> all() {
	return ResponseEntity.ok(usuarioService.getAll());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable Integer id) {
	return usuarioService.getUsuario(id)
	.map(ResponseEntity::ok)
	.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	
	@PostMapping
	public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
	Usuario created = usuarioService.createUsuario(usuario);
	return ResponseEntity.created(URI.create("/api/usuarios/" + created.getId())).body(created);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody Usuario usuario) {
	Usuario updated = usuarioService.updateUsuario(id, usuario);
	return ResponseEntity.ok(updated);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
	usuarioService.deleteUsuario(id);
	return ResponseEntity.noContent().build();
	}
}