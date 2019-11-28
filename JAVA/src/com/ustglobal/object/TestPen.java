package com.ustglobal.object;

public class TestPen {

	public static void main(String[] args) {
	
		 Pen p = new Pen();
		 int pHashCode = p.hashCode();
		 System.out.println("HashCode of P : "+pHashCode);

		 Pen q = new Pen();
		 int qHashCode = q.hashCode();
		 System.out.println("HashCode of q : "+qHashCode);

	}

}
