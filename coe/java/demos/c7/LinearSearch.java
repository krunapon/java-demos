package coe.java.demos.c7;

public class LinearSearch {
	 /* Searches the array A for the integer searchN. 
	 * If searchN is not in the array, then -1 is returned. 
	 * If searchN is in the array, then return value is
	 * the first integer i that satisfies A[i] == searchN.*/
	int find(int[] a, int searchN) {
	   for (int index = 0; index < a.length; index++) {
	      if ( a[index] == searchN )
	         return index; // searchN has been found at this index!
	   }
	   // If we get this far, then searchN has not been found
	   // anywhere in the array. Return a value of -1.
	   return -1;
	}
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("LinearSearch <integer to search>");
			System.exit(1);
		}
		LinearSearch ls = new LinearSearch();
		int[] a = {7, 2, 1, 3, 8, 6};
		int search = Integer.parseInt(args[0]);
		int found = ls.find(a, search);
		if (found >= 0) {
			System.out.println(search + " is found at " + found);
		} else {
			System.out.println(search + " is not found in");
			ArrayUtil.display(a);
		}
	}

}
