package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "modulos")
public class ModuloEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idModulo")
	private Integer idModulo;
	
	
	@Column(name = "idCurso", nullable = false)
	private Integer idCurso;
	
	
	@Column(name = "nombre", length = 150, nullable = false)
	private String nombre;
	
	
	@Column(name = "descripcion", columnDefinition = "text")
	private String descripcion;
	
	
	@Column(name = "orden")
	private Integer orden;
	
	
	// getters & setters
	public Integer getIdModulo() { return idModulo; }
	public void setIdModulo(Integer idModulo) { this.idModulo = idModulo; }
	public Integer getIdCurso() { return idCurso; }
	public void setIdCurso(Integer idCurso) { this.idCurso = idCurso; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	public Integer getOrden() { return orden; }
	public void setOrden(Integer orden) { this.orden = orden; }
}