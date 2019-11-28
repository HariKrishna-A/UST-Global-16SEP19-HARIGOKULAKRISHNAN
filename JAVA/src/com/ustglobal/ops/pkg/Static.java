package com.ustglobal.ops.pkg;

public class Static {

	
	static int a ;
	
	Static(){
		System.out.println("Constructor.");
	}
	static {
		
		a = 100;
		System.out.println("1st static block");
	}
	public static void main(String[] args) {
		
		Static s = new Static();
		Static s1 = new Static();
		System.out.println("A = "+ a);

	}

	static {
		a = 200;
		System.out.println("2st static block");
	}
	
	static {
		a = 500;
		System.out.println("3st static block");
	}
}
