package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.UsuarioRolEntity;


public interface SpringDataUsuarioRolRepository extends JpaRepository<UsuarioRolEntity, Integer> {
}