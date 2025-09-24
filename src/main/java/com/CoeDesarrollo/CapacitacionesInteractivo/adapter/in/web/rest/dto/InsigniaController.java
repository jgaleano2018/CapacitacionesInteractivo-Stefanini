package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.InsigniaService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Insignia;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/insignias")
public class InsigniaController {

    private final InsigniaService service;

	
	public InsigniaController(InsigniaService service) {
	this.service = service;
	}
	

	@PostMapping
	public ResponseEntity<Insignia> create(@Valid @RequestBody Insignia insignia) {
		Insignia created = service.create(insignia);
		return ResponseEntity.created(URI.create("/api/cursos/" + created.getId())).body(created);
	}
	
	
	@GetMapping
    public ResponseEntity<List<Insignia>> list() {
        return ResponseEntity.ok(service.findAll());
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Insignia> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
	
	@PutMapping("/{id}")
	public ResponseEntity<Insignia> update(@PathVariable Integer id, @Valid @RequestBody Insignia insignia) {
		try {
			Insignia updated = service.update(id, insignia);
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
