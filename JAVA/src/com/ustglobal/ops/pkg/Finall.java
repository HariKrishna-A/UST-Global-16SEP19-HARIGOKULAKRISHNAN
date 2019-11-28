package com.ustglobal.ops.pkg;

public class Finall {
	
	String name;
	int rollno;
	final String cname = "QSPIDERS";
	final int cid;
	
	Finall(String name,int roolno, int cid)
	{
		this.name = name;
		this.rollno = roolno;
		this.cid = cid;
	}

	final void printDetails() {
		System.out.println("Hi "+ name + " Welcome "+ cname);
	}
	
	final void printDetails(String name) {
		System.out.println("Hi "+ name + " Welcome "+ cname);
	}
}
