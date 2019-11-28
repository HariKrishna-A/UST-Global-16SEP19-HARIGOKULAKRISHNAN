package com.ustglobal.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
	
		
		LinkedList li = new LinkedList();

		li.add(12);
		li.add(12.2);
		li.add("ABC");
		li.add(true);
		li.add(null);
		li.add('A');
		
		
		System.out.println("________________________forLoop___________________");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println("________________________forEachLoop___________________");
		
		for (Object object : li) {
			System.out.println(object);
		}
		System.out.println("________________________Iterator___________________");
		Iterator it = li.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("________________________list Iterator___________________");
		
		ListIterator lii = li.listIterator();
		
		System.out.println("______________>Forward");
		while (lii.hasNext()) {
			Object ob =  lii.next();
			System.out.println(ob);
		}
		
		System.out.println("_______________________backwrd");
		while(lii.hasPrevious())
		{
			Object o = lii.previous();
			System.out.println(o);
		}
		
		System.out.println("________________________Iterator F___________________");
		Iterator itt = li.iterator();
		
		while (itt.hasNext()) {
			System.out.println(itt.next());
		}

	}

}
