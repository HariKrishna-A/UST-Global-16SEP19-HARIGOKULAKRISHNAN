package com.ustglobal.lambdaexpression;

public class TestFactorial {

	public static void main(String[] args) {
	
		
		FactorialInterface fi = (a) -> {
			int fact = 1;
			for(int i=2; i<=a; i++) {
				fact = fact*i;
			}
			return fact;
		};

	}

}
