package com.ustglobal.collection.list;

import java.util.ArrayList;

public class TestUpDown {

	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("shreya");
		
		
		Object o = a.get(0);
		String name = (String)o; 
		
		name = name.toUpperCase();
		System.out.println(name);
		

	}

}
