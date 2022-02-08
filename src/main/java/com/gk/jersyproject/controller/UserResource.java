package com.gk.jersyproject.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.gk.jersyproject.model.Login;
import com.gk.jersyproject.service.UserResourceService;

@Path("/users")
public class UserResource {

	@Autowired
	private UserResourceService userResourceService;

	@GET
	@Path("/getuser/{id}")
	@Produces("application/json")
	public ResponseEntity<Login> getAllUsers(@PathParam(value = "id") int id) {
		return userResourceService.getLogin(id);
	}
}
