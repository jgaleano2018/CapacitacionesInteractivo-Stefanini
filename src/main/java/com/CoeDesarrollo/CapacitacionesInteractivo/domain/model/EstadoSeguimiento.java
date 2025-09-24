package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "estadoSeguimiento") // MongoDB collection name
public class EstadoSeguimiento {
	@Id
	private Integer id;
	private String nombre;
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
