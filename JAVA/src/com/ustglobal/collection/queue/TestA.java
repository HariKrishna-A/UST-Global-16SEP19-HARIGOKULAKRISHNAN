package com.ustglobal.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

import com.ustglobal.collection.sorting.set.Customer;

public class TestA {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(2);
		pq.add(1);
		pq.add(42);
		pq.add("Hello"); // ClassCastExcetion
		pq.add(null); //NullPointerExcetion
		pq.offer(11);
		
		System.out.println("____________> Using iterator");
		Iterator< Customer> it = pq.iterator();
		while(it.hasNext()) {
					
			System.out.println(pq.poll());
			
			System.out.println("After Poll "+pq);
		}

	}

}
