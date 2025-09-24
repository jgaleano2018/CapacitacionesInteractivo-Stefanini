package com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Insignia;
import java.util.List;
import java.util.Optional;


public interface InsigniaRepository {
	Insignia save(Insignia insignia);
	Optional<Insignia> findById(Integer id);
	List<Insignia> findAll();
	void deleteById(Integer id);
}