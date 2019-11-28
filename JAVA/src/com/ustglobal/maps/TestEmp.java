package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmp {

	public static void main(String[] args) {
	
		
		Emp e1 = new Emp(11, "ABC", 522436);
		Emp e2 = new Emp(12, "BC", 600436);
		Emp e3 = new Emp(13, "AC", 700436);
		Emp e4 = new Emp(14, "AB", 500436);
		Emp e5 = new Emp(16, "DBC", 630436);
		Emp e6 = new Emp(71, "ZBC", 205436);
		Emp e7 = new Emp(81, "PBC", 3605436);
		Emp e8 = new Emp(91, "CEC", 800436);
		

		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Emp> al1 = new ArrayList<Emp>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Emp> al2 = new ArrayList<Emp>();
		al2.add(e7);
		al2.add(e8);
		
		HashMap<Integer , ArrayList<Emp>> hm = new HashMap();
		
		hm.put(1,al);
		hm.put(2,al1);
		hm.put(3,al2);
		
		
		ArrayList<Emp> first = hm.get(1);
		
		for (Emp e : first) {
			System.out.println("Id is  : "+e.id);
			System.out.println("Name is  : "+e.name);
			System.out.println("Salary is  : "+e.salary);
		}

	}

}
