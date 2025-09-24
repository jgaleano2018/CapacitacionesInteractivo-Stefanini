package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

public class Rol {
	private Integer idRol;
	private String nombre;
	
	
	public Rol() {}
	
	
	public Rol(Integer idRol, String nombre) {
		this.idRol = idRol;
		this.nombre = nombre;
	}
	
	
	public Integer getIdRol() { return idRol; }
	public void setId_Rol(Integer idRol) { this.idRol = idRol; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
}
