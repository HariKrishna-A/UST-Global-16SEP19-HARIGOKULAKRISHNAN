package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {


		HashMap hm = new HashMap();

		hm.put("kuku", 987456);
		hm.put("bala", 776456);
		hm.put("mala", 873456);

		HashMap hm1 = new HashMap();

		hm1.put("deepu", 569456);
		hm1.put("riya", 567456);
		hm1.put("kriti", 12543456);
		
		
		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has Key : "+hasKey);
		System.out.println("---------------");
		
		boolean hasValue = hm.containsValue(987456);
		System.out.println("Has Value : "+ hasValue);
		
		System.out.println("---------------");
		
		hm.putAll(hm1);
		
		System.out.println("After put all : "+ hm);
		
		System.out.println("---------------");
		
		System.out.println("size of hm : "+hm.size());
		
		System.out.println("---------------");
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty R or NOT : "+isEmpty);
		
		System.out.println("---------------");
		
		hm1.clear();
		System.out.println("After Clear : "+hm1);
		
		
		
	}

}
