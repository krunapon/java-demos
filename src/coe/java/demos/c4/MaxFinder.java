package coe.java.demos.c4;
/**
 * This program is to find the maximum of two numbers
 */
public class MaxFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int k = max(i,j);
		int l = min(i,j);
		System.out.println("The maximum between " + i + " " + j + " "
				+ " is " + k);
		System.out.println("The minium between " + i + " " + j + " "
				+ " is " + l);
	}
	/**
	 * This method is to return the max of two integers
	 * @param num1 the first integer
	 * @param num2 the second integer
	 * @return the max of two integers
	 */
	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
	static int min(int num1, int num2) {
		if (num1 < num2)
			return num1;
		else
			return num2;
	}

}
