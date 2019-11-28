package com.ustglobal.hasarelation;

public class TestWeak {

public static void main(String[] args) {
	
	Person p = new Person();
	System.out.println(p.name);
	p.sleep();
	p.eat();
	System.out.println("----------------");
	p.m.write();         // HAS A RELATION
}
}
