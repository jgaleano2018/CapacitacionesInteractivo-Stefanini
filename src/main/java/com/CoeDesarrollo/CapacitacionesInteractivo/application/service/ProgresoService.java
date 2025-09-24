package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import org.springframework.stereotype.Service;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.ProgresoRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Progreso;

import java.util.List;

@Service
public class ProgresoService {
    private final ProgresoRepository progresoRepository;

    public ProgresoService(ProgresoRepository progresoRepository) {
        this.progresoRepository = progresoRepository;
    }

    public List<Progreso> getAllProgreso() {
        return progresoRepository.findAll();
    }

    public Progreso getProgresoById(String id) {
        return progresoRepository.findById(id).orElse(null);
    }

    public Progreso createProgreso(Progreso progreso) {
        return progresoRepository.save(progreso);
    }

    public Progreso updateProgreso(String id, Progreso progreso) {
        return progresoRepository.save(progreso);
    }

    public void deleteProgreso(String id) {
    	progresoRepository.deleteById(id);
    }
}
