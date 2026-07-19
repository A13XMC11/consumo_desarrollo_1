package com.uisrael.consumowebapi.model.dto.request;

import lombok.Data;

@Data
public class CategoriaRequestDto {
	
	private int idCategoria;
	
	private String nombreCategoria;
	
	private String descripcion;
	
	private boolean estadoRegistro;

}
