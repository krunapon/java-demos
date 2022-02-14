package coe.java.demos.c7.collection;
import coe.java.demos.c7.DynamicArrayOfInt;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 0;
		a[1] = 2;
		// a[2] = 3;
		DynamicArrayOfInt a2 = new DynamicArrayOfInt();
		a2.put(0,0);
		a2.put(1,2);
		a2.put(2,3);
		// DynamicArrayOfDouble d = new DynamicArrayOfDouble();
		// Using DynamicArrayOfDouble requires us to
		// create class DynamicArraOfDouble
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(0,0);
		a3.add(1,2);
		a3.add(2,3);
		System.out.print(a3);
		ArrayList<Double> d1 = new ArrayList<Double>();
		d1.add(0,0.2);
		d1.add(1,0.4);
		d1.add(2,0.6);
		System.out.print(d1);
	}
}
