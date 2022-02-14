package coe.java.demos.c7;

public class MaxFinder  {
	public int getMax(int[] a) {
		int numItems = a.length;
		int max = a[0];
		for (int i = 1; i < numItems; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	public int getMin(int[] a) {
		int numItems = a.length;
		int min = a[0];
		for (int i = 1; i < numItems; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}
	public static void main(String[] args) {
		int[] list = { 81, 49, 9, 25, 16, 36, 4};
		MaxFinder mf = new MaxFinder();
		int max = mf.getMax(list);
		System.out.println("The maximum value is " + 
				max);
		System.out.println("The minimum value is " + 
				mf.getMin(list));
	
	}
}
