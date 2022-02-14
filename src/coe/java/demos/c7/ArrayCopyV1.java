package coe.java.demos.c7;

public class ArrayCopyV1 {
	public static void display(String msg, int[] a) {
		int numItems = a.length;
		System.out.print(msg);
		for (int i = 0; i < numItems; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8};
		int[] b = a; 
		display("Array a:",a);
		display("Array b:",b);
		a[3] = 9;
		display("Array a:",a);
		// b[3] should be 8 but it changes
		// to 9 as we changes a[3] to 9
		display("Array b:",b);
	}
}
