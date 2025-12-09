package coe.java.demos.c7.collection;
import java.util.*;
public class ArraysCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> b = new ArrayList<Double>();
		b.add(9.9);
		b.add(5.4);
		b.add(7.8);
		b.add(3.8);
		b.add(8.9);
		System.out.println("The content of the array is " + b);
		Object[] a = b.toArray();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int index = Arrays.binarySearch(a, 7.8);
		System.out.println("index is " + index);
	}

}
