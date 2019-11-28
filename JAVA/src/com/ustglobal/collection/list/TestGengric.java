package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestGengric {

	public static void main(String[] args) {
	
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("anupuma");
		al.add("divya");
		al.add("sunitha");
		
		
		String name = al.get(0);
		System.out.println(name.toUpperCase());

		Iterator<String> li = al.iterator();
		
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
		}
		
		
		ListIterator<String> lii = al.listIterator();
		
		

	}

}
