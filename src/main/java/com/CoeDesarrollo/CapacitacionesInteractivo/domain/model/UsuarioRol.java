package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

public class UsuarioRol {
	private Integer idUsuarioRol;
	private Integer idUsuario;
	private Integer idRol;
	
	
	public UsuarioRol() {}
	
	
	public UsuarioRol(Integer idUsuarioRol, Integer idUsuario, Integer idRol) {
		this.idUsuarioRol = idUsuarioRol;
		this.idUsuario = idUsuario;
		this.idRol = idRol;	
	}


	public Integer getIdUsuarioRol() {
		return idUsuarioRol;
	}


	public void setIdUsuarioRol(Integer idUsuarioRol) {
		this.idUsuarioRol = idUsuarioRol;
	}


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
