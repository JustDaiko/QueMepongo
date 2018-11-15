package com.quemepongo.springapp.business.services;


public interface IPreferenciasManager {
	boolean setPrefencias(int idUsuario, double frio_maxima, double calor_minima, double factor_de_correccion, boolean paraguas, boolean protector);
	
}
