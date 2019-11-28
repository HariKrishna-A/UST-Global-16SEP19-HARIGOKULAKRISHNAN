package com.ustglobal.ops.pkg;

public interface AutoMobile {

	
	
	int left = 10;
	public static final int right = 20;
	
	abstract public int gear();
	public void gps();
	
	
	public static void add() {
		System.out.println("Add");
	}
	
	public default void sum() {
		System.out.println("Sum");
	}
}
