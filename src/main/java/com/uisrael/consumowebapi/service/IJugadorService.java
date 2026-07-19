package com.uisrael.consumowebapi.service;

import java.util.List;

import com.uisrael.consumowebapi.model.dto.request.JugadorRequestDto;
import com.uisrael.consumowebapi.model.dto.response.JugadorResponseDto;

public interface IJugadorService {
	
	List<JugadorResponseDto> listarJugadores();
	
	void guardarJugador(JugadorRequestDto nuevoJugador);
}
