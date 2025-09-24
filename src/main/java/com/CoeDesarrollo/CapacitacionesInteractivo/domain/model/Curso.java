package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.util.Objects;


public class Curso {
	private Integer idCurso; // PK
	private Integer idCapacitacion; // FK reference to Capacitaciones
	private String nombre;
	private String descripcion;
	private Integer duracion; // horas
	
	
	public Curso() {}
	
	
	public Curso(Integer idCurso, Integer idCapacitacion, String nombre, String descripcion, Integer duracion) {
	this.idCurso = idCurso;
	this.idCapacitacion = idCapacitacion;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.duracion = duracion;
	}
	
	
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
	
	
	@Override
	public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof Curso)) return false;
	Curso course = (Curso) o;
	return Objects.equals(idCurso, course.idCurso);
	}
	
	
	@Override
	public int hashCode() { return Objects.hash(idCurso); }
}