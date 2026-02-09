package com.rays.oop;

public class ConstructorCalling {

	public String fName;
	public String lName;
	public String address;
	
	public ConstructorCalling(String fName, String lName, String address ) {
		
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(address);
		
		
	}
}
