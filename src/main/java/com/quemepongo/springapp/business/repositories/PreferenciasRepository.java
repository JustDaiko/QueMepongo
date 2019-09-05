package com.quemepongo.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.quemepongo.springapp.business.entities.Preferencia;

public interface PreferenciasRepository extends CrudRepository<Preferencia, Integer> {
	
}
