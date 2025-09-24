package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import org.springframework.stereotype.Service;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.ColaboradorSeguimientoRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.ColaboradorSeguimiento;

import java.util.List;

@Service
public class ColaboradorSeguimientoService {
    private final ColaboradorSeguimientoRepository colaboradorSeguimientoRepository;

    public ColaboradorSeguimientoService(ColaboradorSeguimientoRepository colaboradorSeguimientoRepository) {
        this.colaboradorSeguimientoRepository = colaboradorSeguimientoRepository;
    }

    public List<ColaboradorSeguimiento> getAllColaboradorSeguimiento() {
        return colaboradorSeguimientoRepository.findAll();
    }

    public ColaboradorSeguimiento getColaboradorSeguimientoById(String id) {
        return colaboradorSeguimientoRepository.findById(id).orElse(null);
    }

    public ColaboradorSeguimiento createColaboradorSeguimiento(ColaboradorSeguimiento colaboradorSeguimiento) {
        return colaboradorSeguimientoRepository.save(colaboradorSeguimiento);
    }
}
