package com.ustglobal.bean;

public class DataBase {

	void receive(Student s) {
		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName());
		System.out.println("Rollno is "+s.getRoolno());
	}
	
	void save(Emp e) {
		
		System.out.println();
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Rollno is "+e.getSalary());
	}
}
