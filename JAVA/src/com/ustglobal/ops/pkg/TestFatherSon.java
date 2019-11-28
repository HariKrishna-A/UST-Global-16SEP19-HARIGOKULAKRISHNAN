package com.ustglobal.ops.pkg;

public class TestFatherSon {

	public static void main(String[] args) {

		Father f = new Father();
		f.property();
		f.marry();
		System.out.println("_________________________________");
		
		Son s = new Son();
		s.property();
		s.marry();
		
		System.out.println("_________________________________");
		Father s1 = new Son();
		s1.property();
		s1.marry();
	}

}
