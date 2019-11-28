
package com.ustglobal.array;
import java.util.Scanner;

public class TestA {

	public static void main(String[] args) {

		int[] nums = new int[2];
		nums[0] = 10;
		nums[1] = 11;

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("________________________________________");
		char[] ch = {'A','B'};
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("________________________________________");

		boolean[] b = {true,false,true,false,false,true,true,false};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}


		double[] d = {22.3,4444.5,23425.4,3.432423423,55.55};

		for (double e : d) {
			System.out.println(e);
		}
		System.out.println("________________________________________");
		byte[] b1 = {2,3,4,5,6,7,8,9};

		for (byte c : b1) {
			System.out.println(c);
		}



		System.out.println("________________________________________");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size : ");
		int size = sc.nextInt();
		System.out.println("Enter a value : ");
		int[] no = new int[size];

		for( int ii = 0; ii<size; ii++)
		{
			no[ii] = sc.nextInt();
		}

		for (int iii : no) {
			System.out.println(iii);
		}

	}

}
