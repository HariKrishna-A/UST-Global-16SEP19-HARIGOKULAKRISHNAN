package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestStudent {

	public static void main(String[] args) {

//		Predicate<Student> p = s -> {
//			if(s.percentage>=35) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
		
		
		
		
		Predicate<Student> p = s -> s.percentage>=35;
		
		
	
		Student s = new Student(101, "BCA", 59.43);
		
		boolean res = p.test(s);
		System.out.println("Result "+res);

	}

}
