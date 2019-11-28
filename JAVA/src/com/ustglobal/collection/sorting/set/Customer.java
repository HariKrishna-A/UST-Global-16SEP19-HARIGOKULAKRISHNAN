package com.ustglobal.collection.sorting.set;

public class Customer implements Comparable<Customer> {

	String name;
	int id;
	long salary;
	public Customer(String name, int id, long salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public int compareTo(Customer o) {
		String s = this.name;
		String s1 = o.name;
		return s.compareTo(s1);
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
}
