package com.ebsco.resources.puaservice.model.builders;

import com.ebsco.resources.puaservice.model.User;

public class UserBuilder {

	private String email;

	private String firstName;

	private String institution;

	private Boolean isEmailAccount;

	private Boolean isEmailVerified;

	private String lastName;

	private Integer loginStatus;

	private String profileId;

	private Integer puaid;

	private String role;

	private String specialty;

	private String userName;


	public User build() {
		User user = new User();
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setInstitution(institution);
		user.setIsEmailAccount(isEmailAccount);
		user.setIsEmailVerified(isEmailVerified);
		user.setLastName(lastName);
		user.setLoginStatus(loginStatus);
		user.setProfileId(profileId);
		user.setPuaid(puaid);
		user.setRole(role);
		user.setSpecialty(specialty);
		user.setUserName(userName);
		return user;
	}

	public UserBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public UserBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserBuilder setInstitution(String institution) {
		this.institution = institution;
		return this;
	}

	public UserBuilder setIsEmailAccount(Boolean isEmailAccount) {
		this.isEmailAccount = isEmailAccount;
		return this;
	}

	public UserBuilder setIsEmailVerified(Boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
		return this;
	}

	public UserBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder setLoginStatus(Integer loginStatus) {
		this.loginStatus = loginStatus;
		return this;
	}

	public UserBuilder setProfileId(String profileId) {
		this.profileId = profileId;
		return this;
	}

	public UserBuilder setPuaid(Integer puaid) {
		this.puaid = puaid;
		return this;
	}

	public UserBuilder setRole(String role) {
		this.role = role;
		return this;
	}

	public UserBuilder setSpecialty(String specialty) {
		this.specialty = specialty;
		return this;
	}

	public UserBuilder setUserName(String userName) {
		this.userName = userName;
		return this;
	}

}