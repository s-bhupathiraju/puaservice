package com.ebsco.resources.puaservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ebsco.resources.puaservice.model.User;
import com.ebsco.resources.puaservice.model.DTO.UserDTO;
import com.ebsco.resources.puaservice.service.PuaService;

@RestController
@RequestMapping("/api")
public class PuaServiceController {

	@Autowired
	private PuaService puaService;
	
	public PuaServiceController(PuaService puaService) {
		this.puaService = puaService;
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<User> getUserName(@RequestBody UserDTO userDTO) {
		return new ResponseEntity<User>(puaService.retrieveUserAfterAuthentication(userDTO.getUsername(), userDTO.getPassword()), HttpStatus.OK);
	}

}
