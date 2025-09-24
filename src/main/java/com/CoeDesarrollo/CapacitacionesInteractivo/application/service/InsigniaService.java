package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Insignia;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.InsigniaRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class InsigniaService {


	private final InsigniaRepository repository;
	
	
	public InsigniaService(InsigniaRepository repository) {
	this.repository = repository;
	}
	
	
	public Insignia create(Insignia insignia) {
	return repository.save(insignia);
	}
	
	
	public Optional<Insignia> findById(Integer id) {
	return repository.findById(id);
	}
	
	
	public List<Insignia> findAll() {
	return repository.findAll();
	}
	
	
	public Insignia update(Integer id, Insignia updated) {
	// Simple example: ensure id
	updated.setId(id);
	return repository.save(updated);
	}
	
	
	public void delete(Integer id) {
	repository.deleteById(id);
	}
}