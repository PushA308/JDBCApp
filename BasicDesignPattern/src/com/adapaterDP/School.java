package com.adapaterDP;

public class School {

	public static void main(String[] args) {
	
		
		Pen p = new PenAdapter(); 
		Assignment as = new Assignment();
		as.setP(p);
		as.writeAssignment("this is an old assignment that submited");

	}

}
