package coe.java.demos.c4;
/**
 * This program is to find the maximum of two numbers
 */

public class MaxFinder {
	
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int k = max(i,j);
		System.out.println("The maximum between " + i + " " + j + " "
				+ " is " + k);
	}
	public static int max(int x, int y) {
		/*if (x > y)
			return x;
		else
			return y; */
		return (x > y)? x: y;

	}
}
