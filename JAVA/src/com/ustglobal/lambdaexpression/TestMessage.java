package com.ustglobal.lambdaexpression;

public class TestMessage {

	public static void main(String[] args) {
		
		Message m = str->str;
		String m1 = m.msge("hello");
		String m2 = m.msge("Message");
		System.out.println(m1+" "+m2);
	}

}
