package com.ustglobal.array;

public class Student {


	int id;
	String name;
	double Per;
	
	
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		Per = per;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Per=" + Per + "]";
	}
}
