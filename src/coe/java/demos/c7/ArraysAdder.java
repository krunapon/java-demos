package coe.java.demos.c7;

public class ArraysAdder {
	public void addArrays(int[] a1, int[] a2, int[] sum) {
		for (int i = 0; i < a1.length; i++) {
			sum[i] = a1[i] + a2[i];
		}
	}

	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "  ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1, a2, sum;
		final int SIZE = 4;
		a1 = new int[] {2, 4, 6, 8};
		a2 = new int[] {3, 6, 9, 12};
		sum = new int[SIZE];
		ArraysAdder aa = new ArraysAdder();
		aa.addArrays(a1, a2, sum);
		aa.printArray(a1);
		aa.printArray(a2);
		aa.printArray(sum);
		int[] sum2 = new int[] {0,1,0,0};
		// copy sum to sum2 
		System.arraycopy(sum,1, sum2, 2, 2);
		aa.printArray(sum2);
	}

}
