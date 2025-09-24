package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.TipoInsignia;

public interface SpringDataTipoInsigniaRepository extends JpaRepository<TipoInsignia, Integer> {
}