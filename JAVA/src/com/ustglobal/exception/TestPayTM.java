package com.ustglobal.exception;

public class TestPayTM {

	public static void main(String[] args) {

		System.out.println("Main Str..");
		
		PayTM p = new PayTM();
		try {
			p.book();
		} 
		catch (Exception e) {
			
			System.out.println(e);
		}
		finally {
			//closing connection
			//clean up prss
			System.out.println("finally");
		}
		System.out.println("Main End..");
	}

}
