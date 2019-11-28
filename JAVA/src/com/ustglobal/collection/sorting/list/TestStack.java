package com.ustglobal.collection.sorting.list;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		
		Stack<Integer> a = new Stack<Integer>();
		a.add(12);
		a.push(23);
		
		System.out.println("Using get() ........");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("Using pop.......");
		for (int i = 0; i <=a.size(); i++) {
			System.out.println(a.pop());
		}

	}

}
