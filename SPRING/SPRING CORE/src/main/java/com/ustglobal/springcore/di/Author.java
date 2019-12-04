package com.ustglobal.springcore.di;

public class Author {

	
	
	private String aname;
	private String penName;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getPenName() {
		return penName;
	}
	public void setPenName(String penName) {
		this.penName = penName;
	}
	@Override
	public String toString() {
		return "Author [aname=" + aname + ", penName=" + penName + "]";
	}



}
