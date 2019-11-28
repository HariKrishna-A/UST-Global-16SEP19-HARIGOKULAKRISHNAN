package com.ustglobal.basic;

public class TestBranch {

	public static void main(String[] args) {
		BTM b = new BTM();
		b.swipe();
		int count = b.getCount();
		int totalCount = b.gettotalCount();
		
		System.out.println("Count is "+ count);
		System.out.println("TotalCount is "+ totalCount);
	}

}
