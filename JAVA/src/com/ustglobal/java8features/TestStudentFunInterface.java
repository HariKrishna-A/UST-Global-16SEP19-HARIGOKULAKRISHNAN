package com.ustglobal.java8features;

import java.util.function.Function;

public class TestStudentFunInterface {

	public static void main(String[] args) {
	
		
		Function<Integer, Student> s = i -> {
			Student s1 = new Student(22, "ABC", 88.9);
			s1.id = i;
			return s1;
		};
		
		System.out.println(s.apply(20).id);
		System.out.println(s.apply(20).name);
		

	}



	
	

}
