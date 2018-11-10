package com.quemepongo.springapp.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quemepongo.springapp.web.pojo.CurrentWeather;

import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {
	RestTemplate restTemplate;
	
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value="/home.htm")
    public ModelAndView handleRequest() {
		restTemplate = new RestTemplate();
		
		String urlAPI = "http://api.openweathermap.org/data/2.5/weather?q=London&APPID=317792e3c967ee366cb4bef73f69e6e0";
		
		CurrentWeather weather = restTemplate.getForObject(urlAPI, CurrentWeather.class);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("weather", weather);
		
		logger.info("HomeController succes");
        return new ModelAndView("home", "model", myModel);
    }
}
