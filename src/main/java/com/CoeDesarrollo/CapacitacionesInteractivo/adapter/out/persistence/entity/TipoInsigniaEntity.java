package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tipoInsignia")
public class TipoInsigniaEntity {
	@Id
	@Column(name = "idTipoCapacitacion")
	private Integer id;
	
	
	@Column(length = 8, nullable = false)
	private String nombre;
	
	
	public TipoInsigniaEntity() {}
	
	
	public TipoInsigniaEntity(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
}