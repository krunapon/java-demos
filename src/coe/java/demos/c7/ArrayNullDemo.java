package coe.java.demos.c7;

public class ArrayNullDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] b = new int[3];
		Integer[] a;  // declare an array a
		// create an array using new operator
		a = new Integer[1]; 
		a[0] = 3;
		b[3] = 1;
		System.out.println(b[3]);
	}
}
