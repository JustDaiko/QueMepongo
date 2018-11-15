package com.quemepongo.springapp.web.controllers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quemepongo.springapp.web.pojo.current.CurrentWeather;
import com.quemepongo.springapp.web.pojo.forecast.Forecast;

import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {
	RestTemplate restTemplate;
	
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value="/home.htm")
    public ModelAndView handleRequest() {
		restTemplate = new RestTemplate();
		
		String urlAPI = "http://api.openweathermap.org/data/2.5/weather?id=712861&units=metric&lang=es&APPID=317792e3c967ee366cb4bef73f69e6e0";
		String urlAPI2="http://api.openweathermap.org/data/2.5/forecast?id=3860259&units=metric&lang=es&APPID=317792e3c967ee366cb4bef73f69e6e0";
		
		CurrentWeather weather = restTemplate.getForObject(urlAPI, CurrentWeather.class);
		weather = parseToRealData(weather);
		
		Forecast forecast = restTemplate.getForObject(urlAPI2,Forecast.class);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("weather", weather);
		
		logger.info("HomeController succes");
        return new ModelAndView("home", "model", myModel);
    }
	
	private CurrentWeather parseToRealData(CurrentWeather weather) {
		//De m/sec a ks/hr
		double mPerSecond = weather.getWind().getSpeed();
		double kmPerHour = mPerSecond * 3.6;
		
		kmPerHour = round(kmPerHour, 2);
		weather.getWind().setSpeed(kmPerHour);
		
		return weather;
	}
	
	private double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	 
	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
