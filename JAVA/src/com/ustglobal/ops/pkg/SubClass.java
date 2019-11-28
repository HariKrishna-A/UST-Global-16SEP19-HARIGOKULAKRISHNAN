package com.ustglobal.ops.pkg;

public class SubClass extends SuperClass {

	String s = "Subclass varibale";
	public SubClass() {
		super();
		System.out.println("subclass ()");
	}
	
	void getSbData() {
		System.out.println(s);
		System.out.println(this.s);
		super.superClassMethod();
		System.out.println(super.s);
	}
}
