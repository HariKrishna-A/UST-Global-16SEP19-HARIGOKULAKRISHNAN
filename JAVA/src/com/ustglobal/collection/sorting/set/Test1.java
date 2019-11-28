package com.ustglobal.collection.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(12);
		hs.add(1);
		hs.add("deepa");
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
