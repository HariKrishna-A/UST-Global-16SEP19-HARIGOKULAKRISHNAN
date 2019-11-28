package com.ustglobal.collection.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {

		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(12, "Dimple", 22.9);
		Student s2 = new Student(2, "Sweety", 93.49);
		Student s3 = new Student(34, "Jimmy", 77.59);
		Student s4 = new Student(5, "tummy", 92.95);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
	
		System.out.println("Before sorting.....");
		DisplayStudentDetails(al);
		Collections.sort(al);
		
		System.out.println("After sorting.....");
		DisplayStudentDetails(al);
		
	}

	static void DisplayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is : "+s.id);
			System.out.println("Name is : "+s.name);
			System.out.println("Percentage is : "+s.percentage);
			System.out.println("----------------------------------");
		}
	}
}
