package com.ustglobal.AccessMoodifiers.pkg2;

public class TestDemo1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		//default
		System.out.println(d.b);
		d.sub();
		//Protected
		System.out.println(d.c);
		d.mul();
		//public
		System.out.println(d.name);
		d.div();
	}

}
