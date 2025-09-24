package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Progreso;

@Repository
public interface ProgresoRepository extends MongoRepository<Progreso, String> {
}