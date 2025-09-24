package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.TipoCapacitacion;

public interface SpringDataTipoCapacitacionRepository extends JpaRepository<TipoCapacitacion, Integer> {
}