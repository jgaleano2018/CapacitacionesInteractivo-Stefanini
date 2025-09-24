package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.sql.Date;


public class Colaborador {
	private Integer idColaborador; // matches id_colaborador INT
	private String nombre;
	private String email;
	private String cargo;
	private Date fechaIngreso;
	
	
	// constructors, getters, setters
	
	
	public Colaborador() {}
	
	
	public Colaborador(Integer idColaborador, String nombre, String email, String cargo, Date fechaIngreso) {
		this.idColaborador = idColaborador;
		this.nombre = nombre;
		this.email = email;
		this.cargo = cargo;
		this.fechaIngreso = fechaIngreso;
	}
	
	
	public Integer getIdColaborador() { return idColaborador; }
	public void setIdColaborador(Integer idColaborador) { this.idColaborador = idColaborador; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public String getCargo() { return cargo; }
	public void setCargo(String cargo) { this.cargo = cargo; }
	public Date getFechaIngreso() { return fechaIngreso; }
	public void setFechaIngreso(Date fechaIngreso) { this.fechaIngreso = fechaIngreso; }
}