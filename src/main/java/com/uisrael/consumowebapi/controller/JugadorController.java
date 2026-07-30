package com.uisrael.consumowebapi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uisrael.consumowebapi.model.dto.request.EquipoRequestDto;
import com.uisrael.consumowebapi.model.dto.request.JugadorRequestDto;
import com.uisrael.consumowebapi.model.dto.response.JugadorResponseDto;
import com.uisrael.consumowebapi.service.IEquipoService;
import com.uisrael.consumowebapi.service.IJugadorService;

@Controller
@RequestMapping("/jugadores")
public class JugadorController {

	@Autowired
	private IJugadorService servicioJugador;
	
	@Autowired
	private IEquipoService servicioEquipo;

	@GetMapping
	private String leerPagina(Model model) {
		List<JugadorResponseDto> jugadoresBD = servicioJugador.listarJugadores();
		model.addAttribute("listajugadores", jugadoresBD); //html al api para ser utilizado
		return "/jugador/listarjugador";
	}
	
	@GetMapping("/nuevo")
	private String nuevoJugador(Model model) {
		model.addAttribute("jugador", new JugadorRequestDto());
		model.addAttribute("listarEquipo", servicioEquipo.listarEquipo());
		
		return "/jugador/crearjugador";
	}
	
	@PostMapping("/guardar")
	public String guardarJugador(@ModelAttribute JugadorRequestDto jugador) {
		jugador.setFechaNacimiento(new Date());
		EquipoRequestDto fk=new EquipoRequestDto();
		jugador.setFkEquipoEntity(fk);
		servicioJugador.guardarJugador(jugador);
		return "redirect:/jugadores";
	}
	
	//1.- Recuperar id seleccionado ---ok
	//2.- enviar al api para buscarPorId
	//3.- enviar resultado al html
	//4.- abrir formulario para editar
	
	@GetMapping("/editar/{idJugador}")
	public String editarJugador(@PathVariable int idJugador, Model model) {
		model.addAttribute("jugador", servicioJugador.buscarPorId(idJugador));
		model.addAttribute("listarEquipo", servicioEquipo.listarEquipo());
		return "/jugador/crearjugador";
	}
	

}
