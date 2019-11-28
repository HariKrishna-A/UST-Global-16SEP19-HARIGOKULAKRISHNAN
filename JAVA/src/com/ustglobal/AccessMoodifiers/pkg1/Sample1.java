package com.ustglobal.AccessMoodifiers.pkg1;

import com.ustglobal.AccessMoodifiers.pkg2.Demo1;

public class Sample1 extends Demo1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		
		Sample1 s = new Sample1();
		
		//default
//		System.out.println(s.b);
//		s.sub();
		//Protected
		System.out.println(s.c);
		s.mul();
		//public
		System.out.println(s.name);
//		s.div();
	} 
}
