package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.util.Objects;


public class Capitulo {
	private Integer id;
	private Integer idModulo;
	private String titulo;
	private String contenido;
	private Integer orden;
	
	
	public Capitulo() {}


	public Capitulo(Integer id, Integer idModulo, String titulo, String contenido, Integer orden) {
		this.id = id;
		this.idModulo = idModulo;
		this.titulo = titulo;
		this.contenido = contenido;
		this.orden = orden;
	}
	
	
	// getters & setters
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public Integer getIdModulo() { return idModulo; }
	public void setIdModulo(Integer idModulo) { this.idModulo = idModulo; }
	public String getTitulo() { return titulo; }
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public String getContenido() { return contenido; }
	public void setContenido(String contenido) { this.contenido = contenido; }
	public Integer getOrden() { return orden; }
	public void setOrden(Integer orden) { this.orden = orden; }
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Capitulo)) return false;
		Capitulo capitulo = (Capitulo) o;
		return Objects.equals(id, capitulo.id);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}