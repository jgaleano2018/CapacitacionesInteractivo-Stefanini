package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Colaborador;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorService {

    private final ColaboradorRepository repository;

    public ColaboradorService(ColaboradorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Colaborador create(Colaborador colaborador) {
        // ejemplo: validar email unico
        repository.findByEmail(colaborador.getEmail()).ifPresent(c -> {
            throw new IllegalArgumentException("Email ya existe");
        });
        return repository.save(colaborador);
    }

    public Optional<Colaborador> getById(Integer id) {
        return repository.findById(id);
    }

    public List<Colaborador> getAll() {
        return repository.findAll();
    }

    @Transactional
    public Colaborador update(Integer id, Colaborador updated) {
        Colaborador entity = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Colaborador no encontrado"));
        entity.setNombre(updated.getNombre());
        entity.setCargo(updated.getCargo());
        entity.setEmail(updated.getEmail());
        entity.setFechaIngreso(updated.getFechaIngreso());
        return repository.save(entity);
    }

    @Transactional
    public void delete(Integer id) {
        repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Colaborador no encontrado"));
        repository.deleteById(id);
    }
}