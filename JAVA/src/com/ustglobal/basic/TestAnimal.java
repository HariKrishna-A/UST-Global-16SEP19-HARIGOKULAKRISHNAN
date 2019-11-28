package com.ustglobal.basic;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		
		System.out.println("--------------------------------");
		Dog d = new Dog();
		d.dog();
		d.eat();
		
		System.out.println("--------------------------------");
		
		Bark b = new Bark();
		b.bark();
		b.dog();
		b.eat();
		
		System.out.println("--------------------------------");
		
		Lion l = new Lion();
		l.lion();
		l.bark();
		l.dog();
		l.eat();
	}

}
