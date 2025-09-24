package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "capitulos")
public class CapituloEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCapitulo")
	private Integer idCapitulo;
	
	
	@Column(name = "idModulo", nullable = false)
	private Integer idModulo;
	
	
	@Column(length = 150, nullable = false)
	private String titulo;
	
	
	@Lob
	@Column(columnDefinition = "text")
	private String contenido;
	
	
	@Column(name = "orden")
	private Integer orden;
	
	
	public CapituloEntity() {}
	
	
	// getters & setters
	public Integer getIdCapitulo() { return idCapitulo; }
	public void setIdCapitulo(Integer idCapitulo) { this.idCapitulo = idCapitulo; }
	public Integer getIdModulo() { return idModulo; }
	public void setIdModulo(Integer idModulo) { this.idModulo = idModulo; }
	public String getTitulo() { return titulo; }
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public String getContenido() { return contenido; }
	public void setContenido(String contenido) { this.contenido = contenido; }
	public Integer getOrden() { return orden; }
	public void setOrden(Integer orden) { this.orden = orden; }
}