package com.quemepongo.springapp.web.pojo.forecast;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

	private int cod;
	private Double message;
	private int cnt;
	private ArrayList<List> list;
	private City city;
	private ArrayList<String> valoresSeteadosPorMi;
	
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
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public ArrayList<String> getValoresSeteadosPorMi() {
		return valoresSeteadosPorMi;
	}
	public void setValoresSeteadosPorMi(ArrayList<String> valoresSeteadosPorMi) {
		this.valoresSeteadosPorMi = valoresSeteadosPorMi;
	}
	public ArrayList<List> getList() {
		return list;
	}
	public void setList(ArrayList<List> list) {
		this.list = list;
	}
	
}
