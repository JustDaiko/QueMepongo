package com.quemepongo.springapp.web.pojo.forecast;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.quemepongo.springapp.web.pojo.forecast.atributos.City;
import com.quemepongo.springapp.web.pojo.forecast.atributos.HourForecast;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

	private int cod;
	private Double message;
	private int cnt;
	private ArrayList<HourForecast> hourForecast;
	private City city;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Double getMessage() {
		return message;
	}
	public void setMessage(Double message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public ArrayList<HourForecast> getHourForecast() {
		return hourForecast;
	}
	public void setHourForecast(ArrayList<HourForecast> hourForecast) {
		this.hourForecast = hourForecast;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
}
