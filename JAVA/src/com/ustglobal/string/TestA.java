package com.ustglobal.string;

public class TestA {

	public static void main(String[] args) {
	
		String s1 = "aishu";
		String s2 = "deepika";
		
		String s3 = new String("aishu");
		String s4 = new String("aishu");
		String s5 = "aishu";
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s5);
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase().equalsIgnoreCase(s2.toUpperCase()));
		System.out.println(s1.charAt(3));

		
		
		System.out.println("___________StringBuffer______________");
		StringBuffer sb = new StringBuffer("Kavya");
		sb.append("ABC");
		System.out.println(sb);
	}

}
