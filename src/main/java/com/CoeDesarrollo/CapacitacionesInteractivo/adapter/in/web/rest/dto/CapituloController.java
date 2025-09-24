package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.CapitulosService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Capitulo;

import java.net.URI;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/capitulos")
public class CapituloController {


	private final CapitulosService service;
	
	
	public CapituloController(CapitulosService service) {
	this.service = service;
	}
	
	
	@PostMapping
	public ResponseEntity<Capitulo> create(@Valid @RequestBody Capitulo capitulo) {
	Capitulo created = service.create(capitulo);
	Capitulo out = created;
	return ResponseEntity.created(URI.create("/api/capitulos/" + out.getId())).body(out);
	}
	
	
	@GetMapping("/{id}")
    public ResponseEntity<Capitulo> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Capitulo> update(@PathVariable Integer id, @Valid @RequestBody Capitulo capitulo) {
	Capitulo updated = service.update(id, capitulo);
	return ResponseEntity.ok(updated);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
	service.delete(id);
	return ResponseEntity.noContent().build();
	}
}