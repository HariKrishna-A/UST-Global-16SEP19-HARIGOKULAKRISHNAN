package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestMethod {

	public static void main(String[] args) {
		
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(22.1);
		al.add(29.9);
		al.add(99.0);
		al.add(99.0);
		al.add(null);
		al.add(null);
		
		System.out.println(al);

		al.add(3, 54.6);
		System.out.println("After add in 3rd index"+al);
		al.remove(0);
		System.out.println("After removing 0th index"+al);
		al.remove(null);
		System.out.println("After removing null"+al);
		Double val = al.get(4);
		System.out.println("Obj at 4th index"+val);
		al.set(2, 77.6);
		System.out.println("After replacing 2nd index"+al);
		al.clear();
		System.out.println("After clear method"+al);
		al.contains(54.6);
		
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.2);
		al1.add(22.3);
		al1.add(33.4);
		
		al.addAll(al1);
		System.out.println("After add all "+al1 );
		
		boolean contain = al.containsAll(al1);
		System.out.println(contain);
		
		boolean res = al.removeAll(al1);
		System.out.println(res);

	}

}
