package com.ustglobal.java8featuresexample;

import java.util.function.Predicate;

public class TestCar {

	public static void main(String[] args) {
		
		Predicate<Car> c1 = i -> i.amount>900000;
		
		Car c = new Car("BMW", 856421);
		
		System.out.println(c1.test(c));

	}

}
