package coe.java.demos.c7.collection;

import java.util.*;

public class SetDemo2 {
	public static void main(String[] args) {
		// Set is an interface
		// Set<Integer> s;
		// HashSet is a class that implements
		// interface Set
		HashSet<Integer> s; // declare
		s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(1);
		System.out.print(s);
	}
}
