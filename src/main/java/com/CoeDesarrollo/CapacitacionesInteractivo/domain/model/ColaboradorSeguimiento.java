package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "colaboradorSeguimiento") // MongoDB collection name
public class ColaboradorSeguimiento {
    @Id
    private String id;
    private Integer idEstadoSeguimiento;
    private Integer idColaborador;
    private Date fechaCreacion;
    private Date fechaActualizacion;
	public Integer getIdEstadoSeguimiento() {
		return idEstadoSeguimiento;
	}
	public void setIdEstadoSeguimiento(Integer idEstadoSeguimiento) {
		this.idEstadoSeguimiento = idEstadoSeguimiento;
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
	public Integer getIdColaborador() {
		return idColaborador;
	}
	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}
}