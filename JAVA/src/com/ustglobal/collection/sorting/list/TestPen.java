package com.ustglobal.collection.sorting.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestPen {

	public static void main(String[] args) {
	
		ArrayList<Pen>  a = new ArrayList<Pen>();
		
		a.add(new Pen(123456, "XYZ"));
		a.add(new Pen(9123869, "ZXY"));
		a.add(new Pen(23456, "AYZ"));
		a.add(new Pen(8693456, "NYZ"));
		
		
		System.out.println("Before ......sort");
		displayPenDetails(a);
		Collections.sort(a);
		
		System.out.println("After ......sort");
		displayPenDetails(a);

	}
	
	static void displayPenDetails(ArrayList<Pen> a1) {
		
		for (Pen pen : a1) {
			System.out.println("Price is : "+pen.price);
			System.out.println("Brand is : "+ pen.brand);
		}
	}

}
