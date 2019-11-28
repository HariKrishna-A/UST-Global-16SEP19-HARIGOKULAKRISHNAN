package com.ustglobal.exception;

public class TestgeneralCatch {

	public static void main(String[] args) {


		int[] a = {22,234,56,34};

		try {
			System.out.println(a[1]);
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
