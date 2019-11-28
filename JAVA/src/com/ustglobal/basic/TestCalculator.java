package com.ustglobal.basic;

public class TestCalculator {

	public static void main(String[] args) {
	Calculator c	= new Calculator();
	
	c.add();
	c.mul();
	
	System.out.println("--------------------------------------------------------");
	
	SciCalculator sc = new SciCalculator();

	sc.sin();
	sc.cos();
	sc.add();
	sc.mul();
	}

}
