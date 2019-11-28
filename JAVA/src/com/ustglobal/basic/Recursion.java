package com.ustglobal.basic;

public class Recursion {
	
	static void recursions(int num) {
		
		if(num<10) {
			System.out.println("Number ID: "+(num++));
			recursions(++num);
			
		}
	}
	public static void main(String[] args) {
		recursions(1);
	}
}