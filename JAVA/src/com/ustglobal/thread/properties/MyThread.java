package com.ustglobal.thread.properties;

public class MyThread extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		System.out.println("Current Thread : "+Thread.currentThread().getName());

		MyThread t1 = new  MyThread();
		System.out.println("MYThread Name : "+t1.getName());
		
		
		Thread.currentThread().setName("Bala");

		System.out.println(10/0);
		
		System.out.println("Main ended");
	}
}
