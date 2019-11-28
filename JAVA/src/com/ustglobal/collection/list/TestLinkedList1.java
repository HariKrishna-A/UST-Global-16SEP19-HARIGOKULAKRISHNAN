package com.ustglobal.collection.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList1 {

	public static void main(String[] args) {

		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(12);
		l.add(24);
		l.add(4);
		
		System.out.println("Before sort "+l);
		Collections.sort(l);
		System.out.println("After sort "+l);
		
		Collections.reverse(l);
		System.out.println("Reverse "+ l);
		
		Collections.shuffle(l);
		System.out.println("Shuffle "+ l);

	}

}
