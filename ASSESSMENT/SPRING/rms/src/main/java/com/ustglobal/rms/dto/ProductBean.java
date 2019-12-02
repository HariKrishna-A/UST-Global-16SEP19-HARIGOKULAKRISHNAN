package com.ustglobal.rms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductBean {

	@Id
	@Column
	@GeneratedValue
	private int pid;
	@Column
	private String pname;
	@Column
	private String pqty;
	@Column
	private double price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPqty() {
		return pqty;
	}
	public void setPqty(String pqty) {
		this.pqty = pqty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
