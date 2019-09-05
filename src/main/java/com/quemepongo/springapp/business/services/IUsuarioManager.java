package com.quemepongo.springapp.business.services;

import java.util.ArrayList;

import com.quemepongo.springapp.business.entities.Usuario;
import com.quemepongo.springapp.web.pojo.login.UserView;

public interface IUsuarioManager {
	boolean tryLogin(UserView user);
}
