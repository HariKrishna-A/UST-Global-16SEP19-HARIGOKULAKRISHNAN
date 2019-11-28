package com.ustglobal.typeCasting;

public class TestPrimitive {


	public static void main(String[] args) {
		byte a = 10;
		int b = a;    //Implicit casting
		System.out.println("B is "+b);

		int p = 20;
		double q = p;
		System.out.println("Q is "+q);
		System.out.println("____________________________");

		double x = 20.43;
		int y = (int) x;
		System.out.println("y is "+y);
		System.out.println((char)x);
	}


}
