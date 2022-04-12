package com.bolsadeideas.springboot.hr.desing.app.models.dao;

import java.util.List;

import com.bolsadeideas.springboot.hr.desing.app.models.entity.Colaborador;


public interface IColaboradorDao {
	
	public List<Colaborador> findAll();
		
}
