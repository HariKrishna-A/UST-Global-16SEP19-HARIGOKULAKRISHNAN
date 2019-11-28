package com.ustglobal.basic;

public class PhoneGen extends PhoneGen1 {
	void msg() {
		System.out.println("msg()");
	}
	void call() {
		System.out.println("call()");
	}
} 


class PhoneGen1 extends PhoneGen2{
	void games() {
		System.out.println("games()");
	}
}


class PhoneGen2{
	void camera() {
		System.out.println("camera()");
	}
}




