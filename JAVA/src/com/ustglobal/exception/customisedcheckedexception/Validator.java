package com.ustglobal.exception.customisedcheckedexception;

public class Validator {
	
	
	void verify(int age) {
		if(age < 18) {
			
			throw new InvalidAgeException("Try again");
		}
	}

}
