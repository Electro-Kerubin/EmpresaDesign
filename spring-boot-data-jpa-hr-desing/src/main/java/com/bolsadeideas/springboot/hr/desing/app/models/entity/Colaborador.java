package com.bolsadeideas.springboot.hr.desing.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "colaborador")
@Table(name = "colaborador")
public class Colaborador extends Persona implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_colab", nullable = false)
	private Long idColaborador;

	@Column(name = "telefono_colab", nullable = false)
	private Integer fonoColaborador;

	@Column(name = "correo_colab", nullable = true)
	private String emailColaborador;

	@Column(name = "fecha_contrato", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaContrato;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Colaborador() {
		super();
	}

	public Colaborador(Long idColaborador, Long run, char dv, String pnombre, String snombre, String appaterno, String apmaterno,
			Date fechaNacimiento, String estadoCivil, char genero, Integer fonoColaborador,
			String emailColaborador, Date fechaContrato) {
		super(run, dv, pnombre, snombre, appaterno, apmaterno, fechaNacimiento, estadoCivil, genero);
		this.idColaborador = idColaborador;
		this.fonoColaborador = fonoColaborador;
		this.emailColaborador = emailColaborador;
		this.fechaContrato = fechaContrato;
	}
	
	
	
	public Colaborador(Long run, char dv, String pnombre, String snombre, String appaterno, String apmanter,
			Date fechaNacimiento, String estadoCivil, char genero) {
		super(run, dv, pnombre, snombre, appaterno, apmanter, fechaNacimiento, estadoCivil, genero);
		// TODO Auto-generated constructor stub
	}

	public Long getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Long idColaborador) {
		this.idColaborador = idColaborador;
	}

	public Integer getFonoColaborador() {
		return fonoColaborador;
	}

	public void setFonoColaborador(Integer fonoColaborador) {
		this.fonoColaborador = fonoColaborador;
	}

	public String getEmailColaborador() {
		return emailColaborador;
	}

	public void setEmailColaborador(String emailColaborador) {
		this.emailColaborador = emailColaborador;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
