package com.ustglobal.lambdaexpression;

public class TestMultiply {

	public static void main(String[] args) {
		
		MultiplyInterface m = (a,b)->a*b;
		int p = m.mul(20,30);
		System.out.println("Product of A nd B : "+p);
	};

}
