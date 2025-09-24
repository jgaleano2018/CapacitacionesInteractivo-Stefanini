package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "colaboradorInsignia") // MongoDB collection name
public class ColaboradorInsignia {
    @Id
    private String id;
    private Integer idColaborador;
    private Integer idInsignia;
    private Date fechaCreacion;
    private Date fechaActualizacion;
	public Integer getIdColaborador() {
		return idColaborador;
	}
	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}
	public Integer getIdInsignia() {
		return idInsignia;
	}
	public void setIdInsignia(Integer idInsignia) {
		this.idInsignia = idInsignia;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
}