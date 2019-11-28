package com.ustglobal.exception;
                       ////////////////////cmpnySd////////////////////////////
public class TestMultiCatch {

	public static void main(String[] args) {
		
		int[] a = {10,20,303,3};

		
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException ae1) 
		{
		System.out.println("no div by 0");
		}
		
		
		try {
			System.out.println(a[5]);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("arry index not present");
		}
		
	}

}
