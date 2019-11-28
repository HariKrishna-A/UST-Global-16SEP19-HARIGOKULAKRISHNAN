package com.ustglobal.object;

public class TestMethods {

	public static void main(String[] args) {
		
		System.out.println("_________________hashCode__________________");
		
		 Pen p = new Pen();
		 int pHashCode = p.hashCode();
		 System.out.println("HashCode of P : "+pHashCode);

		 Pen q = new Pen();
		 int qHashCode = q.hashCode();
		 System.out.println("HashCode of q : "+qHashCode);

		System.out.println("_________________toString__________________");
		
		Marker m = new Marker();
		String s =m.toString();
		System.out.println(s);
		
		Marker m1 = new Marker();
		
		System.out.println(m1);
		
		System.out.println("_________________Equels__________________");
		
		Cow c = new Cow(1011, "yoyo", 12345);
		
		Cow c1 = new Cow(1031, "momo", 124455);
		
		Cow c3 = new Cow(1011, "yoyo", 12345);

		Cow c4 = c;
		
		System.out.println(c.equals(c1));
		System.out.println(c.equals(c3));
		System.out.println(c.equals(c4));
	}

}
