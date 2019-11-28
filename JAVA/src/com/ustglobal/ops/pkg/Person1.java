package com.ustglobal.ops.pkg;

public class Person1 {

	
	 String name;
	 int age;
	 
	 Person1(String name, int age){
		this.name = name;
		this.age = age;
//		System.out.println("Name & Age :"+ this.name +" & "+ this.age);
	 }
	 
		void printDetails() {
			System.out.println("person name is "+name);
			System.out.println("person age is "+ age);
		}
}
