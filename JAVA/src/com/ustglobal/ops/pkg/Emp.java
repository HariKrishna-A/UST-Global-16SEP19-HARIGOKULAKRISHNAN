package com.ustglobal.ops.pkg;

public class Emp {
		 String name ;
		 int id; 
		Emp(String ename ,int eid){
			name = name;
			id = eid;
		}
		
		void printDetails() {
			System.out.println("emp name is "+name);
			System.out.println("emp id is "+ id);
			this.sayHello();
		}
		
		void sayHello(){
			System.out.println("Hello "+name+" welcome to UST global company");
		}
	
}
