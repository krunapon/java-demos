package coe.java.demos.c7;

public class BinarySearch {
	int find(int[] a, int searchN) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int middle = (low+high)/2;
			if (a[middle] == searchN) {
				return middle; // found at the middle position
			} else if (a[middle] < searchN) {
				low = middle + 1; // search only at locations > middle
			} else if (a[middle] > searchN) {
				high = middle - 1; // search only at locations < middle
			}
		} 
		return -1; // not found
	}
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("BinarySearch <integer to search>");
			System.exit(1);
		}
		BinarySearch bs = new BinarySearch();
		int[] a = {1, 2, 3, 7, 8, 6};
		int search = Integer.parseInt(args[0]);
		int found = bs.find(a, search);
		if (found >= 0) {
			System.out.println(search + " is found at " + found);
		} else {
			System.out.println(search + " is not found in");
			ArrayUtil.display(a);
		}
	}
}


