package com.ustglobal.ops.pkg;

public class TestConstructorOverloading {

	public static void main(String[] args) {
		
		
		Emp_1 e = new Emp_1("Krishna", 101, 1234533333);
		e.printEmp();
		
		Emp_1 e1 = new Emp_1("Gokul", 102);
		e1.printEmp();
	}

}
