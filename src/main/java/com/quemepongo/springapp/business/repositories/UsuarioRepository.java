package com.quemepongo.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.quemepongo.springapp.business.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
}
