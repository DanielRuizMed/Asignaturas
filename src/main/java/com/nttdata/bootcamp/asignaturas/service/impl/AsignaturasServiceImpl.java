package com.nttdata.bootcamp.asignaturas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.asignaturas.entity.Asignaturas;
import com.nttdata.bootcamp.asignaturas.repository.AsignaturasRepoJPA;
import com.nttdata.bootcamp.asignaturas.service.AsignaturasService;

@Service
public class AsignaturasServiceImpl implements AsignaturasService{

	@Autowired
	AsignaturasRepoJPA asignaturasJPA;
	
	@Override
	public List<Asignaturas> listar() {
		// TODO Auto-generated method stub
		return asignaturasJPA.findAll();
	}

}
