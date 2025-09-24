package com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out;


import java.util.List;
import java.util.Optional;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Usuario;


public interface UsuarioRepository {
	Usuario save(Usuario usuario);
	Optional<Usuario> findById(Integer id);
	List<Usuario> findAll();
	void deleteById(Integer id);
}