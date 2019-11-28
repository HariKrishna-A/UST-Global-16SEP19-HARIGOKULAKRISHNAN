package com.ustglobal.atm;

public class Test {

	public static void main(String[] args) {

		Machine m = new Machine();
		
		HDFC hdfc = new HDFC();
		m.slot(hdfc);
		
		ICICI icici = new ICICI();
		m.slot(icici);
		
		SBI sbi = new SBI();
		m.slot(sbi);

	}

}
