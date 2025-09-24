package com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Colaborador;
import java.util.List;
import java.util.Optional;


public interface ColaboradorRepository {
	Colaborador save(Colaborador c);
	Optional<Colaborador> findById(Integer id);
	List<Colaborador> findAll();
	void deleteById(Integer id);
	Optional<Colaborador> findByEmail(String email);
}