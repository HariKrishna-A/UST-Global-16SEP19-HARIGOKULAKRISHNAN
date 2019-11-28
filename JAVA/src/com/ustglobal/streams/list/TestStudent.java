package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(5, "ZBC",22.3));
		al.add(new Student(15, "BC",35.7));
		al.add(new Student(25, "AC",99.6));
		al.add(new Student(53, "AB",88.9));
		al.add(new Student(210, "APC",12.9));
		al.add(new Student(10, "HMC",44.3));

		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudent(al);
//		h.displayPassedStudent(al);
		h.displayTopperStudent(al);
	}

}
