package com.ustglobal.ops.pkg;

public class TestAndroidOs {

	public static void main(String[] args) {
		
		AndroidOs a = new AndroidOs();
		a.HomeScrn();
		System.out.println("_________________________________");
		
		Sony s = new Sony();
		s.HomeScrn();
		System.out.println("_________________________________");
		
		OnePlus o = new OnePlus();
		o.HomeScrn();
		System.out.println("_________________________________");
		
		Mi m = new Mi();
		m.HomeScrn();
	}

}
