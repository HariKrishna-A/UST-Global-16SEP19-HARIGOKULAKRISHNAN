package com.ustglobal.maps;

import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {
	
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(500,"ajay");
		ht.put(102,"vijay");
		ht.put(100,"sonu");
		ht.put(99,"monu");
		ht.put(99,"sriram");
//		ht.put(null,"krihna");
//		ht.put(110,null);       NullPoniterExcetion for both KEY nd VALUES
		
		
		
		
		System.out.println("Data : "+ht);

	}

}
