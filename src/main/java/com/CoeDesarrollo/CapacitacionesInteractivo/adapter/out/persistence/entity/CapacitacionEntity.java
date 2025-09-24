package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name = "capacitaciones")
public class CapacitacionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCapacitacion")
	private Integer id;
	
	
	@Column(length = 150, nullable = false)
	private String nombre;
	
	
	@Column(columnDefinition = "text")
	private String descripcion;
	
	
	@Column(name = "fechaInicio")
	private Date fechaInicio;
	
	
	@Column(name = "fechaFin")
	private Date fechaFin;
	
	
	// getters & setters
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	public Date getFechaInicio() { return fechaInicio; }
	public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }
	public Date getFechaFin() { return fechaFin; }
	public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }
}