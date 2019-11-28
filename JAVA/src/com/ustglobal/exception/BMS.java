package com.ustglobal.exception;

public class BMS {

	public static void main(String[] args) {
		System.out.println("BMS STR...");
		
		PVR b = new PVR();
		
		try {
			b.book();
			System.out.println("BOOKNG CONFRD");
		} catch (Exception e) {
			System.out.println("BOOKNG FAILED..");
		}
		System.out.println("BMS END...");

	}

}
