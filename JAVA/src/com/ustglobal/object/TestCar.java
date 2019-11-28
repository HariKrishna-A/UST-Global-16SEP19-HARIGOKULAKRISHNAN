package com.ustglobal.object;

public class TestCar {

	public static void main(String[] args) {
	
		Car c = new Car(1143000, "Audi", "Red");
		System.out.println("Cost : "+c.hashCode());
		System.out.println(c.toString());
		
		Car c1 = new Car(1657000, "BMW", "Red");
		System.out.println("Cost : "+c1.hashCode());
		System.out.println(c1.toString());
		
		Car c2 = new Car(1356000, "Hundai", "Red");
		System.out.println("Cost : "+c2.hashCode());
		System.out.println(c2.toString());
		
	}

}
