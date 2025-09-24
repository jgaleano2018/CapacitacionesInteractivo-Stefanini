package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import org.springframework.stereotype.Service;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.AreaConocimiento;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.AreaConocimientoRepository;

import java.util.List;
import java.util.Optional;


@Service
public class AreaConocimientoService {


	private final AreaConocimientoRepository repository;
	
	
	public AreaConocimientoService(AreaConocimientoRepository repository) {
		this.repository = repository;
	}

	
	public Optional<AreaConocimiento> findById(Integer id) {
		return repository.findById(id);
	}
	
	
	public List<AreaConocimiento> findAll() {
		return repository.findAll();
	}
	
}