package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {

		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(12.2);
		al.add("ABC");
		al.add(true);
		al.add(null);
		al.add('A');
		
		System.out.println("___________________________FOR LOOP______________________________");
		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}
		System.out.println("___________________________FOR EACH______________________________");
		for (Object object : al) {
			System.out.println(object);
		}
		
		System.out.println("___________________________ITREATOR______________________________");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o);
		}
		
	}

}
