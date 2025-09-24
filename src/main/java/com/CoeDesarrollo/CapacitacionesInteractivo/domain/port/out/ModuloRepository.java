package com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Modulo;

import java.util.List;
import java.util.Optional;

public interface ModuloRepository {
    Modulo save(Modulo modulo);
    Optional<Modulo> findById(Integer id);
    List<Modulo> findAll();
    void deleteById(Integer id);
}
