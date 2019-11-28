package com.ustglobal.exception.customisedcheckedexception;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
	
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter a age");
			int age = sc.nextInt();
			System.out.println(age);
			try {
				System.out.println(age / 0);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("finally executed");
			}
		}

	}

}
