package com.ustglobal.exception;

public class Demo {
	public static void main(String[] args) {

		int[] a = {1234};
		String  s = null;
		
		try {
			//String b = s.toLowerCase();
			System.out.println(a[10]);
			System.out.println(10/0);
			//System.out.println(b);
		} catch (ArrayIndexOutOfBoundsException  | NullPointerException  | ArithmeticException e) {
			
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
