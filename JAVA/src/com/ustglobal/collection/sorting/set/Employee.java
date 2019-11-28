package com.ustglobal.collection.sorting.set;

public class Employee {

	int id;
	String name;
	double height;
	
	public Employee(int id, String name, double height) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", height=" + height + "]";
	}
	
	
}
