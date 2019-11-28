package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestLinkedHashMap2 {

	public static void main(String[] args) {
	
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		
		lh.put("Bangalore", 345678);
		lh.put("Hariyana", 455678);
		lh.put("patna", 565678);
		
		
		for (Map.Entry<String, Integer> m : lh.entrySet()) {
			
			System.out.println(m);
			System.out.println("---------------");
			System.out.println(m.getKey());
			System.out.println("---------------");
			System.out.println(m.getValue());
			System.out.println("---------------");
			System.out.println(m.getClass());
			System.out.println("---------------");
		}
		
	}

}
