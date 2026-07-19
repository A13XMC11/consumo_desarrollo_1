package com.uisrael.consumowebapi.model.dto.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class JugadorRequestDto {
	
	private int idJugador;
	
	private String nombre;
	
	private String apellidos;
	
	private String ci;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaNacimiento;
	
	private boolean estadoRegistro;
	
	
}
