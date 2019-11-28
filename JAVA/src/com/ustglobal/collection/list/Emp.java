package com.ustglobal.collection.list;

public class Emp {

	
	int id;
	String name;
	long salary;
	public Emp(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
