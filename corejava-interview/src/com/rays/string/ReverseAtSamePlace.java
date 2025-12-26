package com.rays.string;

public class ReverseAtSamePlace {

	public static void main(String[] args) {

		String s = "Mohit Prajapat";

		String[] a = s.split(" ");

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a.length);
		

		for (int i = 0; i < a.length; i++) {
//			if(i == 0) {
			for (int j = a[i].length() - 1; j >= 0; j--) {
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
//			System.out.println(a[1]);
//		}
		}
		
	}
}
