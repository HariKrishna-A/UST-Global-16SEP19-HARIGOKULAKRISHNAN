package com.ustglobal.object;

public class TestPersonClone {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		
		Person p = new Person(12, "Ravi");
		System.out.println("PersonId : "+p.id);
		System.out.println("PersonName : "+p.name);

		
		Object o = p.clone();
		
		Person p1 = (Person)o;
		System.out.println("Person_1 Id : "+p1.id);
		System.out.println("Person_1 Name : "+p1.name);
		
		p1.id  = 200;
		p1.name = "Surya";
		System.out.println("___________AfterCloning_____________");
		System.out.println("Person_1 Id : "+p1.id);
		System.out.println("Person_1 Name : "+p1.name);
		System.out.println("___________P Obj remming SAME_________");
		System.out.println("PersonId : "+p.id);
		System.out.println("PersonName : "+p.name);
	}

}
