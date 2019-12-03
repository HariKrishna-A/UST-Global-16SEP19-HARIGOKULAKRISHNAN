package com.ustglobal.rms.dto;

import java.util.Date;
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


@Data
@Entity
@Table(name = "retailer")
public class RetailerBean {

	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@Column(length = 17)
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String Gender;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="order",joinColumns = @JoinColumn(name= "id"),
	inverseJoinColumns = @JoinColumn(name="pid"))
	private List<ProductBean> product;
	
}
