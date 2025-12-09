package coe.java.demos.c7;
import java.util.*;
public class ArraySorter {
	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+ " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {23, 24, 26, 6};
		display(a);
		Arrays.sort(a); // java.util.Arrays
		display(a);
	}
}
