package com.ustglobal.collection.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(12);
		ts.add(11);
		ts.add(1);
		ts.add(12);
//		ts.add("BC"); ClassCastException
//		ts.add(null); NullPointerExcetion
	
		
		
		
		System.out.println("--------->Using for each");
		
		for (Object object : ts) {
		System.out.println(object);	
		}
		
		System.out.println("----------->Using Iterator");
		
		Iterator it = ts.iterator ();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		

	}

}
