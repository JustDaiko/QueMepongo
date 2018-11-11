package com.quemepongo.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quemepongo.springapp.business.entities.Usuario;
import com.quemepongo.springapp.business.repositories.UsuarioRepository;

@Service
public class UsuarioManager implements IUsuarioManager {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public boolean tryLogin(Usuario pUser) {
		Iterable<Usuario> allUsers = usuarioRepository.findAll();
		
		for (Usuario usuario : allUsers) {
			usuario.tryLogin(pUser);
		}
		
		return false;
	}
	
	
}
