package com.phone;

public class FactoryMain {

	public static void main(String[] args) {
		
		OSFactory osf = new OSFactory();
		
		OS obj = osf.getInstance("dsafd");
		
		obj.show();

	}

}
