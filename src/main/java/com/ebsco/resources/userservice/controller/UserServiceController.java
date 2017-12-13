package com.ebsco.resources.userservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {

	@RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> getUserName() {
		return new ResponseEntity<String>("hello", HttpStatus.OK);
	}

}
