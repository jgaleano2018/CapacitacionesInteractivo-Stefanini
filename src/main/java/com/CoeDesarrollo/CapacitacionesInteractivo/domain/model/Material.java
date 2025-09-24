package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "material") // MongoDB collection name
public class Material {
    @Id
    private String id;
    private Integer idTipoMaterial;
    private String nombre;
    private String urlMaterial;
    private Date fechaCreacion;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdTipoMaterial() {
		return idTipoMaterial;
	}
	public void setIdTipoMaterial(Integer idTipoMaterial) {
		this.idTipoMaterial = idTipoMaterial;
	}
	public String getUrlMaterial() {
		return urlMaterial;
	}
	public void setUrlMaterial(String urlMaterial) {
		this.urlMaterial = urlMaterial;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}