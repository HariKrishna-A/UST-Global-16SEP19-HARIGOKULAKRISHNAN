package com.ustglobal.ops.pkg;

public class Student {


	int rollno;
	String name;
	String branch;
	int age;
	long phneno;


	 void Student(int rollno, String name,  int age, long phneno , String branch) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.phneno = phneno;
		this.branch = branch;
	}
	 

	
	void studentDisplay() {
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollno);
		System.out.println("Age : "+name);
		System.out.println("Branch : "+name);
		System.out.println("PhneNo : "+name);
	}
}
