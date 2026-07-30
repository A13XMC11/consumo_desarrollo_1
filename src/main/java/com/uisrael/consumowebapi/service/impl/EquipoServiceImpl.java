package com.uisrael.consumowebapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.uisrael.consumowebapi.model.dto.response.EquipoResponseDto;
import com.uisrael.consumowebapi.service.IEquipoService;

@Service
public class EquipoServiceImpl implements IEquipoService{
	
	private final WebClient webClient;
	
	

	public EquipoServiceImpl(WebClient webClient) {
		super();
		this.webClient = webClient;
	}

	@Override
	public List<EquipoResponseDto> listarEquipo() {
		return webClient.get().uri("/equipo").retrieve().bodyToFlux(EquipoResponseDto.class).collectList()
				.block();
	}

}
