package com.ustglobal.array;

public class TestStudent {

	public static void main(String[] args) {
		
		
		Student s1 = new Student(101, "ABC", 56.76);
		Student s2 = new Student(102, "ACB", 66.84);
		Student s3 = new Student(103, "BCA", 64.36);
		
		Student[] st = new Student[3];
		
		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		
		for (Student student : st) {
			System.out.println(student);
			//r(student);
		}
		
		
	}
	
	static void r(Student[] sa) {
		for (Student student : sa) {
			System.out.println(student);
		}
	}
}
