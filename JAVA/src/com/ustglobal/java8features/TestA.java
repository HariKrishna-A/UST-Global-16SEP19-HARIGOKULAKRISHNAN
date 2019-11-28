package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
//		Predicate<Integer> p = i -> {
//			if(i%2!=0) {
//				return false;
//			}
//			else {
//				return true;
//			}
//		};
//		
//		boolean res = p.test(20);
//		System.out.println(res);

		Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(1));
	}

}
