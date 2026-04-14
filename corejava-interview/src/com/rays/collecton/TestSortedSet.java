package com.rays.collecton;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add(300);
		s.add(500);
		s.add(100);

		System.out.println(s);

		TreeSet t = new TreeSet();

		t.add(4);
		t.add(32);
		t.add(31);

		System.out.println(t);
	}
}
