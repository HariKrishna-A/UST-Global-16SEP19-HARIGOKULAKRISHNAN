package com.ustglobal.collection.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestEmp {

	public static void main(String[] args) {
		
		HashSet<Emp> e1 = new HashSet<Emp>();
		
		e1.add(new Emp(12, "Sweety", 20000));
		e1.add(new Emp(12, "Sweety", 20000));
		e1.add(new Emp(10, "Teju", 10500));
		e1.add(new Emp(2, "giri", 30400));
		e1.add(new Emp(19, "Sheela", 40000));
		
		System.out.println("________Using Iterator");
		
		Iterator<Emp> e = e1.iterator();
		while(e.hasNext()) {
			Emp ee = e.next();
			System.out.println("Id is : "+ee.id);
			System.out.println("Name is : "+ee.name);
			System.out.println("Salary is : "+ee.salary);
		}
		
		System.out.println("___________using for each");
		
		for (Emp emp : e1) {
			System.out.println(emp);
		}
	}
}
