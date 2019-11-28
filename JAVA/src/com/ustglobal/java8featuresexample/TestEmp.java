package com.ustglobal.java8featuresexample;

import java.util.function.Predicate;

public class TestEmp {

	public static void main(String[] args) {
		
		Predicate<Emp> e1 = e -> e.salary>5000000;
		
		
		Emp e = new Emp(101, "ABC", 5000001);

		System.out.println(e1.test(e));
	}

}
