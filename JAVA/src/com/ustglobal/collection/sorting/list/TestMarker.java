package com.ustglobal.collection.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {

	public static void main(String[] args) {

		
		ArrayList<Marker> al = new ArrayList<Marker>();
		
		al.add(new Marker(13, "Black"));
		al.add(new Marker(43, "Red"));
		al.add(new Marker(53, "Yellow"));
		al.add(new Marker(12, "Green"));
		
		System.out.println("Before ......sort");
		displayMarkerDetails(al);
		
//		SortByPrice sb = new SortByPrice();
//		Collections.sort(al,sb);
		
		SortByColor sc = new SortByColor();
		Collections.sort(al,sc);
		System.out.println("After ......sort");
		displayMarkerDetails(al);

	}
	
	static void displayMarkerDetails(ArrayList<Marker> a) {
		
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("Price is "+ m.price);
			System.out.println("Color is "+ m.color);
		}
	}

}
