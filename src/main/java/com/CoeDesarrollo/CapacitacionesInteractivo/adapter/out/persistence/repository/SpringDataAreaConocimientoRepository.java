package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.AreaConocimiento;

public interface SpringDataAreaConocimientoRepository extends JpaRepository<AreaConocimiento, Integer> {
}