package com.bolsadeideas.springboot.hr.desing.app.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class Persona {
	
	@Id
	@Column(nullable = false)
	protected Long run;

	@Column(nullable = false)
	protected char dv;

	@Column(nullable = false)
	protected String pnombre;

	@Column(nullable = false)
	protected String snombre;

	@Column(nullable = false)
	protected String appaterno;

	@Column(nullable = false)
	protected String apmaterno;

	@Column(name = "fecha_nacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	protected Date fechaNacimiento;

	@Column(name = "estado_civil", updatable = true)
	protected String estadoCivil;

	@Column(name = "genero", updatable = true)
	protected char genero;

	// CONSTRUCTORES
	public Persona() {
	}

	public Persona(Long run, char dv, String pnombre, String snombre, String appaterno, String apmaterno,
			Date fechaNacimiento, String estadoCivil, char genero) {
		this.run = run;
		this.dv = dv;
		this.pnombre = pnombre;
		this.snombre = snombre;
		this.appaterno = appaterno;
		this.apmaterno = apmaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
	}

	public Long getRun() {
		return run;
	}

	public void setRun(Long run) {
		this.run = run;
	}

	public char getDv() {
		return dv;
	}

	public void setDv(char dv) {
		this.dv = dv;
	}

	public String getPnombre() {
		return pnombre;
	}

	public void setPnombre(String pnombre) {
		this.pnombre = pnombre;
	}

	public String getSnombre() {
		return snombre;
	}

	public void setSnombre(String snombre) {
		this.snombre = snombre;
	}

	public String getAppaterno() {
		return appaterno;
	}

	public void setAppaterno(String appaterno) {
		this.appaterno = appaterno;
	}

	public String getApmaterno() {
		return apmaterno;
	}

	public void setApmaterno(String apmaterno) {
		this.apmaterno = apmaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

}
