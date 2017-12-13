package com.ebsco.resources.puaservice.exception.handler;

import java.util.Calendar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ebsco.resources.puaservice.exception.UserDoesNotExistException;
import com.ebsco.resources.puaservice.exception.detail.ErrorDetail;


@ControllerAdvice
public class RestExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

	@ExceptionHandler(UserDoesNotExistException.class)
	public ResponseEntity<ErrorDetail> handleNotFoundException(UserDoesNotExistException rse) {
		Long now = Calendar.getInstance().getTimeInMillis();
		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setTimestamp(now);
		errorDetail.setStatus(HttpStatus.UNAUTHORIZED.value());
		errorDetail.setTitle("Not Found Exception");
		errorDetail.setDetail(rse.getMessage());
		errorDetail.setDeveloperMessage(rse.getClass().getName());
		LOGGER.error("Not Found Exception returning to client:ErrorDetail[{}]:Status[{}]", errorDetail,
				HttpStatus.UNAUTHORIZED.value());

		return new ResponseEntity<>(errorDetail, HttpStatus.UNAUTHORIZED);
	}
	
	
	
}