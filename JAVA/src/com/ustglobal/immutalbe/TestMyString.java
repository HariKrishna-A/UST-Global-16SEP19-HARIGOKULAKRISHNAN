package com.ustglobal.immutalbe;

public class TestMyString {

	public static void main(String[] args) {
	
		
		MyString m1 = new MyString(23, "Krishna");
		MyString m2 = new MyString(44, "Gokula");
		
		System.out.println("hashCode : "+m1.hashCode()+" , Name : "+m1.getName()+" , RollNO : "+m1.getRollno());
		System.out.println("hashCode : "+m2.hashCode()+" , Name : "+m2.getName()+" , RollNO : "+m2.getRollno());
	}

}
