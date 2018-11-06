package com.quemepongo.springapp.business.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ChangeEmail {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private String email;

    public void setEmail(String email) {
    	this.email = email;
    	logger.info("Email Set to " + email);
    }

    public String getEmail() {
        return email;
    }
}
