package coe.java.demos.c7;

public class InsertionSortV1  {
	/*
	 * Precondition: itemsInArray is the number of items that are
	 *    stored in A. These items must be in increasing order
	 *    (a[0] <= a[1] <= ... <= a[itemsInArray-1]).
	 *    The array size is at least one greater than itemsInArray.
	 * Postcondition: The number of items has increased by one,
	 *    newItem has been added to the array, and all the items
	 *    in the array are still in increasing order.
	 */    
	static int insert(int[] a, int itemsInArray, int newItem) {
	   int loc = itemsInArray - 1;  // Start at the end of the array.
	   /* Move items bigger than newItem up one space;
	      Stop when a smaller item is encountered or when the
	      beginning of the array (loc == 0) is reached. */
	   while (loc >= 0 && a[loc] > newItem) {
	      a[loc + 1] = a[loc]; // Bump item from A[loc] up to loc+1.
	      loc = loc - 1;        // Go on to next location.
	   }
	   a[loc + 1] = newItem;  // Put newItem in last vacated space.
	   itemsInArray++;
	   return itemsInArray;
	}
	public static void main(String[] args) {
		final int  SIZE = 4;
		int[] a = new int[SIZE];
		a[0] = 2; a[1] = 4; a[2] = 8;
		int numItems = 3;
		numItems = insert(a,numItems,6);
		ArrayUtil.display(a);
	}
}
