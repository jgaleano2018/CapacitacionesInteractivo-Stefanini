package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.CapacitacionService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Capacitacion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/capacitaciones")

public class CapacitacionController {


	private final CapacitacionService service;
	
	
	public CapacitacionController(CapacitacionService service) {
	this.service = service;
	}
	
	
	@PostMapping
	public ResponseEntity<Capacitacion> create(@Valid @RequestBody Capacitacion capacitacion) {
		Capacitacion created = service.create(capacitacion);
		return ResponseEntity.created(URI.create("/api/capacitaciones/" + created.getId())).body(created);
	}
	
	
	 @GetMapping
	    public ResponseEntity<List<Capacitacion>> list() {
	        return ResponseEntity.ok(service.findAll());
	    }
	
	 @GetMapping("/{id}")
	    public ResponseEntity<Capacitacion> getById(@PathVariable Integer id) {
	        return service.findById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }
	
	@PutMapping("/{id}")
	public ResponseEntity<Capacitacion> update(@PathVariable Integer id, @Valid @RequestBody Capacitacion capacitacion) {
		try {
			Capacitacion updated = service.update(id, capacitacion);
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