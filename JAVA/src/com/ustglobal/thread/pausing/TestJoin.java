package com.ustglobal.thread.pausing;

public class TestJoin {

	public static void main(String[] args) {

		
		System.out.println("M_Started");
		
		MyJoinThread t = new MyJoinThread();
		t.start();
		
		try {
			t.join(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("M_Thread");
		}
		
		System.out.println("M_End");
	}

}
