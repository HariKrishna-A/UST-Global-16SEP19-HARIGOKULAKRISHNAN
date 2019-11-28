package com.ustglobal.thread.pausing;

public class TestYield {

	public static void main(String[] args) {

		System.out.println("Main Started");
		
		MyThreadYield t = new MyThreadYield();
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main End");
	}

}
