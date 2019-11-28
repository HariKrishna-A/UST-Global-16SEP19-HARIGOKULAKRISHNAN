package com.ustglobal.thread;

public class TestMyThread {

	public static void main(String[] args) {

		System.out.println("Main Start");
		
		MythreadExtendsClass t1 = new MythreadExtendsClass();
		
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main End");
	}

}
