package com.ustglobal.singleton;

public class MySingleTon {

	private static MySingleTon instance = null;
	String s;
	
	private MySingleTon() {
	
	}
	
	
	public static MySingleTon getDbConnection() {
		if(instance == null) {
			instance = new MySingleTon();
			return instance;
		}
		else
		{
			return instance;
		}
	}
	
}
