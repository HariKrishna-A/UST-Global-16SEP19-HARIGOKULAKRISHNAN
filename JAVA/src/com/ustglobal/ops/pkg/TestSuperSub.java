package com.ustglobal.ops.pkg;

public class TestSuperSub {
	
	
	final void add() {
		System.out.println("add()");
	}
	
	final void add(int a) {
		System.out.println("add(int a)");
	}

	public static void main(String[] args) {

		SuperClass sp = new SuperClass();

		System.out.println("______________________________");

		SubClass sb = new SubClass();
		sb.getSbData();
		
		System.out.println("_______________________________");
		TestSuperSub t = new TestSuperSub();
		t.add();
		t.add(13);

	}

}
