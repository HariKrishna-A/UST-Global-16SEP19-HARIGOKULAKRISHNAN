package com.ustglobal.atm;

public class HDFC implements ATMMachine{
	@Override
	public void validateCard() {
		System.out.println("HDFC validateCard..");
	}

	public void getInfo() {
		System.out.println("HDFC getInfo..");
	}

}
