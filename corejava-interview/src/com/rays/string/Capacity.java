package com.rays.string;

public class Capacity {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Mohit");
		
		System.out.println("Length = "+ sb.length());
		System.out.println("Capacity = "+ sb.capacity());
		
		System.out.println("Append = "+ sb.append("Prajapat"));
		System.out.println("Length = "+ sb.length());
		System.out.println("Capacity = "+ sb.capacity());
		
		System.out.println("Append = "+ sb.append("NisarpurMP"));
		System.out.println("Length = "+ sb.length());
		System.out.println("Capacity = "+ sb.capacity());
	}
}
