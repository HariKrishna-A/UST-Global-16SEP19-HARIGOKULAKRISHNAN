package com.ustglobal.exception;

//////////////////////////////////////////////////not std//////////////////////////////


public class TestMultiCatch2 {

	public static void main(String[] args) {
		
		int[] a = {10,20,303,3};

		
		try {
			System.out.println(a[5]);
			System.out.println(10/2);
		}catch (ArithmeticException ae1) {
		System.out.println("no div by 0");
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("arry index not present");
		}
		
	}

}
