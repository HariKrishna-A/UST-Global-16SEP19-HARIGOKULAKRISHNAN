package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmp {

	public static void main(String[] args) {
	
		
		ArrayList<Emp> empo = new ArrayList<Emp>();
		
		Emp e = new Emp(101, "ABC", 1025500);
		Emp e1 = new Emp(104, "BCA", 1085500);
		Emp e2 = new Emp(102, "ACB", 1095500);
		Emp e3 = new Emp(103, "CAB", 105500);
		
		empo.add(e);
		empo.add(e1);
		empo.add(e2);
		empo.add(e3);
		
		System.out.println("                   FOR                         ");
		
		for (int i = 0; i < empo.size(); i++) {
			Emp em = empo.get(i);
			System.out.println("Id is "+em.id);
			System.out.println("Name is "+em.name);
			System.out.println("Salary is "+em.salary);
		}
		
		System.out.println("                   FOREACH                         ");
		
		for (Emp emp : empo) {
			System.out.println(emp);
		}
	}

}
