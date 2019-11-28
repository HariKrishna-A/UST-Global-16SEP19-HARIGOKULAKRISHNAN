package com.ustglobal.object;

public class USBPort {
	
	public static void connect(Object obj) {
		
		if (obj instanceof PenDrive) {
			
			PenDrive p = (PenDrive) obj;
//			PenDrive p = new PenDrive();
	
			p.read();
			p.write();	
		}
		
		else if (obj instanceof Mouse)  {
			Mouse m = (Mouse) obj;
			m.click();
			m.scroll();
		}
		else {
			System.out.println("INVALID");
		}
	}

}
