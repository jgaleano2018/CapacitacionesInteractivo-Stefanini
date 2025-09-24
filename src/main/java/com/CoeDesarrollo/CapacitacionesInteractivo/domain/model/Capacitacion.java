package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.sql.Date;


public class Capacitacion {
	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	
	
	// constructors, getters, setters
	public Capacitacion() {}
	
	
	public Capacitacion(Integer id, String nombre, String descripcion, Date fechaInicio, Date fechaFin) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	
	// getters & setters omitted for brevity (generate with your IDE or Lombok in adapters)
	
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	public Date getFechaInicio() { return fechaInicio; }
	public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }
	public Date getFechaFin() { return fechaFin; }
	public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }
}
