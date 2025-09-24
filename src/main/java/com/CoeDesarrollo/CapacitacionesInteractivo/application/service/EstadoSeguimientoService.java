
package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import org.springframework.stereotype.Service;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.EstadoSeguimientoRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.EstadoSeguimiento;

import java.util.List;

@Service
public class EstadoSeguimientoService {
    private final EstadoSeguimientoRepository estadoSeguimientoRepository;

    public EstadoSeguimientoService(EstadoSeguimientoRepository estadoSeguimientoRepository) {
        this.estadoSeguimientoRepository = estadoSeguimientoRepository;
    }

    public List<EstadoSeguimiento> getAllEstadoSeguimiento() {
        return estadoSeguimientoRepository.findAll();
    }

    public EstadoSeguimiento getEstadoSeguimientoById(String id) {
        return estadoSeguimientoRepository.findById(id).orElse(null);
    }

}
