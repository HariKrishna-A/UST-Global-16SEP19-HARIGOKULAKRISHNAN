package com.ustglobal.ops.pkg;

public class TestAutoMobile {

	public static void main(String[] args) {

		AutoMobile a;
		
		AutoMobileBMW b = new AutoMobileBMW();
		b.gear();
		b.gps();
		b.abs();
		System.out.println("_______________________");

		AutoMobileToyota t = new AutoMobileToyota();
		t.gear();
		t.gps();
	}

}
