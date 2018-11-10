package com.quemepongo.springapp.web.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {
	public CoordWeather coord;
	public ArrayList<Weather> weather;
	public String base;
	public MainWeather main;
	public String visibility;
	public WindWeather wind;
	public CloudsWeather clouds;
	public int dt;
	public SysWeather sys;
	public int id;
	public String name;
	public int cod;
	
	public CoordWeather getCoord() {
		return coord;
	}
	public ArrayList<Weather> getWeather() {
		return weather;
	}
	public String getBase() {
		return base;
	}
	public MainWeather getMain() {
		return main;
	}
	public String getVisibility() {
		return visibility;
	}
	public WindWeather getWind() {
		return wind;
	}
	public CloudsWeather getClouds() {
		return clouds;
	}
	public int getDt() {
		return dt;
	}
	public SysWeather getSys() {
		return sys;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getCod() {
		return cod;
	}
	public void setCoord(CoordWeather coord) {
		this.coord = coord;
	}
	public void setWeather(ArrayList<Weather> weather) {
		this.weather = weather;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public void setMain(MainWeather main) {
		this.main = main;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public void setWind(WindWeather wind) {
		this.wind = wind;
	}
	public void setClouds(CloudsWeather clouds) {
		this.clouds = clouds;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public void setSys(SysWeather sys) {
		this.sys = sys;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
}

@JsonIgnoreProperties(ignoreUnknown = true)
class CoordWeather{
	public double lon;
	public double lat;
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Weather{
	public int id;
	public String main;
	public String description;
	public String icon;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
}

@JsonIgnoreProperties(ignoreUnknown = true)
class MainWeather {
	public double temp;
	public double pressure;
	public double humidity;
	public double temp_min;
	public double temp_max;
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
}

@JsonIgnoreProperties(ignoreUnknown = true)
class WindWeather{
	public double speed;
	public double deg;
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDeg() {
		return deg;
	}
	public void setDeg(double deg) {
		this.deg = deg;
	}
}

@JsonIgnoreProperties(ignoreUnknown = true)
class CloudsWeather{
	public int all;

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}
}

@JsonIgnoreProperties(ignoreUnknown = true)
class SysWeather{
	public int type;
	public int id;
	public double message;
	public String country;
	public int sunrise;
	public int sunset;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMessage() {
		return message;
	}
	public void setMessage(double message) {
		this.message = message;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSunrise() {
		return sunrise;
	}
	public void setSunrise(int sunrise) {
		this.sunrise = sunrise;
	}
	public int getSunset() {
		return sunset;
	}
	public void setSunset(int sunset) {
		this.sunset = sunset;
	}
}