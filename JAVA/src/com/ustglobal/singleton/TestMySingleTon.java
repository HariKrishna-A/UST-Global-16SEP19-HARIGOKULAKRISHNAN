package com.ustglobal.singleton;

public class TestMySingleTon {

	public static void main(String[] args) {
		String s = "Heloo";

		MySingleTon ms = MySingleTon.getDbConnection();
		
		ms.s = "Hello";
		System.out.println(ms.s+" "+ms.s);
		MySingleTon ms1 = MySingleTon.getDbConnection();
		ms1.s = "Hello1";
		System.out.println(ms.hashCode());
		System.out.println(ms1.hashCode());
		

	}

}
