package com.quemepongo.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quemepongo.springapp.business.entities.Usuario;
import com.quemepongo.springapp.business.repositories.PreferenciasRepository;
import com.quemepongo.springapp.business.repositories.UsuarioRepository;
import com.quemepongo.springapp.web.pojo.login.UserView;

@Service
public class PreferenciasManager implements IPreferenciasManager {

	@Autowired
	private PreferenciasRepository preferenciasRepository;

	@Override
	public boolean setPrefencias(int idUsuario, double frio_maxima, double calor_minima, double factor_de_correccion,
			boolean paraguas, boolean protector) {
		
		
		return false;
	}
	
	
	
}
