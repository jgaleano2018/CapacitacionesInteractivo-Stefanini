package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.util.Objects;


public class Insignia {
	private Integer id;
	private String nombre;
	private String descripcion;
	private Integer idTipoInsignia;
	private String imagenUrl;
	
	
	public Insignia() {}
	
	
	public Insignia(Integer id, String nombre, String descripcion, Integer idTipoInsignia, String imagenUrl) {
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.idTipoInsignia = idTipoInsignia;
	this.imagenUrl = imagenUrl;
	}
	
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	public Integer getIdTipoInsignia() { return idTipoInsignia; }
	public void setIdTipoInsignia(Integer idTipoInsignia) { this.idTipoInsignia = idTipoInsignia; }
	public String getImagenUrl() { return imagenUrl; }
	public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }
	
	
	@Override
	public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	Insignia insignia = (Insignia) o;
	return Objects.equals(id, insignia.id);
	}
	
	
	@Override
	public int hashCode() {
	return Objects.hash(id);
	}
}