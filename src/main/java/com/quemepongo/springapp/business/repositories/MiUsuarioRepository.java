package com.quemepongo.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.quemepongo.springapp.business.entities.MiUsuario;

public interface MiUsuarioRepository extends CrudRepository<MiUsuario, Integer> {
	
}
