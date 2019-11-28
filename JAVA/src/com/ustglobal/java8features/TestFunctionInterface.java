package com.ustglobal.java8features;

import java.util.function.Function;

public class TestFunctionInterface {

	public static void main(String[] args) {
	
		
		Function<Integer, Integer> f = i -> i*i;

		int result = f.apply(10);
		System.out.println("Square of 10 : "+result);
		
		int result1 = f.apply(15);
		System.out.println("Square of 15 : "+result1);
	}

}
