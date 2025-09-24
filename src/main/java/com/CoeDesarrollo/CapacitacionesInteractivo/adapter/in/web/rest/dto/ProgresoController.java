package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;

import org.springframework.web.bind.annotation.*;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.ProgresoService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Progreso;

import java.util.List;

@RestController
@RequestMapping("/api/progreso")
public class ProgresoController {
    private final ProgresoService progresoService;

    public ProgresoController(ProgresoService progresoService) {
        this.progresoService = progresoService;
    }

    @GetMapping
    public List<Progreso> getAllProgreso() {
        return progresoService.getAllProgreso();
    }

    @GetMapping("/{id}")
    public Progreso getProgresoById(@PathVariable String id) {
        return progresoService.getProgresoById(id);
    }

    @PostMapping
    public Progreso createProgreso(@RequestBody Progreso progreso) {
        return progresoService.createProgreso(progreso);
    }

    @PutMapping("/{id}")
    public Progreso updateProgreso(@PathVariable String id, @RequestBody Progreso progreso) {
        return progresoService.updateProgreso(id, progreso);
    }

    @DeleteMapping("/{id}")
    public void deleteProgreso(@PathVariable String id) {
    	progresoService.deleteProgreso(id);
    }
}