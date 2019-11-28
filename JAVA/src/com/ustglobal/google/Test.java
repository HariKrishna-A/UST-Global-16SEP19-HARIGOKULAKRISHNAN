package com.ustglobal.google;

public class Test {

	public static void main(String[] args) {

//		Browser b = new Browser();
//		
//		Gmail g = new Gmail();
//		b.open(g);
//		
//		GoogleDrive g1 = new GoogleDrive();
//		b.open(g1);
		
		Google g  = new Gmail();
		g.login();
		g.shareDocument();
		
		Google g1 = new GoogleDrive();
		g1.login();
		g1.shareDocument();
	}

}
