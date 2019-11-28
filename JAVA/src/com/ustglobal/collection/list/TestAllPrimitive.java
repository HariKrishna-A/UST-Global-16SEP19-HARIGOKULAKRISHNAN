package com.ustglobal.collection.list;

public class TestAllPrimitive {

	public static void main(String[] args) {
		
		Object[] o = {2,20,20000,2000000000,20.00000f,2.0000000,'c',"string"};
		
		System.out.println("                   FOR                         ");
		
		for (int i = 0; i < o.length; i++) {
			
			System.out.println("Object of "+ i +" : "+ o[i]);
		}
		
		System.out.println("                   FOREACH                         ");
		for (Object object : o) {
			System.out.println(object);
		}
	}

}
