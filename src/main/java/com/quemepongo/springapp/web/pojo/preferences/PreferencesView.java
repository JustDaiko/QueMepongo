package com.quemepongo.springapp.web.pojo.preferences;

public class PreferencesView {
	private String temp_min, temp_max;
	private boolean paraguas, prrotector;
	
	public String getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}
	public String getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(String temp_max) {
		this.temp_max = temp_max;
	}
	public boolean isParaguas() {
		return paraguas;
	}
	public void setParaguas(boolean paraguas) {
		this.paraguas = paraguas;
	}
	public boolean isPrrotector() {
		return prrotector;
	}
	public void setPrrotector(boolean prrotector) {
		this.prrotector = prrotector;
	}
	
}
