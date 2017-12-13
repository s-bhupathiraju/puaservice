package com.ebsco.resources.puaservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class PuaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuaServiceApplication.class, args);
	}
	
	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("com.ebsco.resources.puaservice.controller"))
	      .paths(PathSelectors.ant("/api/*"))
	      .build()
	      .apiInfo(apiInfo());
	}
	 
	private ApiInfo apiInfo() {
	     return new ApiInfo(
	       "My REST API", 
	       "Some custom description of API.", 
	       "API TOS", 
	       "Terms of service", 
	       new Contact("John Doe", "www.example.com", "myeaddress@company.com"), 
	       "License of API", "API license URL", Collections.emptyList());
	}
}
