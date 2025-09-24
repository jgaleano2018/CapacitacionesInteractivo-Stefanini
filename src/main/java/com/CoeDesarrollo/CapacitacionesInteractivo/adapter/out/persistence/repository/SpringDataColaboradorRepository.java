package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.ColaboradorJpaEntity;
import java.util.Optional;


public interface SpringDataColaboradorRepository extends JpaRepository<ColaboradorJpaEntity, Integer> {
	Optional<ColaboradorJpaEntity> findByEmail(String email);
}