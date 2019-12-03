package com.ustglobal.rms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Data;
import lombok.ToString.Exclude;
@Data
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
	private int pqty;
	@Column
	private double price;
	
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "product")
	private List<RetailerBean> retailer;
	
}
