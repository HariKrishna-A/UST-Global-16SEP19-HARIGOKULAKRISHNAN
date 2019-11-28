package com.ustglobal.object;

public class RemoteGetClass {

	void add() {
		System.out.println("add() method");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		RemoteGetClass r = new RemoteGetClass();
		Class c = r.getClass();
		Object o = c.newInstance();
		RemoteGetClass q = (RemoteGetClass)o;
		q.add();
	}
}
