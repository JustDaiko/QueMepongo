package com.quemepongo.springapp.web.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quemepongo.springapp.business.services.UsuarioManager;

@Controller
public class UserController {
	
	@Autowired
    private UsuarioManager userManager;
	
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value="/hello.htm")
    public ModelAndView handleRequest() {
		String now = new Date().toString();
		logger.info("Returning hello view with " + now);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("users", this.userManager.getAllusers());

        return new ModelAndView("hello", "model", myModel);
    }
}