package com.ustglobal.collection.sorting.list;

import com.ustglobal.ops.pkg.Instance;

public class Laptop implements Comparable<Laptop> {

	double price;
	int ram;
	String brand;
	public Laptop(double price, int ram, String brand) {
		super();
		this.price = price;
		this.ram = ram;
		this.brand = brand;
	}
//	@Override
//	public int compareTo(Laptop l) {
//		
//		Integer i = this.ram;
//		Integer j = l.ram;
//	
//		return i.compareTo(j);
//	}
//	
//	
//	@Override
//	public int compareTo(Laptop l) {
//		String s1 = this.brand.toLowerCase();
//		String s2 = l.brand.toLowerCase();
//		return s1.compareTo(s2);
//	}
	@Override
	public int compareTo(Laptop l) {
		Double d1 = this.price;
		Double d2 = l.price;
		return d1.compareTo(d2);
	}	

	
}
