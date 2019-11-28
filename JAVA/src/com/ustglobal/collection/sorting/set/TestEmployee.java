package com.ustglobal.collection.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {

		
		Comparator<Employee> comp = (e1,e2) -> {
			if(e1.height > e2.height)
			{
				return 1;
			}
			else if(e1.height < e2.height) {
				return -1;
			}
			else
			{
				return 0;
			}
		};
		
		TreeSet<Employee> ts= new TreeSet<Employee>(comp);
		
		ts.add(new Employee(4, "niki", 7.6));
		ts.add(new Employee(1, "basker", 5.6));
		ts.add(new Employee(3, "ram", 6.0));
		ts.add(new Employee(2, "dinesh", 4.6));

		System.out.println("-------> Using Iterator");
		
		Iterator<Employee> it = ts.iterator();
		
		while(it.hasNext()) {
			
			Employee e = it.next();
			
			System.out.println("Name is : "+e.name);
			System.out.println("Id is : "+e.id);
			System.out.println("Height is : "+e.height);
			System.out.println("--------------------");
		}
		
		System.out.println("--------> Using for each");
		
		for (Employee employee : ts) {
			System.out.println(employee);
		}
	}

}
