package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

public class AreaConocimiento {
	private Integer idAreaConocimiento;
	private String nombre;
	
	
	public AreaConocimiento() {}
	
	
	public AreaConocimiento(Integer idAreaConocimiento, String nombre) {
		this.idAreaConocimiento = idAreaConocimiento;
		this.nombre = nombre;
	}
	
	
	public Integer getId() { return idAreaConocimiento; }
	public void setIdAreaConocimiento(Integer idAreaConocimiento) { this.idAreaConocimiento = idAreaConocimiento; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
}
