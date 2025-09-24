
package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarioRol")
public class UsuarioRolEntity {
	@Id
	@Column(name = "idUsuarioRol")
	private Integer id;
	
	@Column(name = "idUsuario", nullable = false)
	private Integer idUsuario;
	
	@Column(name = "idRol", nullable = false)
	private Integer idRol;
	
	
	public UsuarioRolEntity() {}
	
	
	public UsuarioRolEntity(Integer id, Integer idUsuario, Integer idRol) {
		this.id = id;
		this.idUsuario = idUsuario;
		this.idRol = idRol;
	}
	
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Integer getIdRol() {
		return idRol;
	}


	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	
}