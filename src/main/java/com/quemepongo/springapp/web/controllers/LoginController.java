package com.quemepongo.springapp.web.controllers;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.quemepongo.springapp.business.services.IUsuarioManager;
import com.quemepongo.springapp.web.pojo.login.UserView;

@Controller
@RequestMapping(value="/login.htm")
public class LoginController {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private IUsuarioManager usermanager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid UserView userAAA, BindingResult result)
    {
        if (result.hasErrors()) {
            return "login";
        }
        
        if(usermanager.tryLogin(userAAA)) {
        	
        	return "redirect:/home.htm";
        }
        userAAA.setError(true);
        
        return "login";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    protected ModelAndView initaaa() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("login");
    	
    	UserView user = new UserView();
    	model.addObject("userAAA", user);
    	
        return model;
    }
}
