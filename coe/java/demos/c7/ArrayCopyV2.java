package coe.java.demos.c7;

public class ArrayCopyV2  {
	public static void copy(int[] from, int[] to) {
		int numItems = from.length;
		for (int i = 0; i < numItems; i++) {
			to[i] = from[i];
		}
	}
	public static void display(String m,int[] a) {
		System.out.print(m);
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8};
		int[] b = new int[a.length];
		copy(a,b);
		display("Array a:",a);
		display("Array b:",b);
		a[3] = 9;
		display("Array a:",a);
		display("Array b:",b);
	}
}
