package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {

		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(12.2);
		al.add("ABC");
		al.add(true);
		al.add(null);
		al.add('A');
		
		
		ListIterator li = al.listIterator();
		
		System.out.println("______________>Forward");
		while (li.hasNext()) {
			Object ob =  li.next();
			System.out.println(ob);
		}
		
		System.out.println("_______________________backwrd");
		while(li.hasPrevious())
		{
			Object o = li.previous();
			System.out.println(o);
		}
		
	}

}
