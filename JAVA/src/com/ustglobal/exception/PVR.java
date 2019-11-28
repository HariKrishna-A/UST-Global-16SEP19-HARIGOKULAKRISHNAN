package com.ustglobal.exception;

public class PVR {

	void book() {
		System.out.println("PVR STR...");
		
		
		try {
			System.out.println(10 / 0);
			System.out.println("BOOKNG CONFRD");
		} catch (Exception e) {
			System.out.println("BOOKNG FAILED..");
			System.out.println(e);
			throw e;
		}
		System.out.println("PVR END...");
	}
}
