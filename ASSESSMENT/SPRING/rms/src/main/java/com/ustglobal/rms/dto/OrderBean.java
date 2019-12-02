package com.ustglobal.rms.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class OrderBean {

	@Id
	@Column
	@GeneratedValue
	private int oid;
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
