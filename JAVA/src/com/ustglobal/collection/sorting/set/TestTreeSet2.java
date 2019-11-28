package com.ustglobal.collection.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("BCD");
		ts.add("ABCDE");
		ts.add("XYZ");
		ts.add("ZYX");
		
		System.out.println("--------->Using for each");
		
		for (Object object : ts) {
		System.out.println(object);	
		}
		
		System.out.println("----------->Using Iterator");
		
		Iterator<String> it = ts.iterator ();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		

	}

}
