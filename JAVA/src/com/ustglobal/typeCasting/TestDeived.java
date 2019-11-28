package com.ustglobal.typeCasting;

public class TestDeived {

	public static void main(String[] args) {
      
		DerivedPen p = new DerivedMarker();
		System.out.println(p.cost);            ///Upcasting
		p.write();
		
		DerivedMarker m = (DerivedMarker)p;      ///Downcasting
		System.out.println(m.size);
		m.color();
		m.write();
	}
}
