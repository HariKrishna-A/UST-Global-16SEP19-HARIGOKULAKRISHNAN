package com.ustglobal.collection.sorting.set;

public class Bank {

	String name;
	int pincode;
	long micr;
	public Bank(String name, int pincode, long micr) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.micr = micr;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", pincode=" + pincode + ", micr=" + micr + "]";
	}
	
	
}
