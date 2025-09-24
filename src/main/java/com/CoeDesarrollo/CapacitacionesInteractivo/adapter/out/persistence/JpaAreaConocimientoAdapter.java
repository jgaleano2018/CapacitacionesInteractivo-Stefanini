package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence;

import org.springframework.stereotype.Component;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.SpringDataAreaConocimientoRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.AreaConocimiento;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.AreaConocimientoRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class JpaAreaConocimientoAdapter implements AreaConocimientoRepository {

	private final SpringDataAreaConocimientoRepository jpaRepo;
	
	
	public JpaAreaConocimientoAdapter(SpringDataAreaConocimientoRepository jpaRepo) {
		this.jpaRepo = jpaRepo;
	}
	
	
	@Override
	public Optional<AreaConocimiento> findById(Integer id) {
		return jpaRepo.findById(id);
	}
	
	
	@Override
	public List<AreaConocimiento> findAll() {
		return jpaRepo.findAll().stream().collect(Collectors.toList());
	}
	
}