package com.quemepongo.springapp.web.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {
	RestTemplate restTemplate;
	
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value="/home.htm")
    public ModelAndView handleRequest() {
		restTemplate = new RestTemplate();
		
		String urlAPI = "http://api.openweathermap.org/data/2.5/weather?q=London&APPID=317792e3c967ee366cb4bef73f69e6e0";
		
		String asd = restTemplate.getForObject(urlAPI, String.class);
		
		System.out.println(asd);
		logger.info("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		
        return new ModelAndView("home");
    }
}
