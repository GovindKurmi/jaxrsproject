package com.gk.jersyproject;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.gk.jersyproject.controller.UserResource;

@Component
public class JerseyConfig extends ResourceConfig {
	  public JerseyConfig() 
	    {
	        register(UserResource.class);
	    }
}
