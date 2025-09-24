package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;

import org.springframework.web.bind.annotation.*;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.EstadoSeguimientoService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.EstadoSeguimiento;

import java.util.List;

@RestController
@RequestMapping("/api/estadoSeguimiento")
public class EstadoSeguimientoController {
    private final EstadoSeguimientoService estadoSeguimientoService;

    public EstadoSeguimientoController(EstadoSeguimientoService estadoSeguimientoService) {
        this.estadoSeguimientoService = estadoSeguimientoService;
    }

    @GetMapping
    public List<EstadoSeguimiento> getAllEstadoSeguimiento() {
        return estadoSeguimientoService.getAllEstadoSeguimiento();
    }

    @GetMapping("/{id}")
    public EstadoSeguimiento getEstadoSeguimientoById(@PathVariable String id) {
        return estadoSeguimientoService.getEstadoSeguimientoById(id);
    }
}