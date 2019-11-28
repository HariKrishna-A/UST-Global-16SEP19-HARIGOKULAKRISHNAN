package com.ustglobal.wrapperclasses;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a  = 10;
		System.out.println("A is "+a);
		Integer i = a;
		System.out.println("I is "+a);   //Auto-boxing OR Boxing

		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("X is "+x);

		int y = x;       //Unboxing OR Auto UnBoxing
		System.out.println("Y is "+y);
		
		int n = Integer.parseInt("143");
		System.out.println("Value id "+n);
		int c = n + n;
		System.out.println("C is "+c);
		
		boolean b =  Boolean.parseBoolean("true");
		System.out.println("Result is "+b);
	}

}
