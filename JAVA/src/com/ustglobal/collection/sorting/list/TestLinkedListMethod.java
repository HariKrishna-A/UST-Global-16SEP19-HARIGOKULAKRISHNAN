package com.ustglobal.collection.sorting.list;

import java.util.LinkedList;

public class TestLinkedListMethod {

	public static void main(String[] args) {
	
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(41);
		l.add(23);
		l.add(34);
		
		Integer peekElement = l.peek();
		System.out.println("Peek Element "+peekElement);
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek Frist Element "+peekFirstElement);
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek Last Element "+peekLastElement);
		
		System.out.println("After peek ------------> "+l);

		Integer pollElement = l.poll();
		System.out.println("poll Element "+pollElement);
		Integer pollFirstElement = l.pollFirst();
		System.out.println("poll Frist Element "+pollFirstElement);
		Integer pollLastElement = l.pollLast();
		System.out.println("poll Last Element "+pollLastElement);
		System.out.println("After poll ------------> "+l);
		
		
		
		l.push(123456);
		l.push(12);
		System.out.println("After push --------> "+l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After pop ---------> "+l);
	}

}
