package com.ustglobal.thread;

public class TestMyRunnable {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
	}

}
