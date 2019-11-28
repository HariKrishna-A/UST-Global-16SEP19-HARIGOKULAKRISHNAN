package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		hm.put("kuku", 987456);
		hm.put("bala", 776456);
		hm.put("mala", 873456);
		hm.put(null,2125);
		hm.put(null,25);
		
		System.out.println("Data : "+hm);
		
		hm.put("bala", 976456);
		System.out.println("After ADD Same Key : "+hm);

		hm.put("bala1", 976456);
		System.out.println("After ADD Same value : "+hm);

		System.out.println("------------------------");
		
		Object Phneno  = hm.get("sheela");
		System.out.println("Value : "+Phneno);
		
		System.out.println("------------------------");
		
		Object value = hm.remove("kuku");
		System.out.println("Removed Value : "+value);
		
		System.out.println("------------------------");
		
		System.out.println("After removed : "+hm);
	}
}
