package com.ustglobal.empapp.dto;

public class EmployeeBean {

	private int id;
	private String name;
	private int sal;
	private String genter;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getGenter() {
		return genter;
	}
	public void setGenter(String genter) {
		this.genter = genter;
	}
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", sal=" + sal + ", genter=" + genter + "]";
	}

}
