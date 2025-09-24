package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.ModuloEntity;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Modulo;


public interface SpringDataModuloRepository  extends JpaRepository<Modulo, Integer> {

	ModuloEntity save(ModuloEntity entity);
}