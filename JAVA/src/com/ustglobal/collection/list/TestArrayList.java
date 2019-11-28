package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
	
		
		ArrayList< String> al = new ArrayList<String>();
		al.add("ABCD");
		al.add("BCD");
		al.add("ABCDS");

		
		System.out.println("Before sort----> "+al);
		Collections.sort(al);
		System.out.println("After sort----> "+al);
	}

}
