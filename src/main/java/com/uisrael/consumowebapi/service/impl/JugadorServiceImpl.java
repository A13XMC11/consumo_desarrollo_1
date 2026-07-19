package com.uisrael.consumowebapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.uisrael.consumowebapi.model.dto.request.JugadorRequestDto;
import com.uisrael.consumowebapi.model.dto.response.JugadorResponseDto;
import com.uisrael.consumowebapi.service.IJugadorService;
@Service
public class JugadorServiceImpl implements IJugadorService {

	private final WebClient webClient;

	public JugadorServiceImpl(WebClient webClient) {
		this.webClient = webClient;
	}

	@Override
	public List<JugadorResponseDto> listarJugadores() {

		return webClient.get().uri("/jugador/query").retrieve().bodyToFlux(JugadorResponseDto.class).collectList().block();
	}

	@Override
	public void guardarJugador(JugadorRequestDto nuevoJugador) {
		webClient.post().uri("/jugador").bodyValue(nuevoJugador).retrieve().toBodilessEntity().block();
	}
	
	

}
