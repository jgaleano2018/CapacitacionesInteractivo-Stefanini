package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

public class TipoCapacitacion {
	private Integer idTipoCapacitacion;
	private String nombre;
	
	
	public TipoCapacitacion() {}
	
	
	public TipoCapacitacion(Integer idTipoCapacitacion, String nombre) {
		this.idTipoCapacitacion = idTipoCapacitacion;
		this.nombre = nombre;
	}
	
	
	public Integer getIdTipoCapacitacion() { return idTipoCapacitacion; }
	public void setIdTipoCapacitacion(Integer idTipoCapacitacion) { this.idTipoCapacitacion = idTipoCapacitacion; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
}
