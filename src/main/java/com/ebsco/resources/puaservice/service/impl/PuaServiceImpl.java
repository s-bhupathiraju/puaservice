package com.ebsco.resources.puaservice.service.impl;

import org.springframework.stereotype.Service;

import com.ebsco.resources.puaservice.exception.UserDoesNotExistException;
import com.ebsco.resources.puaservice.model.User;
import com.ebsco.resources.puaservice.model.builders.UserBuilder;
import com.ebsco.resources.puaservice.service.PuaService;

@Service
public class PuaServiceImpl implements PuaService{

	@Override
	public User retrieveUserAfterAuthentication(String username, String password){
		if(username.equals("sbhupathiraju@ebsco.com") && password.equals("secret1!")) {
			return new UserBuilder()
					.setEmail("sbhupathiraju@ebsco.com")
					.setFirstName("Sanjay")
					.setLastName("Bhupathiraju")
					.setInstitution("Penn Medicine")
					.setLoginStatus(0)
					.setProfileId("")
					.setRole("Doctor")
					.setSpecialty("Cardiology")
					.setUserName("sbhupathiraju@ebsco.com")
					.setIsEmailAccount(true)
					.setIsEmailVerified(false)
					.setPuaid(8259024)
					.build();
		}else {
			throw new UserDoesNotExistException("Invalid user or credentials");
		}
	}
}
