package com.ustglobal.collection.sorting.list;

public class Pen implements Comparable<Pen> {

	double price;
	String brand;
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public int compareTo(Pen s) {
		return this.brand.compareTo(s.brand);
	}
	
	
}
