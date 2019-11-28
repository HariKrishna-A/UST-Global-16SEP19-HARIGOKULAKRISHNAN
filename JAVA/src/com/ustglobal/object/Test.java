package com.ustglobal.object;

public class Test {

	public static void main(String[] args) {

		PenDrive p = new PenDrive();
		USBPort.connect(p);
		
		Mouse m = new Mouse();
		USBPort.connect(m);
	
		
		
	}

}
