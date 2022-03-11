package com.nttdata.bootcamp.asignaturas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata.bootcamp.asignaturas.service.AsignaturasService;

@Controller
public class WebController {

	@Autowired
	AsignaturasService asignaturas;
	
	@GetMapping("/asignaturas")
	public String greeting(Model model) {
		model.addAttribute("listaAsig", asignaturas.listar());
		return "listarDeAsignaturas";
	}
	
	@GetMapping("/error")
	public String error_page(){
		return "error";
	}
}
