package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class CursoEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCurso")
	private Integer idCurso;
	
	
	@Column(name = "idCapacitacion", nullable = false)
	private Integer idCapacitacion; // FK to capacitaciones (DB-level constraint expected)
	
	
	@Column(name = "nombre", length = 150, nullable = false)
	private String nombre;
	
	
	@Column(name = "descripcion", columnDefinition = "text")
	private String descripcion;
	
	
	@Column(name = "duracion")
	private Integer duracion;
	
	
	// getters & setters
	public Integer getIdCurso() { return idCurso; }
	public void setIdCurso(Integer idCurso) { this.idCurso = idCurso; }
	public Integer getIdCapacitacion() { return idCapacitacion; }
	public void setIdCapacitacion(Integer idCapacitacion) { this.idCapacitacion = idCapacitacion; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	public Integer getDuracion() { return duracion; }
	public void setDuracion(Integer duracion) { this.duracion = duracion; }
	
}