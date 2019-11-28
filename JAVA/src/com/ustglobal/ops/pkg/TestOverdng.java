package com.ustglobal.ops.pkg;

public class TestOverdng {

	public static void main(String[] args) {
		
		MethodOverriding ms = new MethodOverriding();
		ms.count();
		
		System.out.println("----------------------------------------------");
		
		MethodOverridingSubclass msub = new MethodOverridingSubclass();
		msub.count();
		msub.add();
		
		System.out.println("----------------------------------------------");
		MethodOverriding ms1 = new MethodOverridingSubclass();
		ms1.count();
		
		System.out.println("----------------------------------------------");
		//MethodOverridingSubclass msub1 = new MethodOverriding();
	}
}
