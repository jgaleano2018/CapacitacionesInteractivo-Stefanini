package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.InsigniaEntity;


public interface SpringDataInsigniaRepository  extends JpaRepository<InsigniaEntity, Integer> {
}