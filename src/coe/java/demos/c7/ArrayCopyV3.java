package coe.java.demos.c7;

public class ArrayCopyV3 extends ArrayCopyV2 {
	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8};
		int[] b = new int[a.length];
		// Copy from array a starting at index 0
		// to array b starting at index 0 
		// in a.length items
		System.arraycopy(a,0,b,0,a.length);
		display("Array a:",a);
		display("Array b:",b);
		a[3] = 9;
		display("Array a:",a);
		display("Array b:",b);
	}
}
