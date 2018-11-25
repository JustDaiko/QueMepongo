package com.quemepongo.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.quemepongo.springapp.web.pojo.login.UserView;

@Entity
@Table(name="preferencias")
public class Preferencia {
	
	@Id
    @Column(name = "id_usuario")
	private Integer id_usuario;
	
	@Column(name = "frio_maxima")
	private Double frio_maxima;
	
	@Column(name = "calor_minima")
	private Double calor_minima;
	
	@Column(name = "factor_de_correccion")
	private Double factor_de_correccion;
	
	@Column(name = "paraguas")
	private Boolean paraguas;
	
	@Column(name = "protector")
	private Boolean protector;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Double getFrio_maxima() {
		return frio_maxima;
	}

	public void setFrio_maxima(Double frio_maxima) {
		this.frio_maxima = frio_maxima;
	}

	public Double getCalor_minima() {
		return calor_minima;
	}

	public void setCalor_minima(Double calor_minima) {
		this.calor_minima = calor_minima;
	}

	public Double getFactor_de_correccion() {
		return factor_de_correccion;
	}

	public void setFactor_de_correccion(Double factor_de_correccion) {
		this.factor_de_correccion = factor_de_correccion;
	}

	public Boolean getParaguas() {
		return paraguas;
	}

	public void setParaguas(Boolean paraguas) {
		this.paraguas = paraguas;
	}

	public Boolean getProtector() {
		return protector;
	}

	public void setProtector(Boolean protector) {
		this.protector = protector;
	}
	
	
}
