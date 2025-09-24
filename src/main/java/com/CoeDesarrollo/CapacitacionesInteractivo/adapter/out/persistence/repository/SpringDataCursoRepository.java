package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.CursoEntity;


public interface SpringDataCursoRepository  extends JpaRepository<CursoEntity, Integer> {
}