package com.ustglobal.thread.pausing;

public class TestSleep  {

	public static void main(String[] args) {

		System.out.println("Main Sterted");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(" Sliding ");
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
 		}
		
		System.out.println("End End");
	}

}
