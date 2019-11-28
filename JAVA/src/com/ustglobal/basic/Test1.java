package com.ustglobal.basic;

public class Test1 {
public static void main(String[] args) {
	Cow c = new Cow();
	c.eat();
	c.sleep();
	
	c.name = "ganga";
	c.color = "Pink";
	
	System.out.println("Cow name is : "+c.name);
	System.out.println("Cow color is : "+c.color);
	
	Cow c1 = new Cow();
	c1.eat();
	c1.sleep();
	
	c1.name = "ganga1";
	c1.color = "red";
	
	System.out.println("Cow name is : "+c1.name);
	System.out.println("Cow color is : "+c1.color);	
	
	System.out.println("--------------------------PERSON--------------------------------");

	Person p = new Person();
	
	p.eat();
	p.walk();
	Person.sleep();
	
	p.name = "ABC";
	Person.color = "black";
	p.age = 101;
	
	System.out.println("Person name : "+p.name);
	System.out.println("Person color : "+Person.color);
	System.out.println("Person age : "+p.age);
	
	Person p1 = new Person();
	
	p1.eat();
	p1.walk();
	Person.sleep();
	
	p1.name = "BCA";
	Person.color = "AgainBlack";
	p1.age = 1001;
	
	System.out.println("Person name : "+p1.name);
	System.out.println("Person color : "+Person.color);
	System.out.println("Person age : "+p1.age);
}
}
