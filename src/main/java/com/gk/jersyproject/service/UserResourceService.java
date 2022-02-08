package com.gk.jersyproject.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gk.jersyproject.model.Login;

@Service
public class UserResourceService {
	@Autowired
	RestTemplate restTemplate;
	private final String URI_USERS_ID = "http://localhost:8082/api/login/{id}";
	private static final Logger LOGGER = Logger.getLogger(UserResourceService.class.getCanonicalName());

	public ResponseEntity<Login> getLogin(int id) {
		LOGGER.log(Level.INFO, () -> String.format("id :  %s", id));
		ResponseEntity<Login> responseEntity = restTemplate.getForEntity(URI_USERS_ID, Login.class, id);
		return responseEntity;
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
