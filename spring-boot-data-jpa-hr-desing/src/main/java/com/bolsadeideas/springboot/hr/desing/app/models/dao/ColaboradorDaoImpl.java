package com.bolsadeideas.springboot.hr.desing.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.hr.desing.app.models.entity.Colaborador;

@Repository("ColaboradorDaoJPA")
public class ColaboradorDaoImpl implements IColaboradorDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Colaborador> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT * FROM colaborador").getResultList();
	}

}
