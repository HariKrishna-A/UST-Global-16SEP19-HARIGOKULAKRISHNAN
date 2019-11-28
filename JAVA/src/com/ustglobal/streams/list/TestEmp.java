package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmp {

	public static void main(String[] args) {
		
		
		ArrayList<Emp> al = new ArrayList<Emp>();
	    
		Emp e = new Emp(101, "ABC");
		Emp e1 = new Emp(13, "ZBC");
		Emp e2 = new Emp(11, "AC");
		Emp e3 = new Emp(151, "BKC");
		
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);

		Comparator<Emp> cmp = (e5,e6) -> {
			return e5.name.compareTo(e6.name);
		};
		
		
		 List<Emp> l = al.stream().sorted(cmp).collect(Collectors.toList());
		 
		 
//		 Iterator<Emp> it = l.iterator();
//		 
//		 while(it.hasNext()) {
//			 Emp emp = it.next();
//			 System.out.println(emp.name);
//			 System.out.println(emp.id);
//			 System.out.println("--------------------");
//		 }
		 
		 for (Emp emp : l) {
			System.out.println(emp);
		}
	}

}
