package com.ebsco.resources.puaservice.exception;

public class UserDoesNotExistException extends RuntimeException{
	public UserDoesNotExistException() {
	}

	public UserDoesNotExistException(String message) {
		super(message);
	}

	public UserDoesNotExistException(Throwable cause) {
		super(cause);
	}

	public UserDoesNotExistException(String message, Throwable cause) {
		super(message, cause);
	}
}
