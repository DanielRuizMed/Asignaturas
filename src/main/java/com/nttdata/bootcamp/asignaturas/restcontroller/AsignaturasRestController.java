package com.nttdata.bootcamp.asignaturas.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.asignaturas.entity.Asignaturas;
import com.nttdata.bootcamp.asignaturas.service.AsignaturasService;



@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturasRestController {

	@Autowired
	AsignaturasService asignaturaService;
	
	@GetMapping
	@Cacheable(value="asignaturas")
	public List<Asignaturas> listarEmpleados(){
		try {
			Thread.sleep(1500);
		}catch(InterruptedException e) {}
		return asignaturaService.listar();
	}
}
