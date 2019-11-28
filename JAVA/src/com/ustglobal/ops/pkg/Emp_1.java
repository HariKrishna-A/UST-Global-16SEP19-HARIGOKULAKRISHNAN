package com.ustglobal.ops.pkg;

public class Emp_1 {

	
	String name;
	int eid;
	long aadharNo;
	
	Emp_1(String name, int eid,long aadharNo){
		this.name = name;
		this.eid = eid;
		this.aadharNo = aadharNo;
	}
	
	
	Emp_1(String name, int eid){
		this.name = name;
		this.eid = eid;
	}
	
	
	void printEmp() {
		System.out.println("Hai "+name+" Welcome to UST Global");
	}
}
