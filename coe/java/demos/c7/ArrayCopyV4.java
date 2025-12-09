package coe.java.demos.c7;

public class ArrayCopyV4 {
	public static void display(String s, int[] a) {
		System.out.print(s);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {1, 3, 6, 8};
		int[] b = new int[a.length];
		b[0] = 0;
		b[1] = 1;
		// copy from array a starts from index 0
		// to array b starts from index 2
		// number of copied items = 2
		System.arraycopy(a,0,b,2,2);
		display("Array a:",a);
		display("Array b:",b);
	}
}
