package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Material;


@Repository
public interface MaterialRepository extends MongoRepository<Material, String> {
}