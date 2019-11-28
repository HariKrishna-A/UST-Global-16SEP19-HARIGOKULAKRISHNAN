package com.ustglobal.collection.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSetDouble {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> hs = new LinkedHashSet();
		
		hs.add(12.3);
		hs.add(12.3);
		hs.add(22.1);
		hs.add(434.7);
		hs.add(null);
		hs.add(null);
		
		
		
		System.out.println("--------->Using for each");
		
		for (Object object : hs) {
		System.out.println(object);	
		}
		
		System.out.println("----------->Using Iterator");
		
		Iterator it = hs.iterator ();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		

	}

}
