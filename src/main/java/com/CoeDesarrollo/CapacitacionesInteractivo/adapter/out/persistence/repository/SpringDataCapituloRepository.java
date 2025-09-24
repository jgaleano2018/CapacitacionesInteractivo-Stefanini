package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.CapituloEntity;


public interface SpringDataCapituloRepository  extends JpaRepository<CapituloEntity, Integer> {
}