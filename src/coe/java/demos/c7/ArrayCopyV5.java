package coe.java.demos.c7;

public class ArrayCopyV5 extends ArrayCopyV2 {
	public static void main(String[] args) {
		int a[] = {1, 2, 6, 8};
		int b[] = new int[4];
		b[0] = 0;
		b[1] = 1;
		// copy from array a starts from index 0
		// to array b starts from index 2
		// the number of copied items is 2 
		// (the last argument)
		System.arraycopy(a,0,b,2,2);
		display("Array a:", a);
		display("Array b:", b);
	}
}
