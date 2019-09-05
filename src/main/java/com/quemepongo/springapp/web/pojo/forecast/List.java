package com.quemepongo.springapp.web.pojo.forecast;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.quemepongo.springapp.web.pojo.current.CloudsWeather;
import com.quemepongo.springapp.web.pojo.current.MainWeather;
import com.quemepongo.springapp.web.pojo.current.SysWeather;
import com.quemepongo.springapp.web.pojo.current.Weather;
import com.quemepongo.springapp.web.pojo.current.WindWeather;

@JsonIgnoreProperties(ignoreUnknown = true)
public class List {
	private int dt;
	private MainWeather main;
	private ArrayList<Weather> weather;
	private CloudsWeather clouds;	
	private WindWeather wind;
	private Sys sys;
	private String dt_txt;
	
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public MainWeather getMain() {
		return main;
	}
	public void setMain(MainWeather main) {
		this.main = main;
	}
	public ArrayList<Weather> getWeather() {
		return weather;
	}
	public void setWeather(ArrayList<Weather> weather) {
		this.weather = weather;
	}
	public CloudsWeather getClouds() {
		return clouds;
	}
	public void setClouds(CloudsWeather clouds) {
		this.clouds = clouds;
	}
	public WindWeather getWind() {
		return wind;
	}
	public void setWind(WindWeather wind) {
		this.wind = wind;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public String getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
	
	
	

}
