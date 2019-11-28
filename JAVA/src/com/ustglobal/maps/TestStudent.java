package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {
	
		
		student s1 = new student(101, "Divya", 33.9);
		student s2 = new student(104, "Kaviya", 53.4);
		student s3 = new student(103, "Ambika", 73.8);
		student s4 = new student(102, "Kiran", 63.88);
		student s5 = new student(106, "Giri", 53.34);
		student s6 = new student(107, "Sonu", 43.38);
		student s7 = new student(108, "dimple", 83.64);
		student s8 = new student(110, "dimple1", 61.64);

		ArrayList<student> al = new ArrayList<student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<student> al1 = new ArrayList<student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<student> al2 = new ArrayList<student>();
		al2.add(s7);
		
		HashMap<String , ArrayList<student>> hm = new HashMap();
		
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		
		
		ArrayList<student> first = hm.get("second");
		
		for (student student : first) {
			System.out.println("Id is  : "+student.id);
			System.out.println("name is  : "+student.name);
			System.out.println("percentage is  : "+student.percentage);
		}

	}

}
