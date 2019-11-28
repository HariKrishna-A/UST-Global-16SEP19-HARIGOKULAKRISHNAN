package com.ustglobal.collection.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomer {

	public static void main(String[] args) {
		TreeSet<Customer> tc = new TreeSet<Customer>();
		
		tc.add(new Customer("BCA", 26, 566));
		tc.add(new Customer("ABA", 62, 14566));
		tc.add(new Customer("DCA", 32, 234566));
		tc.add(new Customer("BCA", 26, 566));
		tc.add(new Customer("CBA", 22, 34566));
		
		
		
		System.out.println("____________> Using iterator");
		Iterator< Customer> it = tc.iterator();
		while(it.hasNext()) {
			Customer b = it.next();
			
			System.out.println("Name is "+b.name);
			System.out.println("Id is "+b.id);
			System.out.println("Salary is "+b.salary);
			System.out.println("________________________");
		}
		
		System.out.println("---------------> Using for each");
		
		for (Customer c: tc) {
			System.out.println(c);
		}
	}
}
