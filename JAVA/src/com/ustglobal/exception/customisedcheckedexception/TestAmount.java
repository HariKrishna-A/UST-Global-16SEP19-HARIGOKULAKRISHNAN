package com.ustglobal.exception.customisedcheckedexception;

public class TestAmount {

	public static void main(String[] args) {

		
		System.out.println("str..");

		ValidateAmount va = new ValidateAmount();
		try {
		
			va.checkAmount(50000);
	        System.out.println("your cash");
		} catch (InvalidAmountException e) {
		
			System.out.println(e.getMessage());
		}
		
		System.out.println("end..");
	}

}
