package coe.java.demos.c7.collection;
import coe.java.demos.c7.DynamicArrayOfInt;
import java.util.*;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 2;
		a[1] = 4;
		// a[2] = 6;
		DynamicArrayOfInt a2 = new DynamicArrayOfInt();
		a2.put(0,2);
		a2.put(1,4);
		a2.put(2,6);
		//DynamicArrayOfDouble d2;
		// DynamicArrayOfString s2;
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(0,2);
		al2.add(1,4);
		al2.add(2,6);
		System.out.println(al2);
		ArrayList<Double> al3 = new ArrayList<Double>();
		al3.add(0,0.2);
		al3.add(1,0.4);
		al3.add(2,0.6);
		System.out.println(al3);
	}
}
