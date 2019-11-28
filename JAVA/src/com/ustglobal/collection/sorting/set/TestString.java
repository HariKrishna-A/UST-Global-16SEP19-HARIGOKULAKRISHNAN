package com.ustglobal.collection.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestString {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Vijay");
		hs.add("Ajay");
		hs.add("deepa");
		hs.add(null);
		
		
		
		System.out.println("--------->Using for each");
		
		for (Object object : hs) {
		System.out.println(object);	
		}
		
		System.out.println("----------->Using Iterator");
		
		Iterator<String> it = hs.iterator ();
			while(it.hasNext()) {
				System.out.println(it.next());
			}

	}

}
