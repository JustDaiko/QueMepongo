package com.quemepongo.springapp.business;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.quemepongo.springapp.business.entities.Usuario;
import com.quemepongo.springapp.business.services.SimpleUserManager;
import com.quemepongo.springapp.business.services.UsuarioManager;

@Configuration
@ComponentScan
public class SpringappBusinessConfig {

    @Bean
    public UsuarioManager loadUsuarioManager() {
        SimpleUserManager simpleProductManager = new SimpleUserManager();
        
        ArrayList<Usuario> products = new ArrayList<Usuario>();
        
        Usuario product = new Usuario();
        product.setEmail("ola@gg.com");
        product.setUser("Gaston");
        products.add(product);
        
        product = new Usuario();
        product.setEmail("ol2a@gg.com");
        product.setUser("Diego gay");
        products.add(product);
        
        simpleProductManager.setUsers(products);
        
        return simpleProductManager;
    }
}
