package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<Student> c = s -> {
			System.out.println(s);
		};


		Student sObj = new Student(11, "ABC", 22.1);
		c.accept(sObj);
	}
}
