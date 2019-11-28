package com.ustglobal.exception;

public class First {

	public static void main(String[] args) {

		
		System.out.println("______________________ArrayIndexOutOfBoundsException_______________________");
		System.out.println();
		int[] a = {12,23,34};

		System.out.println(a[2]);
		try {
			System.out.println(a[3]);
		}

		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index is NOT PRESENT");
		}

		System.out.println("______________________ArithmeticException_______________________");
		System.out.println();
		int bNum = 0;	
		try {
			bNum = 10/1;
			System.out.println(bNum);
			System.out.println("hllo");
			System.out.println("Diwali");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("______________________NullPointerException_______________________");
		System.out.println();
		
		String s = null;
		try {
			String ss = s.toUpperCase();
			System.out.println(ss);
		} catch (NullPointerException e) {
			System.out.println("Don't play with null");
		}
		

	}



}
