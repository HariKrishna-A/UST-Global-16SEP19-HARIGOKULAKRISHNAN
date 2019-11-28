package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestLinkedHashMap {

	public static void main(String[] args) {
	
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		
		lh.put("Bangalore", 345678);
		lh.put("Hariyana", 455678);
		lh.put("patna", 565678);
		System.out.println(lh);
		
		Set<String> s = lh.keySet();
		
		
		for (String string : s) {
			System.out.println("Key : "+string);
		}
		
		System.out.println("------------");
		
		Collection<Integer> c = lh.values();
		
		for (Integer integer : c) {
			System.out.println("Values : "+integer);
		}
		
	}

}
