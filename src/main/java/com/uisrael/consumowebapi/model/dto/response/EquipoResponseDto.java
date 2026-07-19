package com.uisrael.consumowebapi.model.dto.response;

import java.sql.Date;

public class EquipoResponseDto {
	private int idEquipo;
	private String nombreEquipo;
	private String representanteEquipo;
	private Date fechaFundacion;
	private boolean estadoEquipo;
	private String colores;

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getRepresentanteEquipo() {
		return representanteEquipo;
	}

	public void setRepresentanteEquipo(String representanteEquipo) {
		this.representanteEquipo = representanteEquipo;
	}

	public Date getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public boolean isEstadoEquipo() {
		return estadoEquipo;
	}

	public void setEstadoEquipo(boolean estadoEquipo) {
		this.estadoEquipo = estadoEquipo;
	}

	public String getColores() {
		return colores;
	}

	public void setColores(String colores) {
		this.colores = colores;
	}

}
