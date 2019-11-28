package com.ustglobal.ops.pkg;

public class Overloading {

	final static int add(int a, int b) {
		System.out.print("a+b = ");
		return a+b;
	}
	
	public static float add(int a, float b) {
		System.out.print("a+b = ");
		return a+b;
	}
	public double add(double a, int b) {
		System.out.print("a+b = ");
		return a+b;
	}
	
	public static void main() {
		System.out.println("Main()");
	}
	
	public static void main(String[] args) {
		System.out.println(add(20,30));
		System.out.println(add(20,3.01f));
		Overloading o = new Overloading();
		System.out.println(o.add(20.01,30));
		main();
	}
	
}
