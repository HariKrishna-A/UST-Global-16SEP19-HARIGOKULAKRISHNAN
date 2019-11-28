package com.ustglobal.array;

public class TestB {

	public static void main(String[] args) {
		int[] num = {34,25,34,27,88};

		receive(num);
		System.out.println("_________________________________");
		int[] v = getIntArry();

		for (int i : v) {
			System.out.println(i);
		}
		System.out.println("_________________________________");
		String[] s = getStringArry();

		for (String string : s) {
			System.out.println(string);
		}

	}

	static void receive(int[] number) {

		for (int i : number) {
			System.out.println(i);
		}
	}

	static int[] getIntArry() {

		int[] values = {1,2,3,4,4,3,2,1};

		return values;
	}

	static String[] getStringArry() {

		String[] str = {"sdfgh","sdfghjk","sdrtfyhuj","edrtfvyghbknjm"};

		return str;
	}

}
