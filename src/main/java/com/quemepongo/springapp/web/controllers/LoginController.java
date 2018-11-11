package com.quemepongo.springapp.web.controllers;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quemepongo.springapp.business.entities.Usuario;
import com.quemepongo.springapp.business.services.IUsuarioManager;

@Controller
@RequestMapping(value="/login.htm")
public class LoginController {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private IUsuarioManager usermanager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Usuario user, BindingResult result)
    {
        if (result.hasErrors()) {
            return "login";
        }
        
        
        if(usermanager.tryLogin(user)) {
        	return "redirect:/home.htm";
        }
        
        
        return "login";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected Usuario formBackingObject() {
    	Usuario user = new Usuario();
    	
        return user;
    }
}
