package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestFunMap3 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(21);
		al.add(34);
		al.add(44);
		al.add(20);
		al.add(98);
		al.add(74);


		Comparator<Integer> cmp = (m1,m2) ->{
			if(m1>m2)
				return 1;
			else if(m1<m2)
				return -1;
			else
				return 0;
		};

		Comparator<Integer> cmpmax = (m1,m2) ->{
			if(m1>m2)
				return 1;
			else if(m1<m2)
				return -1;
			else
				return 0;
		};

		long noOfFailedStudent = al.stream().filter(i -> i< 40).count();

		System.out.println(noOfFailedStudent);

		System.out.println("----------------------------");

		Integer i =  al.stream().min(cmp).get();
		System.out.println("Min value : "+ i);

		System.out.println("----------------------------");


		Integer max = al.stream().max(cmpmax).get();
		System.out.println("Max value : "+ max);

		System.out.println("----------------------------");

	}

}
