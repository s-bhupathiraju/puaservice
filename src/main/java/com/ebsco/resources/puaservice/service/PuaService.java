package com.ebsco.resources.puaservice.service;

import com.ebsco.resources.puaservice.model.User;

public interface PuaService {
	public User retrieveUserAfterAuthentication(String username, String password);
}
