package coe.java.demos.c7;

public class SelectionSort {
	static void sort(int[] a) {
		int lastIndex = a.length -1;
		for (int lastPlace = lastIndex; lastPlace >= 1; lastPlace--) {
			int maxLoc = 0;
			for (int j = 1; j <= lastPlace; j++) {
				if (a[j] > a[maxLoc])
					maxLoc = j;
			}
			// swap to put the largest number at the end of 
			// the unsorted array
			int tmp = a[lastPlace];
			a[lastPlace] = a[maxLoc];
			a[maxLoc] = tmp;
		}
	}
	public static void main(String[] args) {
		int[] a = {7, 2, 1, 2, 8, 6};
		sort(a);
		ArrayUtil.display(a);
	}
}
