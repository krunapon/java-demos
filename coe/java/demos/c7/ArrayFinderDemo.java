package coe.java.demos.c7;

public class ArrayFinderDemo {
	// a is an array that you want to search a number
	// item is a number that you want to search/find
	public static int find(int[] a, int item) {
		for (int i = 0; i < a.length; i++) {
			// check each element array
			// whether it's equal to the searched number
			if (item == a[i])
				return i; // return the index or position
		}
		return -1;	// cannot find it in all elements
	}
	                            
	public static void main(String[] args) {
		int a[] = {1, 2, 4, 6};
		System.out.println(find(a,4));
		System.out.println(find(a,3));
	}
}
