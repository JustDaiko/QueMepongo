package com.quemepongo.springapp.web.controllers;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quemepongo.springapp.business.services.ChangeEmail;
import com.quemepongo.springapp.business.services.UsuarioManager;

@Controller
@RequestMapping(value="/changeEmail.htm")
public class ChangeMailController {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private UsuarioManager usermanager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid ChangeEmail changeEmail, BindingResult result)
    {
        if (result.hasErrors()) {
            return "emailChange";
        }
		
        String emailnuevo = changeEmail.getEmail();
        logger.info("Increasing prices by " + emailnuevo + "%.");

        usermanager.setEmail("Gaston", emailnuevo);

        return "redirect:/hello.htm";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected ChangeEmail formBackingObject() {
    	ChangeEmail priceIncrease = new ChangeEmail();
        priceIncrease.setEmail("prueba2@gmail.com");
        return priceIncrease;
    }
}
