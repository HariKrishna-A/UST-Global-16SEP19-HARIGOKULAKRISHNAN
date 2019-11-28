package com.ustglobal.exception.customisedcheckedexception;

public class TestCCE {

	public static void main(String[] args) {
		
		
		System.out.println("Main Str..");
		
		Validator v = new Validator();
		try {
			v.verify(13);
		} catch (Exception e) {
		System.out.println("Ex..");
		}
		System.out.println("Main End..");

	}

}
