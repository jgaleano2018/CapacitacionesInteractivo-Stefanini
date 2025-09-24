package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.CursoService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Curso;


@RestController
@RequestMapping("/api/cursos")

public class CursoController {


	private final CursoService service;
	
	
	public CursoController(CursoService service) {
	this.service = service;
	}
	
	
	@PostMapping
	public ResponseEntity<Curso> create(@Valid @RequestBody Curso curso) {
		Curso created = service.create(curso);
		return ResponseEntity.created(URI.create("/api/cursos/" + created.getIdCurso())).body(created);
	}
	
	
	 @GetMapping
	    public ResponseEntity<List<Curso>> list() {
	        return ResponseEntity.ok(service.findAll());
	    }
	
	 @GetMapping("/{id}")
	    public ResponseEntity<Curso> getById(@PathVariable Integer id) {
	        return service.findById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }
	
	@PutMapping("/{id}")
	public ResponseEntity<Curso> update(@PathVariable Integer id, @Valid @RequestBody Curso curso) {
		try {
			Curso updated = service.update(id, curso);
			return ResponseEntity.ok(updated);
		} catch (RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}