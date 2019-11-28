package com.ustglobal.bean;

public class TestA {

	public static void main(String[] args) {
	
		Student s = new Student();
		s.setId(12);
		s.setName("Shivagami");
		s.setRoolno(134);
		
		DataBase db = new DataBase();
		db.receive(s);
		
		
		Emp e = new Emp();
		e.setId(111);
		e.setName("Ram");
		e.setSalary(1298765);
		
		db.save(e);
	}

}
