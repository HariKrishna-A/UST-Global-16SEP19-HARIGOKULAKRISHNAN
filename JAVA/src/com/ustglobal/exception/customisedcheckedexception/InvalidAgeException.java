package com.ustglobal.exception.customisedcheckedexception;

public class InvalidAgeException extends RuntimeException {


		
		String message = "Invalid age below 18years not allowed";	
	
	
public InvalidAgeException() {
	
}
public InvalidAgeException(String message) {
	this.message = message;
}
	@Override
	public String getMessage() {

		return super.getMessage();
	}

}
