package com.builderDP;

public class Shop {

	public static void main(String[] args) {

		Phone p = new PhoneBuilder().setOs("android").setRam(2).setBattery(1200000).getPhone();
		
		System.out.println(p);				
		
	}

}
