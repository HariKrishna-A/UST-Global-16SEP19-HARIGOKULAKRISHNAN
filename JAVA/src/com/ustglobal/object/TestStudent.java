package com.ustglobal.object;

public class TestStudent {

	public static void main(String[] args) {
	
		Student s = new Student(101, "ABC",49.99);
		
		int h = s.hashCode();
		System.out.println("Ovrrng hashCode() : "+ h);

		String str = s.toString();
		System.out.println("Ovrrng toString() : "+ s);
	}

}
