package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.ColaboradorSeguimientoService;
import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.ColaboradorService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Colaborador;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.ColaboradorSeguimiento;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/colaboradores")
public class ColaboradorController {

    private final ColaboradorService service;
    private final ColaboradorSeguimientoService serviceColSeg;
    

    public ColaboradorController(ColaboradorService service, ColaboradorSeguimientoService serviceColSeg) {
        this.service = service;
        this.serviceColSeg = serviceColSeg;
    }

    @GetMapping
    public ResponseEntity<List<Colaborador>> list() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Colaborador> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Colaborador colaborador) {
        try {
            Colaborador created = service.create(colaborador);
            return ResponseEntity.created(URI.create("/api/colaboradores/" + created.getIdColaborador())).body(created);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @PostMapping
    public ColaboradorSeguimiento createColaboradorSeguimiento(@RequestBody ColaboradorSeguimiento colaboradorSeguimiento) {
        return serviceColSeg.createColaboradorSeguimiento(colaboradorSeguimiento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Colaborador colaborador) {
        try {
            Colaborador updated = service.update(id, colaborador);
            return ResponseEntity.ok(updated);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        try {
            service.delete(id);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
}