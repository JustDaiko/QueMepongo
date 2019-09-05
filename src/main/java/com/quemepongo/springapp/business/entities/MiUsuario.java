package com.quemepongo.springapp.business.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="misusuarios")
public class MiUsuario {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "fechaNacimiento")
	private Date fechaNacimiento;
	
	@Column(name = "ultimaModificacion")
	private Timestamp ultimaModificacion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Timestamp getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(Timestamp ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}
}
