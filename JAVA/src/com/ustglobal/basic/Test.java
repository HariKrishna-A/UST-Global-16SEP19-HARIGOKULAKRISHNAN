package com.ustglobal.basic;

public class Test {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.write();
		
		p.cost = 100;
		p.color = "black";
		p.brand = "cello";
		
		System.out.println("Cost is = "+p.cost);
		System.out.println("Color is = "+p.color);
		System.out.println("Brand is = "+p.brand);
		
		System.out.println("--------------VAN-------------------");
		
		Van v = new Van();
		v.move();
		
		v.cost = 50000;
		v.color = "Red";
		
		System.out.println("Cost is = "+v.cost);
		System.out.println("Color is = "+v.color);
		
		Van v1 = new Van();
		v1.move();
		
		v1.cost = 70000;
		v1.color = "Blue";
		
		System.out.println("Cost is = "+v1.cost);
		System.out.println("Color is = "+v1.color);
		
	}
}
