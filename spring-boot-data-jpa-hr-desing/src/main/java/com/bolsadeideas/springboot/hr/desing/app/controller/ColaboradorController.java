package com.bolsadeideas.springboot.hr.desing.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.hr.desing.app.models.dao.IColaboradorDao;

@Controller
public class ColaboradorController {
	
	@Autowired
	@Qualifier("ColaboradorDaoJPA")
	private IColaboradorDao colabDao; 
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listarColaborador(Model model) {
		model.addAttribute("titulo", "Listado de colaboradores");
		model.addAttribute("colab", colabDao.findAll());
		return "listar";
	}
}
