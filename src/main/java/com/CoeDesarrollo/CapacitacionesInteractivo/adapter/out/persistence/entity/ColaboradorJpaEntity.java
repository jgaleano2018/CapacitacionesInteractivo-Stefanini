package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "colaboradores", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class ColaboradorJpaEntity {

	
	@Id
	@Column(name = "idColaborador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idColaborador;
	
	
	@Column(length = 100, nullable = false)
	private String nombre;
	
	
	@Column(length = 150, nullable = false, unique = true)
	private String email;
	
	
	@Column(length = 100)
	private String cargo;
	
	
	@Column(name = "fechaIngreso")
	private Date fechaIngreso;
	
	
	// getters and setters
	
	
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