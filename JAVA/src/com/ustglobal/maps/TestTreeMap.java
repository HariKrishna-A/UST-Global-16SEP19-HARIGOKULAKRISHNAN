package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
	
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		
		lh.put("patna", 565678);
		lh.put("Bangalore", 345678);
		lh.put("Hariyana", 455678);
		
//		lh.put(null, 565678); NullPointerExcetion
		
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
