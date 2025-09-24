package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.util.Objects;


public class Modulo {
	private Integer idModulo;
	private Integer idCurso;
	private String nombre;
	private String descripcion;
	private Integer orden;
	
	
	public Modulo() {}


	public Modulo(Integer idModulo, Integer idCurso, String nombre, String descripcion, Integer orden) {
		this.idModulo = idModulo;
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.orden = orden;
	}
	
	
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
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Modulo)) return false;
		Modulo modulo = (Modulo) o;
		return Objects.equals(idModulo, modulo.idModulo);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idModulo);
	}
}