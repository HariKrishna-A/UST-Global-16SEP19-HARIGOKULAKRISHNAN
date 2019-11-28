package com.ustglobal.ops.pkg;

public class Instance {

	static int s ;
	int a;
	{
		s =10;
		a = 10;
		System.out.println("Non_Static_1...");
	}
	public static void main(String[] args) {
		
		System.out.println("main load..");
		
	   Instance i = new Instance();
	   System.out.println("A = "+ i.a);
	   System.out.println("S = "+ s);
	   
	   Instance i1 = new Instance();
	   System.out.println("A = "+ i.a);
	   System.out.println("S = "+ s);
		
		System.out.println("main end..");
	}
	
	{
		a = 20;
		System.out.println("Non_Static_2...");
	}
	{
		a = 30;
		s = 30;
		System.out.println("Non_Static_3...");
	}
}
