package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
	@Id
	@Column(name = "idUsuario")
	private Integer id;
	
	
	@Column(length = 50, nullable = false)
	private String nombre;
	
	
	@Column(length = 50, nullable = false)
	private String password;
	
	
	@Column(length = 10, nullable = false)
	private String estado;
	
	
	public UsuarioEntity() {}
	
	
	public UsuarioEntity(Integer id, String nombre, String password, String estado) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.estado = estado;
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