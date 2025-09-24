package com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Capitulo;
import java.util.List;
import java.util.Optional;


public interface CapitulosRepository {
	Capitulo save(Capitulo capitulo);
	Optional<Capitulo> findById(Integer id);
	List<Capitulo> findAll();
	void deleteById(Integer id);
}