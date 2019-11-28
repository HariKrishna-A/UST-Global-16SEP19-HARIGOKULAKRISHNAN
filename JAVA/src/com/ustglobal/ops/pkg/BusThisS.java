package com.ustglobal.ops.pkg;

public class BusThisS {
	int seats;
	String color;
	
	
	BusThisS(int seats, String color){
		this.seats = seats;
		this.color = color;
	}
	
	public BusThisS() {
	this(40);
	}
	
	BusThisS(int seats){
		this(seats,"Red");
	}
	
	void getDetails() {
		System.out.println("Welcome to redBus,bus seat capacity is "+ seats);
	}
}
