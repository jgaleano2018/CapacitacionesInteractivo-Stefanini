package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

public class TipoInsignia {
	private Integer idTipoInsignia;
	private String nombre;
	
	
	public TipoInsignia() {}
	
	
	public TipoInsignia(Integer idTipoInsignia, String nombre) {
		this.idTipoInsignia = idTipoInsignia;
		this.nombre = nombre;
	}
	
	
	public Integer getIdTipoInsignia() { return idTipoInsignia; }
	public void setIdTipoInsignia(Integer idTipoInsignia) { this.idTipoInsignia = idTipoInsignia; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
}
