package com.ustglobal.assessmentboot.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "products_info")
public class ProductsInfo {
	@Id
	@Column
	@GeneratedValue
	private int pid;
	@Column
    @NotNull(message="First name cannot be missing or empty")
	@Size(min=2, message="First name must not be less than 2 characters")
	private String name;
	@Column
	@NotNull(message="no empty")
	private String category;
	@Column
	@NotNull(message="no empty")
	private String company;
	@Column
	@NotNull(message="no empty")
	private int quantity;
	@Column
	@NotNull(message="no empty")
	private double price;
	
	@Exclude
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "productInfo")
	private List<OrderInfo> orderInfo;
	
}
