package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

public class Usuario {
	private Integer id;
	private String nombre;
	private String password;
	private String estado;
	
	
	public Usuario() {}
	
	
	public Usuario(Integer id, String nombre, String password, String estado) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.setEstado(estado);
	}
	
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	public String getEstado() { return estado; }
	public void setEstado(String estado) { this.estado = estado; }
}
