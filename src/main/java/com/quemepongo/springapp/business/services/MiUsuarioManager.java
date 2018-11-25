package com.quemepongo.springapp.business.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quemepongo.springapp.business.entities.MiUsuario;
import com.quemepongo.springapp.business.repositories.MiUsuarioRepository;

@Service
public class MiUsuarioManager implements IMiUsuarioManager {

	@Autowired
	private MiUsuarioRepository miUsuarioRepository;

	public MiUsuario getById(int id) {
		Optional<MiUsuario> user = miUsuarioRepository.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
	
	
}
