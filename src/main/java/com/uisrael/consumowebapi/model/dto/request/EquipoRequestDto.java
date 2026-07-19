package com.uisrael.consumowebapi.model.dto.request;

import java.util.Date;

import lombok.Data;
@Data
public class EquipoRequestDto {
	private int idEquipo;
	
	private String nombreEquipo;
	
	private String representanteEquipo;
	
	private Date fechaFundacion;
	
	private boolean estadoEquipo;
	
	private String colores;
}
