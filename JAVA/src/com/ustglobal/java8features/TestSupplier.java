package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		
		
		Supplier<Student> s = () -> new Student(101, "ABC", 10.0);
		
		
		System.out.println(s.get().id);
		System.out.println(s.get().name);
		System.out.println(s.get().percentage);
		
		System.out.println("---------------->Integer");
		
		Supplier<Integer> i = () -> 18;
		System.out.println(i.get());
		
		System.out.println("---------------->String");
		Supplier<String> str = () -> "Hello";
		System.out.println(str.get());
	}

}
