package com.ustglobal.object;

public class TestEmp {

	public static void main(String[] args) {
	
		Emp e = new Emp(101, "ABC", 123456789);
		
		Emp e1 = new Emp(11, "AC", 16789);
		
		Emp e2 = new Emp(101, "ABC", 123456789);

		System.out.println(e.equals(e1));
		System.out.println(e.equals(e2));
	}

}
