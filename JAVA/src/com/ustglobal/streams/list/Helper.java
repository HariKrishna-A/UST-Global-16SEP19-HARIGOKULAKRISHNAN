package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.ustglobal.maps.student;

public class Helper {

	
		void displayAllStudent(ArrayList<Student> al) {
			
		Iterator<Student> it = al.iterator();
		
		
		while(it.hasNext()) {
			Student s = it.next();
			
			System.out.println("ID is : "+s.id);
			System.out.println("Name is : "+s.name);
			System.out.println("Percentage is : "+s.percentage);
			System.out.println("____________________");
		}
	}
		
		void displayFailedStudent(ArrayList<Student> al) {
			
			List<Student> l = al.stream().filter(student -> student.percentage <40).collect(Collectors.toList());
			
			Iterator<Student> it = l.iterator();
			
			
			while(it.hasNext()) {
				Student s = it.next();
				
				System.out.println("ID is : "+s.id);
				System.out.println("Name is : "+s.name);
				System.out.println("Percentage is : "+s.percentage);
				System.out.println("_________Failed___________");
		}
		}
		
void displayPassedStudent(ArrayList<Student> al) {
			
			List<Student> lp = al.stream().filter(student -> student.percentage >40).collect(Collectors.toList());
			
			Iterator<Student> it = lp.iterator();
			
			
			while(it.hasNext()) {
				Student s = it.next();
				
				System.out.println("ID is : "+s.id);
				System.out.println("Name is : "+s.name);
				System.out.println("Percentage is : "+s.percentage);
				System.out.println("_________Passed___________");
		}
		}

Comparator<Student> cmpmax = (m1,m2) ->{
	if(m1.percentage>m2.percentage)
		return 1;
	else if(m1.percentage<m2.percentage)
		return -1;
	else
		return 0;
};

void displayTopperStudent(ArrayList<Student> al) {
	
	
	
	Student max = al.stream().max(cmpmax).get();
	System.out.println("Max value : "+ max.name);
	System.out.println("Max value : "+ max.id);
	System.out.println("Max value : "+ max.percentage);
		
}
}
