package com.ustglobal.ops.pkg;
public class Constructor {
	public static void main(String[] args) {

		System.out.println("main started");
		
		Emp e = new Emp("ABC", 143);
		e.printDetails();
		
		System.out.println("-------------------------------------------------");
		Person1 refPerson = new Person1("Divya", 18);
   		refPerson.printDetails();
   		
		Person1 refPerson1 = new Person1("Rashimika", 24);
		refPerson1.printDetails();
		
		Person1 refPerson2 = new Person1("chacha", 21);
		refPerson2.printDetails();
		
		System.out.println("main ended");
	}

}
