package com.ustglobal.rms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class OrderBean {

	@Id
	@Column
	@GeneratedValue
	private int oid;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice_Per_Unit() {
		return price_Per_Unit;
	}
	public void setPrice_Per_Unit(double price_Per_Unit) {
		this.price_Per_Unit = price_Per_Unit;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Column
	private String pname;
	@Column
	private double price_Per_Unit;
	@Column
	private int qty;
	@Column
	private double amount;
	@Column
	private int rid;
}
