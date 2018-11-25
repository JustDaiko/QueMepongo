package com.quemepongo.springapp.web.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.quemepongo.springapp.business.entities.MiUsuario;
import com.quemepongo.springapp.business.services.IMiUsuarioManager;
import com.quemepongo.springapp.web.pojo.login.UserView;

@Controller
@RequestMapping(value = "/verMiUsuario.htm")
public class UserController {
	@Autowired
	private IMiUsuarioManager imu;

	@RequestMapping(method = RequestMethod.GET)

	protected ModelAndView usuarioPorId(@RequestParam("ID") int id) {
		ModelAndView model = new ModelAndView();
		model.setViewName("verMiUsuario");
		model.addObject("User", imu.getById(id));

		return model;
	}

}
