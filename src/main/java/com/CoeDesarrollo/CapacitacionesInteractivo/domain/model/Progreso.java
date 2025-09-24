package com.CoeDesarrollo.CapacitacionesInteractivo.domain.model;


import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "progreso") // MongoDB collection name
public class Progreso {
    @Id
    private String id;
    private Integer idColaborador;
    private Integer idCurso;
    private Integer isMaterial;
    private Double porcentajeAvance;
    private Date fechaIngreso;
    
	public Integer getIdColaborador() {
		return idColaborador;
	}
	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public Integer getIsMaterial() {
		return isMaterial;
	}
	public void setIsMaterial(Integer isMaterial) {
		this.isMaterial = isMaterial;
	}
	public Double getPorcentajeAvance() {
		return porcentajeAvance;
	}
	public void setPorcentajeAvance(Double porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}