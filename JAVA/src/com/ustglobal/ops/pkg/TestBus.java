package com.ustglobal.ops.pkg;

public class TestBus {

	public static void main(String[] args) {
		
		
		BusThisS b = new BusThisS();
		b.getDetails();

		BusThisS b1 = new BusThisS(50);
		b1.getDetails();
		
		BusThisS b2 = new BusThisS(60, "Blue");
		b2.getDetails();
	}

}
