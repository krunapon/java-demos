package coe.java.demos.c7;

public class ArraysSubtract {
	public void subArrays(int[] a1, int[] a2,
										int[] result) {
		int i;
		int numItems = a1.length;
		for (i = 0; i < numItems; i++) {
			result[i] = a1[i] - a2[i];
		}	
	}
	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[]	a1 = {10, 8, 6, 4, 2};
		int[]	a2 = {9, 6, 3, 1, 0};
		final int SIZE = 5;
		int[] result = new int[SIZE];
		int[] result2 = {1,2,2,0,0};
		ArraysSubtract as = new ArraysSubtract();
		as.subArrays(a1, a2, result);
		as.printArray(a1);
		as.printArray(a2);
		as.printArray(result);
		// copy some items in result to result2
		System.arraycopy(result,2,result2,3,2);
		as.printArray(result2);
		
	}

}
