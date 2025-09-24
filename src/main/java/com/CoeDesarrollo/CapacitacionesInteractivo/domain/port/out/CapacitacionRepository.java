package com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Capacitacion;
import java.util.List;
import java.util.Optional;


public interface CapacitacionRepository {
	Capacitacion save(Capacitacion c);
	Optional<Capacitacion> findById(Integer id);
	List<Capacitacion> findAll();
	void deleteById(Integer id);
}