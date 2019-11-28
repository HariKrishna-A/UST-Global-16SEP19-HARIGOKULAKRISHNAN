package com.ustglobal.collection.list;

import java.util.ArrayList;

public class TestTeacher {

	public static void main(String[] args) {
		
		ArrayList<Teacher> at = new ArrayList<Teacher>();
		
		Teacher t = new Teacher(1, "ABC");
		Teacher t2 = new Teacher(2, "CAB");
		Teacher t3 = new Teacher(3, "BAC");
		Teacher t4 = new Teacher(4, "ACB");

		at.add(t);
		at.add(t4);
		at.add(t2);
		at.add(t3);
		
		System.out.println("                   FOR                         ");
		
		for (int i = 0; i <at.size(); i++) {
			Teacher s = at.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
		}
		
		System.out.println("                   FOREACH                         ");
		for (Teacher techr : at) {
			System.out.println(techr);
		}
		
	}

}
