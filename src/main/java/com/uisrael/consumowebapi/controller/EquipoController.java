package com.uisrael.consumowebapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/equipo") //url
public class EquipoController {
	
	@GetMapping
	public String leerPagina() {
		return "equipo/listarequipos"; //directorio
	}

}
