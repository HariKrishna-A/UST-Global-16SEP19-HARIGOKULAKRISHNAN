package com.ustglobal.collection.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {

	public static void main(String[] args) {
//
//		SortByName sb = new SortByName();
//		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		
//		SortByPincode sp = new SortByPincode();
//		TreeSet<Bank> ts = new TreeSet<Bank>(sp);
		
		SortByMicr sm = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		
		ts.add(new Bank("HDFC", 123654, 12584697));
		ts.add(new Bank("SBI", 653558, 5869723));
		ts.add(new Bank("CITI", 75865, 2356469));
		ts.add(new Bank("CANARA", 5295365, 14565846));
		ts.add(new Bank("CANARA", 5295365, 14565846));

		
		System.out.println("____________> Using iterator");
		Iterator< Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("________________________");
		}
		
		System.out.println("---------------> Using for each");
		
		for (Bank bank : ts) {
			System.out.println(bank);
		}
	}

}
