package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "insignias")
public class InsigniaEntity {


@Id
@Column(name = "idInsignia")
private Integer id;


@Column(length = 100, nullable = false)
private String nombre;


@Column(columnDefinition = "text")
private String descripcion;


@Column(name = "idTipoInsignia")
private Integer idTipoInsignia;


@Column(name = "imagen_url", length = 255)
private String imagenUrl;


public InsigniaEntity() {}


// getters & setters
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
}