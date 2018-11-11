package com.quemepongo.springapp.business.services;

import java.util.ArrayList;

import com.quemepongo.springapp.business.entities.Usuario;

public interface IUsuarioManager {
	boolean tryLogin(Usuario user);
}
