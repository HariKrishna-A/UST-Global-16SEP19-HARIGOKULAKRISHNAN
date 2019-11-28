package com.ustglobal.basic;

public class TestStudent {

	public static void main(String[] args) {
		Student.cname = "QSPIDERS";
		Student s = new Student();
		s.name = "ABC";
		s.usn = 10;
		
		System.out.println("Name : "+s.name);
		System.out.println("ID : "+s.usn);
		System.out.println("College Name : "+Student.cname);
	}
}
