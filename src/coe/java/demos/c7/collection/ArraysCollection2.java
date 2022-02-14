package coe.java.demos.c7.collection;
import java.util.*;

import coe.java.demos.c7.ArrayUtil;
public class ArraysCollection2 {
	public static void main(String[] args) {
		ArrayList<Double> numbers = new ArrayList<Double>();
		numbers.add(7.7);
		numbers.add(9.9);
		numbers.add(3.3);
		numbers.add(4.4);
		numbers.add(8.8);
		System.out.println("The content is " + numbers);
		Object[] n = numbers.toArray();
		Arrays.sort(n);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		int index = Arrays.binarySearch(n,5.5);
		System.out.println("index is " + index);
	
	
	
	
	}
}
