package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101, "anikitha", 23.345);
		Student s2 = new Student(102, "vijay", 99.345);
		Student s3 = new Student(101, "salman", 83.345);
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println("                   FOR                         ");
		
		for (int i = 0; i <al.size(); i++) {
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		}
		
		System.out.println("                   FOREACH                         ");
		for (Student student : al) {
			System.out.println(student);
		}
		
	}

}
