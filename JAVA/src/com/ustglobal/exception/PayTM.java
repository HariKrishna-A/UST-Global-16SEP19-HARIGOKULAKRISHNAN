package com.ustglobal.exception;

public class PayTM {

	void book() {
		System.out.println("payTM str..");

		IRCTC i = new IRCTC();
		i.confirm();

		System.out.println("payTM end..");
	}

}
