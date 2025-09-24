package com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Curso;


import java.util.List;
import java.util.Optional;


public interface CursoRepository {
	Curso save(Curso curso);
	Optional<Curso> findById(Integer id);
	List<Curso> findAll();
	void deleteById(Integer id);
}