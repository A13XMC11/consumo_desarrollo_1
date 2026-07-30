package com.uisrael.consumowebapi.service;

import java.util.List;

import com.uisrael.consumowebapi.model.dto.response.EquipoResponseDto;

public interface IEquipoService {
	List<EquipoResponseDto> listarEquipo();
}
