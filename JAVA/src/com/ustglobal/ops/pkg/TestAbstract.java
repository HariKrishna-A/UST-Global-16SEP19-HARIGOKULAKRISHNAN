package com.ustglobal.ops.pkg;

public class TestAbstract {

	public static void main(String[] args) {

		AbstractDog d = new AbstractDog();
		d.makeNoise();
		System.out.println("----------------------");
		
		AbstractCat c = new AbstractCat();
		c.makeNoise();
		System.out.println("----------------------");
		
		AbstractSnake s = new AbstractSnake();
		s.makeNoise();
		System.out.println("----------------------");
		
		AbstractLion l = new AbstractLion();
		l.makeNoise();
	}

}
