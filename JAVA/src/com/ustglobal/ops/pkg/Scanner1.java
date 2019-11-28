package com.ustglobal.ops.pkg;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Enter Name : ");
		String s = sc.next();
		System.out.println("Enter Line : ");
		String ss = sc.nextLine();
		
		System.out.println("Are u male? :");
		boolean b = sc.hasNext();
		System.out.println(b);
		
	}
}
