package com.quemepongo.springapp.web.controllers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quemepongo.springapp.web.pojo.current.CurrentWeather;
import com.quemepongo.springapp.web.pojo.forecast.Forecast;
import com.quemepongo.springapp.web.pojo.forecast.List;

import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {
	RestTemplate restTemplate;
	
	protected final Log logger = LogFactory.getLog(getClass());
	private Calendar c = new GregorianCalendar();
	private Date date;

	@SuppressWarnings("deprecation")
	@RequestMapping(value="/home.htm")
    public ModelAndView handleRequest() throws ParseException {
		restTemplate = new RestTemplate();
		
		String urlAPI = "http://api.openweathermap.org/data/2.5/weather?id=3435910&units=metric&lang=es&APPID=317792e3c967ee366cb4bef73f69e6e0";
		String urlAPI2="http://api.openweathermap.org/data/2.5/forecast?id=3435910&units=metric&lang=es&APPID=317792e3c967ee366cb4bef73f69e6e0";
		
		CurrentWeather weather = restTemplate.getForObject(urlAPI, CurrentWeather.class);
		weather = parseToRealData(weather);
		
		Forecast forecast = restTemplate.getForObject(urlAPI2,Forecast.class);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("weather", weather);
        myModel.put("forecast", forecast);
        
        
        
        System.out.println(forecast.getCod());
        
        logger.info("HomeController success!");
        
    	String diaCompleto= "ups";
    	ArrayList<String> nombreDias= new ArrayList<String>();

        for (int i = 0; i < forecast.getList().size();i++) {
        	String textoDateTime = forecast.getList().get(i).getDt_txt();
        	String hora = textoDateTime.substring(11,13);
        	String dia = textoDateTime.substring(8,10);
        	String mes =textoDateTime.substring(5, 7);
        	String a�o = textoDateTime.substring(0,4) ;
//        	switch (mes){
//        	case "01":
//        		mes = "Enero";
//        		break;
//        	case "02":
//        		mes = "Feb";
//        		break;
//        	case "03":
//        		mes = "Marzo";
//        		break;
//        	case "04":
//        		mes = "Abril";
//        		break;
//        	case "05":
//        		mes = "Mayo";
//        		break;
//        	case "06":
//        		mes = "Jun";
//        		break;
//        	case "07":
//        		mes = "Jul";
//        		break;
//        	case "08":
//        		mes = "Ago";
//        		break;
//        	case "09":
//        		mes = "Sep";
//        		break;
//        	case "10":
//        		mes = "Oct";
//        		break;
//        	case "11":
//        		mes = "Nov";
//        		break;
//        	default: 
//        		mes = "Dic";
        	
        	
        	
	        
//        	}
        	diaCompleto = dia+"/"+mes+"/"+a�o;
        	date = new SimpleDateFormat("dd/MM/yyyy").parse(diaCompleto);
        	c.setTime(date);
        	switch (c.getTime().getDay()) {
        	case 1:
	        	diaCompleto= "Lunes";
	        	break;
        	case 2:
	    		diaCompleto= "Martes";
	        	break;	
        	case 3:
        		diaCompleto= "Mi�rcoles";
            	break;	
        	case 4:
        		diaCompleto= "Jueves";
            	break;	
        	case 5:
        		diaCompleto= "Viernes";
            	break;	
        	case 6:
        		diaCompleto= "S�bado";
            	break;	
        	case 7:
        		diaCompleto= "Domingo";
            	break;	
        	}
        	nombreDias.add(diaCompleto);
        	forecast.setValoresSeteadosPorMi(nombreDias);
        	
        	System.out.println("["+i+"] a�o: "+a�o +", mes: "+ mes + ", d�a: "+dia+", hora: "+ hora);
        }
        
        
        
        
        
        return new ModelAndView("home", "model", myModel);
        
        
	}
       
			
			// si la variable es el d�a de ma�ana, lo subis al array.
//			if(hour es dia de ma�ana) {
//				
//				
//				Calendar cal = Calendar.getInstance();
//		        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//		        System.out.println( sdf.format(cal.getTime()) );
//				
//				valoresRandomPosiblesDias.add(hour.getMain().getTemp());
//				
//				listo ese dia, ahora vas por el siguiente dia
//				
//			}
			
			
			
//		}
//        
//        
//        
//        
//        
//        
//        forecast.setValoresSeteadosPorMi(valoresRandomPosiblesDias);
//        
	
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
