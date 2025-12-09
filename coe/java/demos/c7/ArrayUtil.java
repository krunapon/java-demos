package coe.java.demos.c7;

public class ArrayUtil {
	public static void display(int[] a) {
		int numItems = a.length;
		for (int i = 0; i < numItems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void display(double[] a) {
		int numItems = a.length;
		for (int i = 0; i < numItems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
