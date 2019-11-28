package com.ustglobal.ops.pkg;

public class AutoMobileBMW implements AutoMobileWithAbs{
	
	public int gear() {
		System.out.println("gear() method of BMW");
		return 10;
	}

	
	public void gps() {
		System.out.println("gps() methos of BMW");
	}
	
	public void abs() {
		System.out.println("With abs..BMW");
	}
}
