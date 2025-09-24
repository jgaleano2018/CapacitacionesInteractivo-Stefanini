package com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.AreaConocimiento;


public interface AreaConocimientoRepository {
	Optional<AreaConocimiento> findById(Integer id);
	List<AreaConocimiento> findAll();
}