package com.ebsco.resources.puaservice.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class User {

	
	@JsonProperty("email")
	private String email;
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("institution")
	private String institution;
	@JsonProperty("isEmailAccount")
	private Boolean isEmailAccount;
	@JsonProperty("isEmailVerified")
	private Boolean isEmailVerified;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("loginStatus")
	private Integer loginStatus;
	@JsonProperty("profileId")
	private String profileId;
	@JsonProperty("puaid")
	private Integer puaid;
	@JsonProperty("role")
	private String role;
	@JsonProperty("specialty")
	private String specialty;
	@JsonProperty("userName")
	private String userName;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public Boolean getIsEmailAccount() {
		return isEmailAccount;
	}
	public void setIsEmailAccount(Boolean isEmailAccount) {
		this.isEmailAccount = isEmailAccount;
	}
	public Boolean getIsEmailVerified() {
		return isEmailVerified;
	}
	public void setIsEmailVerified(Boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(Integer loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public Integer getPuaid() {
		return puaid;
	}
	public void setPuaid(Integer puaid) {
		this.puaid = puaid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}