package coe.java.demos.c7;

public class ArrayFinderDemo2 {
	public static int find(int[] a, int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 8};
		System.out.print(find(a,4));
		System.out.print(find(a,3));
	}
}
