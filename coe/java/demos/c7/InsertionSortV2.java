package coe.java.demos.c7;

public class InsertionSortV2  {
	static void insertSort(int[] a) {
		// Sort the array a into increasing order.
		int itemsSorted; // Number of items that have been sorted so far.
		for (itemsSorted = 1; itemsSorted < a.length; itemsSorted++) {
			// Assume that items a[0], a[1], ... a[itemsSorted-1]
			// have already been sorted. Insert a[itemsSorted]
			// into the sorted part of the list.
			int tmp = a[itemsSorted]; // The item to be inserted.
			int loc = itemsSorted-1;  // Start at end of list.
			while (loc >= 0 && a[loc] > tmp) {
				a[loc + 1] = a[loc]; // Bump item from A[loc] up to loc+1.
				loc = loc - 1;        // Go on to next location.
			}
			a[loc+1] = tmp;
		}
	}
	public static void main(String[] args) {
		int[] a = {7, 2, 1, 2, 8, 6};
		insertSort(a);
		ArrayUtil.display(a);
	}
}