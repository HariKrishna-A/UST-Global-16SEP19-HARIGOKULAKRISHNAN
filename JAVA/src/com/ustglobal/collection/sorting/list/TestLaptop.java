package com.ustglobal.collection.sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLaptop {

	public static void main(String[] args) {
	
		LinkedList<Laptop> li = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(2500000, 4, "Sony");
		Laptop lp2 = new Laptop(230000, 5, "Hp");
		Laptop lp3 = new Laptop(4500000, 3, "Dell");
		
		
		
		li.add(lp1);
		li.add(lp2);
		li.add(lp3);
		
		
		li.add(new Laptop(20000, 3, "Sony"));
		
	
		displayLaptopDetails(li);

	}
	
	static void displayLaptopDetails(LinkedList<Laptop > l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("Brand is : "+lp.brand);
			System.out.println("Ram is : "+lp.ram);
			System.out.println("Price is : "+lp.price);
		}
	}

}
