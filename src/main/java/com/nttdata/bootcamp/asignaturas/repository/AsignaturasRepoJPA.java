package com.nttdata.bootcamp.asignaturas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.bootcamp.asignaturas.entity.Asignaturas;

public interface AsignaturasRepoJPA extends JpaRepository<Asignaturas, Integer> {

}
