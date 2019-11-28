package com.ustglobal.ops.pkg;

public class TestStudent {

	public static void main(String[] args) {
		
		
		Student s = new Student();
        s.Student(101, "ABC", 22, 998494435, "CSE");
        s.studentDisplay();
  
		Student s2 = new Student();
        s2.Student(102, "BC", 26, 998499435, "CSE");
        s2.studentDisplay();
        
        
        
		Student s3 = new Student();
        s3.Student(103, "AB", 22, 998494555, "ECE");
        s3.studentDisplay();
        
        
        
		Student s4 = new Student();
        s4.Student(104, "AC", 21, 992494435, "CSE");
        s4.studentDisplay();
	}

}
