package com.rays.collecton;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add('a');
		list.add('b');
		list.add('c');
		
//		list.clear();
		list.remove(1);
		
		list.add(1, "hii");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		System.out.println(list.contains('a'));
	}
}
