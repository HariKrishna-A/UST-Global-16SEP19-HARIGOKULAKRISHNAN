package com.ustglobal.thread.properties;

public class MyIdPriorityThread  extends Thread{

	public static void main(String[] args) {

		System.out.println("Main Started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdPriorityThread mi = new MyIdPriorityThread();
		System.out.println("MyID Thread : "+ mi.getId());
		
		System.out.println("Priority "+Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(77); IllegalArgumentExcecption
		
		
		System.out.println("Main End");
	}

}
