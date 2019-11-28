package com.ustglobal.AccessMoodifiers.pkg2;


class A{
	private void m1() {
		System.out.println("A");
	}
}

class B extends A{
	void m1() {
		System.out.println("B");
	}
}


public class Privatemethod {

	public static void main(String[] args) {
		
		B b = new B();
		b.m1();

	}

}
