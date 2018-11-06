package com.quemepongo.springapp.business.services;

import java.util.ArrayList;

import com.quemepongo.springapp.business.entities.Usuario;

public class SimpleUserManager implements UsuarioManager {
	public ArrayList<Usuario> usuario;
	
	public ArrayList<Usuario> getAllusers() {
		return usuario;
	}
	
	public void setUsers(ArrayList<Usuario> users) {
		this.usuario = users;
	}
}
