package com.quemepongo.springapp.business.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quemepongo.springapp.business.entities.Usuario;
import com.quemepongo.springapp.business.repositories.UsuarioRepository;

@Service
public class JPAUsuarioManager implements UsuarioManager {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public ArrayList<Usuario> getAllusers() {
		return (ArrayList<Usuario>) usuarioRepository.findAll();
	}

	@Override
	public void setUsers(ArrayList<Usuario> users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmail(String username, String email) {
		// TODO Auto-generated method stub
		
	}
	
	
}
